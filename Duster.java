class Duster 
{
    String brand;
    String type;
    String material;
    String color;
    int length;
    boolean isReusable;
    boolean isWashable;
    String handleMaterial;
    boolean hasExtendableHandle;
    boolean isSoft;
    boolean isForCar;
    boolean isForHome;
    String weight;
    String countryOfOrigin;
    int price;
    String usage;
    boolean isEcoFriendly;
    String shape;
    String warranty;
    int productionYear;

    Duster(String brand, String type, String material, String color, int length, boolean isReusable,
           boolean isWashable, String handleMaterial, boolean hasExtendableHandle, boolean isSoft,
           boolean isForCar, boolean isForHome, String weight, String countryOfOrigin, int price,
           String usage, boolean isEcoFriendly, String shape, String warranty, int productionYear) 
    {
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.length = length;
        this.isReusable = isReusable;
        this.isWashable = isWashable;
        this.handleMaterial = handleMaterial;
        this.hasExtendableHandle = hasExtendableHandle;
        this.isSoft = isSoft;
        this.isForCar = isForCar;
        this.isForHome = isForHome;
        this.weight = weight;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.usage = usage;
        this.isEcoFriendly = isEcoFriendly;
        this.shape = shape;
        this.warranty = warranty;
        this.productionYear = productionYear;
    }
}
