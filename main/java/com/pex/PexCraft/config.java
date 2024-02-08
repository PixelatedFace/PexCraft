public class config {
    private static final String CATEGORY_GENERAL = "general";
    private static final String CATEGORY_DIMENSIONS = "dimensions";

    public static void readConfig() {
        try {
            cfg.load();
            initGeneralConfig(cfg)
            initDimensionConfig(cfg)
        } catch (Exception e1) {
            PexCraft.logger.log(Level.ERROR, "Problem loading config file", e1)
        } finally {
            if (cfg.hasChanged()) {
                cfg.save()
            }
        }
    }
}