class Granite 
{
    String type;
    double weight;
    String color;
    double thickness;
    boolean isPolished;
    int id;
    String origin;
    double price;
    String texture;
    boolean isHeatResistant;

    Granite() 
    {
        System.out.println("No argument Constructor");
    }

    Granite(String type) 
    {
        this.type = type;
    }

    Granite(String type, double weight) 
    {
        this(type);
        this.weight = weight;
    }

    Granite(String type, double weight, String color) 
    {
        this(type, weight);
        this.color = color;
    }

    Granite(String type, double weight, String color, double thickness) 
    {
        this(type, weight, color);
        this.thickness = thickness;
    }

    Granite(String type, double weight, String color, double thickness, boolean isPolished) 
    {
        this(type, weight, color, thickness);
        this.isPolished = isPolished;
    }

    Granite(String type, double weight, String color, double thickness, boolean isPolished, int id) 
    {
        this(type, weight, color, thickness, isPolished);
        this.id = id;
    }

    Granite(String type, double weight, String color, double thickness, boolean isPolished, 
        int id, String origin) 
    {
        this(type, weight, color, thickness, isPolished, id);
        this.origin = origin;
    }

    Granite(String type, double weight, String color, double thickness, boolean isPolished, 
        int id, String origin, double price) 
    {
        this(type, weight, color, thickness, isPolished, id, origin);
        this.price = price;
    }

    Granite(String type, double weight, String color, double thickness, boolean isPolished, 
        int id, String origin, double price, String texture) 
    {
        this(type, weight, color, thickness, isPolished, id, origin, price);
        this.texture = texture;
    }

    Granite(String type, double weight, String color, double thickness, boolean isPolished, 
        int id, String origin, double price, String texture, boolean isHeatResistant) 
    {
        this(type, weight, color, thickness, isPolished, id, origin, price, texture);
        this.isHeatResistant = isHeatResistant;
    }

    void info() 
    {
        System.out.println("\nInstance variable information");

        System.out.println("Granite type: " + this.type);
        System.out.println("Granite weight: " + this.weight);
        System.out.println("Granite color: " + this.color);
        System.out.println("Granite thickness: " + this.thickness);
        System.out.println("Granite isPolished: " + this.isPolished);
        System.out.println("Granite id: " + this.id);
        System.out.println("Granite origin: " + this.origin);
        System.out.println("Granite price: " + this.price);
        System.out.println("Granite texture: " + this.texture);
        System.out.println("Granite isHeatResistant: " + this.isHeatResistant);
    }
}
