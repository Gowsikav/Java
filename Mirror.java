class Mirror 
{
    String brand;
    String shape;
    String frameMaterial;
    String reflectionQuality;
    int height;
    int width;
    double weight;
    boolean isAntiFog;
    boolean isWallMounted;
    boolean hasLighting;
    String glassType;
    String frameColor;
    int thickness;
    boolean isShatterproof;
    boolean isScratchResistant;
    String usage;
    String countryOfOrigin;
    double price;
    String modelNumber;
    String manufacturer;

    Mirror(String brand, String shape, String frameMaterial, String reflectionQuality, int height, int width, double weight,
           boolean isAntiFog, boolean isWallMounted, boolean hasLighting, String glassType, String frameColor,
           int thickness, boolean isShatterproof, boolean isScratchResistant, String usage, String countryOfOrigin,
           double price, String modelNumber, String manufacturer) 
    {
        this.brand = brand;
        this.shape = shape;
        this.frameMaterial = frameMaterial;
        this.reflectionQuality = reflectionQuality;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.isAntiFog = isAntiFog;
        this.isWallMounted = isWallMounted;
        this.hasLighting = hasLighting;
        this.glassType = glassType;
        this.frameColor = frameColor;
        this.thickness = thickness;
        this.isShatterproof = isShatterproof;
        this.isScratchResistant = isScratchResistant;
        this.usage = usage;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.modelNumber = modelNumber;
        this.manufacturer = manufacturer;
    }
}
