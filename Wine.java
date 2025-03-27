class Wine 
{
    String name;
    String type;
    String brand;
    double alcoholContent;
    int age;
    String originCountry;
    boolean isSparkling;
    String grapeVariety;
    double bottleSize;
    double price;
    boolean isOrganic;

    Wine() {
        System.out.println("No argument Constructor");
    }

    Wine(String name) {
        this.name = name;
    }

    Wine(String name, String type) {
        this(name);
        this.type = type;
    }

    Wine(String name, String type, String brand) {
        this(name, type);
        this.brand = brand;
    }

    Wine(String name, String type, String brand, double alcoholContent) {
        this(name, type, brand);
        this.alcoholContent = alcoholContent;
    }

    Wine(String name, String type, String brand, double alcoholContent, int age) {
        this(name, type, brand, alcoholContent);
        this.age = age;
    }

    Wine(String name, String type, String brand, double alcoholContent, int age, String originCountry) 
    {
        this(name, type, brand, alcoholContent, age);
        this.originCountry = originCountry;
    }

    Wine(String name, String type, String brand, double alcoholContent, int age, String originCountry, 
        boolean isSparkling) 
    {
        this(name, type, brand, alcoholContent, age, originCountry);
        this.isSparkling = isSparkling;
    }

    Wine(String name, String type, String brand, double alcoholContent, int age, String originCountry, 
        boolean isSparkling, String grapeVariety) 
    {
        this(name, type, brand, alcoholContent, age, originCountry, isSparkling);
        this.grapeVariety = grapeVariety;
    }

    Wine(String name, String type, String brand, double alcoholContent, int age, String originCountry,
     boolean isSparkling, String grapeVariety, double bottleSize) 
    {
        this(name, type, brand, alcoholContent, age, originCountry, isSparkling, grapeVariety);
        this.bottleSize = bottleSize;
    }

    Wine(String name, String type, String brand, double alcoholContent, int age, String originCountry,
     boolean isSparkling, String grapeVariety, double bottleSize, double price, boolean isOrganic) 
    {
        this(name, type, brand, alcoholContent, age, originCountry, isSparkling, grapeVariety, bottleSize);
        this.price = price;
        this.isOrganic = isOrganic;
    }

    void info() 
    {
        System.out.println("\nWine Details:");

        System.out.println("Wine Name: " + this.name);
        System.out.println("Wine Type: " + this.type);
        System.out.println("Wine Brand: " + this.brand);
        System.out.println("Alcohol Content: " + this.alcoholContent + "%");
        System.out.println("Age: " + this.age + " years");
        System.out.println("Origin Country: " + this.originCountry);
        System.out.println("Is Sparkling: " + this.isSparkling);
        System.out.println("Grape Variety: " + this.grapeVariety);
        System.out.println("Bottle Size: " + this.bottleSize + " ml");
        System.out.println("Price: $" + this.price);
        System.out.println("Is Organic: " + this.isOrganic);
    }
}
