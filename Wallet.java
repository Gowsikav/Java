class Wallet 
{
    String material;
    String color;
    boolean isLeather;
    int capacity;
    String brand;
    double price;
    boolean hasRFIDProtection;
    boolean isBiFold;
    boolean hasCoinPocket;
    int id;
    String owner;

    Wallet() 
    {
        System.out.println("No argument Constructor");
    }

    Wallet(String material) 
    {
        this.material = material;
    }

    Wallet(String material, String color) 
    {
        this(material);
        this.color = color;
    }

    Wallet(String material, String color, boolean isLeather) 
    {
        this(material, color);
        this.isLeather = isLeather;
    }

    Wallet(String material, String color, boolean isLeather, int capacity) 
    {
        this(material, color, isLeather);
        this.capacity = capacity;
    }

    Wallet(String material, String color, boolean isLeather, int capacity, String brand) 
    {
        this(material, color, isLeather, capacity);
        this.brand = brand;
    }

    Wallet(String material, String color, boolean isLeather, int capacity, String brand, double price) 
    {
        this(material, color, isLeather, capacity, brand);
        this.price = price;
    }

    Wallet(String material, String color, boolean isLeather, int capacity, String brand, double price,
     boolean hasRFIDProtection) 
    {
        this(material, color, isLeather, capacity, brand, price);
        this.hasRFIDProtection = hasRFIDProtection;
    }

    Wallet(String material, String color, boolean isLeather, int capacity, String brand, double price, 
        boolean hasRFIDProtection, boolean isBiFold) 
    {
        this(material, color, isLeather, capacity, brand, price, hasRFIDProtection);
        this.isBiFold = isBiFold;
    }

    Wallet(String material, String color, boolean isLeather, int capacity, String brand, double price,
     boolean hasRFIDProtection, boolean isBiFold, boolean hasCoinPocket) 
    {
        this(material, color, isLeather, capacity, brand, price, hasRFIDProtection, isBiFold);
        this.hasCoinPocket = hasCoinPocket;
    }

    Wallet(String material, String color, boolean isLeather, int capacity, String brand, double price, 
        boolean hasRFIDProtection, boolean isBiFold, boolean hasCoinPocket, int id, String owner)
         {
        this(material, color, isLeather, capacity, brand, price, hasRFIDProtection, isBiFold, hasCoinPocket);
        this.id = id;
        this.owner = owner;
    }

    void info() {
        System.out.println("\nInstance variable information");

        System.out.println("Wallet material: " + this.material);
        System.out.println("Wallet color: " + this.color);
        System.out.println("Wallet isLeather: " + this.isLeather);
        System.out.println("Wallet capacity: " + this.capacity);
        System.out.println("Wallet brand: " + this.brand);
        System.out.println("Wallet price: " + this.price);
        System.out.println("Wallet hasRFIDProtection: " + this.hasRFIDProtection);
        System.out.println("Wallet isBiFold: " + this.isBiFold);
        System.out.println("Wallet hasCoinPocket: " + this.hasCoinPocket);
        System.out.println("Wallet id: " + this.id);
        System.out.println("Wallet owner: " + this.owner);
    }
}
