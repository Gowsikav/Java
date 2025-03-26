class PaintBrush 
{
    String brand;
    String type;
    String bristleMaterial;
    String handleMaterial;
    String color;
    int size;
    boolean isWashable;
    boolean isForOilPaints;
    boolean isForWatercolors;
    boolean hasGrip;
    double weight;
    double length;
    int durability;
    String usageType;
    String countryOfOrigin;
    boolean isEcoFriendly;
    double price;
    boolean isSynthetic;
    String ferruleMaterial;
    boolean hasProtectiveCover;

    PaintBrush(String brand, String type, String bristleMaterial, String handleMaterial, String color, int size, 
               boolean isWashable, boolean isForOilPaints, boolean isForWatercolors, boolean hasGrip, 
               double weight, double length, int durability, String usageType, String countryOfOrigin, 
               boolean isEcoFriendly, double price, boolean isSynthetic, String ferruleMaterial, 
               boolean hasProtectiveCover) 
               {
        this.brand = brand;
        this.type = type;
        this.bristleMaterial = bristleMaterial;
        this.handleMaterial = handleMaterial;
        this.color = color;
        this.size = size;
        this.isWashable = isWashable;
        this.isForOilPaints = isForOilPaints;
        this.isForWatercolors = isForWatercolors;
        this.hasGrip = hasGrip;
        this.weight = weight;
        this.length = length;
        this.durability = durability;
        this.usageType = usageType;
        this.countryOfOrigin = countryOfOrigin;
        this.isEcoFriendly = isEcoFriendly;
        this.price = price;
        this.isSynthetic = isSynthetic;
        this.ferruleMaterial = ferruleMaterial;
        this.hasProtectiveCover = hasProtectiveCover;
    }
}
