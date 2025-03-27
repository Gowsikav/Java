class Bulb 
{
    String brand;
    int wattage;
    String type;
    String color;
    boolean isSmart;
    int lifespan;
    double price;
    String shape;
    boolean isDimmable;
    String baseType;
    boolean isEnergyEfficient;

    Bulb() {
        System.out.println("No argument Constructor");
    }

    Bulb(String brand) {
        this.brand = brand;
    }

    Bulb(String brand, int wattage) {
        this(brand);
        this.wattage = wattage;
    }

    Bulb(String brand, int wattage, String type) {
        this(brand, wattage);
        this.type = type;
    }

    Bulb(String brand, int wattage, String type, String color) {
        this(brand, wattage, type);
        this.color = color;
    }

    Bulb(String brand, int wattage, String type, String color, boolean isSmart) {
        this(brand, wattage, type, color);
        this.isSmart = isSmart;
    }

    Bulb(String brand, int wattage, String type, String color, boolean isSmart, int lifespan) 
    {
        this(brand, wattage, type, color, isSmart);
        this.lifespan = lifespan;
    }

    Bulb(String brand, int wattage, String type, String color, boolean isSmart, int lifespan, 
        double price)
         {
        this(brand, wattage, type, color, isSmart, lifespan);
        this.price = price;
    }

    Bulb(String brand, int wattage, String type, String color, boolean isSmart, int lifespan, 
        double price, String shape) 
    {
        this(brand, wattage, type, color, isSmart, lifespan, price);
        this.shape = shape;
    }

    Bulb(String brand, int wattage, String type, String color, boolean isSmart, int lifespan, 
        double price, String shape, boolean isDimmable)
         {
        this(brand, wattage, type, color, isSmart, lifespan, price, shape);
        this.isDimmable = isDimmable;
    }

    Bulb(String brand, int wattage, String type, String color, boolean isSmart, int lifespan, 
        double price, String shape, boolean isDimmable, String baseType, boolean isEnergyEfficient) 
    {
        this(brand, wattage, type, color, isSmart, lifespan, price, shape, isDimmable);
        this.baseType = baseType;
        this.isEnergyEfficient = isEnergyEfficient;
    }

    void info() 
    {
        System.out.println("\nBulb Details:");
        System.out.println("Brand: " + this.brand);
        System.out.println("Wattage: " + this.wattage);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Is Smart: " + this.isSmart);
        System.out.println("Lifespan: " + this.lifespan + " hours");
        System.out.println("Price: $" + this.price);
        System.out.println("Shape: " + this.shape);
        System.out.println("Is Dimmable: " + this.isDimmable);
        System.out.println("Base Type: " + this.baseType);
        System.out.println("Is Energy Efficient: " + this.isEnergyEfficient);
    }
}
