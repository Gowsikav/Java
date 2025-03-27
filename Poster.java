class Poster
{
    double width;
    double length;
    String content;
    String material;
    String color;
    boolean isLaminated;
    String brand;
    double price;
    boolean isFramed;
    int id;
    
    Poster() 
    {
        System.out.println("No argument Constructor");
    }

    Poster(double width) 
    {
        this.width = width;
    }

    Poster(double width, double length) 
    {
        this(width);
        this.length = length;
    }

    Poster(double width, double length, String content) {
        this(width, length);
        this.content = content;
    }

    Poster(double width, double length, String content, String material) 
    {
        this(width, length, content);
        this.material = material;
    }

    Poster(double width, double length, String content, String material, String color) 
    {
        this(width, length, content, material);
        this.color = color;
    }

    Poster(double width, double length, String content, String material, String color, 
    	boolean isLaminated) 
    {
        this(width, length, content, material, color);
        this.isLaminated = isLaminated;
    }

    Poster(double width, double length, String content, String material, String color, 
    	boolean isLaminated, String brand) 
    {
        this(width, length, content, material, color, isLaminated);
        this.brand = brand;
    }

    Poster(double width, double length, String content, String material, String color, 
    	boolean isLaminated, String brand, double price) 
    {
        this(width, length, content, material, color, isLaminated, brand);
        this.price = price;
    }

    Poster(double width, double length, String content, String material, String color, 
    	boolean isLaminated, String brand, double price, boolean isFramed) 
    {
        this(width, length, content, material, color, isLaminated, brand, price);
        this.isFramed = isFramed;
    }

    Poster(double width, double length, String content, String material, String color, 
    	boolean isLaminated, String brand, double price, boolean isFramed, int id) 
    {
        this(width, length, content, material, color, isLaminated, brand, price, isFramed);
        this.id = id;
    }

    void info() {
        System.out.println("\nInstance variable information");

        System.out.println("Poster width: " + this.width);
        System.out.println("Poster length: " + this.length);
        System.out.println("Poster content: " + this.content);
        System.out.println("Poster material: " + this.material);
        System.out.println("Poster color: " + this.color);
        System.out.println("Poster isLaminated: " + this.isLaminated);
        System.out.println("Poster brand: " + this.brand);
        System.out.println("Poster price: " + this.price);
        System.out.println("Poster isFramed: " + this.isFramed);
        System.out.println("Poster id: " + this.id);
    }
}
