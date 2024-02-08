import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
@Mod(modid = ModTut.MODID, name = ModTut.MODNAME, version = ModTut.MODVERSION, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true)
public class ModTut {

    public static final String MODID = "pexcraft";
    public static final String MODNAME = "PexCraft";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "mcjty.modtut.proxy.ClientProxy", serverSide = "mcjty.modtut.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ModTut instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    @Mod.EventBusSubscriber
    public class CommonProxy {
        public void preInit(FMLPreInitializationEvent e) {
        }

        public void init(FMLInitializationEvent e) {
        }

        public void postInit(FMLPostInitializationEvent e) {
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
        }
    }
    @Mod.EventBusSubscriber(Side.CLIENT)
    public class ClientProxy extends CommonProxy {
        @Override
        public void preInit(FMLPreInitializationEvent e) {
            super.preInit(e);
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
        }
    }

    public class ServerProxy extends CommonProxy {

    }

}