class Zip 
{
    String brand;
    String type;
    String material;
    String color;
    double length;
    boolean isWaterResistant;
    boolean isAutoLock;
    boolean isTwoWay;
    boolean isRustProof;
    int teethCount;
    String sliderMaterial;
    String usageType;
    String countryOfOrigin;
    double price;
    boolean isHeavyDuty;
    int durability;
    boolean isInvisible;
    String stitchingPattern;
    boolean isCustomizable;
    boolean hasPullTab;

    Zip(String brand, String type, String material, String color, double length, boolean isWaterResistant, 
        boolean isAutoLock, boolean isTwoWay, boolean isRustProof, int teethCount, String sliderMaterial, 
        String usageType, String countryOfOrigin, double price, boolean isHeavyDuty, int durability, 
        boolean isInvisible, String stitchingPattern, boolean isCustomizable, boolean hasPullTab) 
        {
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.length = length;
        this.isWaterResistant = isWaterResistant;
        this.isAutoLock = isAutoLock;
        this.isTwoWay = isTwoWay;
        this.isRustProof = isRustProof;
        this.teethCount = teethCount;
        this.sliderMaterial = sliderMaterial;
        this.usageType = usageType;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isHeavyDuty = isHeavyDuty;
        this.durability = durability;
        this.isInvisible = isInvisible;
        this.stitchingPattern = stitchingPattern;
        this.isCustomizable = isCustomizable;
        this.hasPullTab = hasPullTab;
    }
}
