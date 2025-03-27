class Cement 
{
    String type;
    double weight;
    String color;
    double price;
    boolean isWaterproof;
    int id;
    String brand;
    int grade;
    String usage;
    boolean isQuickDry;

    Cement() 
    {
        System.out.println("No argument Constructor");
    }

    Cement(String type) 
    {
        this.type = type;
    }

    Cement(String type, double weight) 
    {
        this(type);
        this.weight = weight;
    }

    Cement(String type, double weight, String color) 
    {
        this(type, weight);
        this.color = color;
    }

    Cement(String type, double weight, String color, double price) 
    {
        this(type, weight, color);
        this.price = price;
    }

    Cement(String type, double weight, String color, double price, boolean isWaterproof) 
    {
        this(type, weight, color, price);
        this.isWaterproof = isWaterproof;
    }

    Cement(String type, double weight, String color, double price, boolean isWaterproof, int id) 
    {
        this(type, weight, color, price, isWaterproof);
        this.id = id;
    }

    Cement(String type, double weight, String color, double price, boolean isWaterproof, int id,
     String brand) 
    {
        this(type, weight, color, price, isWaterproof, id);
        this.brand = brand;
    }

    Cement(String type, double weight, String color, double price, boolean isWaterproof,
     int id, String brand, int grade) 
    {
        this(type, weight, color, price, isWaterproof, id, brand);
        this.grade = grade;
    }

    Cement(String type, double weight, String color, double price, boolean isWaterproof,
     int id, String brand, int grade, String usage) 
    {
        this(type, weight, color, price, isWaterproof, id, brand, grade);
        this.usage = usage;
    }

    Cement(String type, double weight, String color, double price, boolean isWaterproof, 
        int id, String brand, int grade, String usage, boolean isQuickDry) 
    {
        this(type, weight, color, price, isWaterproof, id, brand, grade, usage);
        this.isQuickDry = isQuickDry;
    }

    void info() 
    {
        System.out.println("\nInstance variable information");

        System.out.println("Cement type: " + this.type);
        System.out.println("Cement weight: " + this.weight);
        System.out.println("Cement color: " + this.color);
        System.out.println("Cement price: " + this.price);
        System.out.println("Cement isWaterproof: " + this.isWaterproof);
        System.out.println("Cement id: " + this.id);
        System.out.println("Cement brand: " + this.brand);
        System.out.println("Cement grade: " + this.grade);
        System.out.println("Cement usage: " + this.usage);
        System.out.println("Cement isQuickDry: " + this.isQuickDry);
    }
}
