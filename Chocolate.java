class Chocolate 
{
    String brand;
    String name;
    double weight;
    double price;
    String flavor;
    boolean hasNuts;
    boolean isDarkChocolate;
    double cocoaPercentage;
    boolean isSugarFree;
    String countryOfOrigin;
    boolean hasCaramel;
    boolean hasFilling;
    String fillingType;
    int shelfLife;
    String packagingType;
    boolean isOrganic;
    boolean isVegan;
    boolean hasMilk;
    boolean isGlutenFree;
    String manufacturer;

    Chocolate(String brand, String name, double weight, double price, String flavor, boolean hasNuts, 
              boolean isDarkChocolate, double cocoaPercentage, boolean isSugarFree, String countryOfOrigin, 
              boolean hasCaramel, boolean hasFilling, String fillingType, int shelfLife, String packagingType, 
              boolean isOrganic, boolean isVegan, boolean hasMilk, boolean isGlutenFree, String manufacturer) 
              {
        this.brand = brand;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.flavor = flavor;
        this.hasNuts = hasNuts;
        this.isDarkChocolate = isDarkChocolate;
        this.cocoaPercentage = cocoaPercentage;
        this.isSugarFree = isSugarFree;
        this.countryOfOrigin = countryOfOrigin;
        this.hasCaramel = hasCaramel;
        this.hasFilling = hasFilling;
        this.fillingType = fillingType;
        this.shelfLife = shelfLife;
        this.packagingType = packagingType;
        this.isOrganic = isOrganic;
        this.isVegan = isVegan;
        this.hasMilk = hasMilk;
        this.isGlutenFree = isGlutenFree;
        this.manufacturer = manufacturer;
    }
}
