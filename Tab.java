class Tab 
{
    String brand;
    String model;
    double screenSize;
    int ram;
    int storage;
    String processor;
    int batteryCapacity;
    String os;
    double weight;
    boolean hasStylus;
    String resolution;
    boolean isCellular;
    String color;
    int releaseYear;
    double price;
    boolean hasExpandableStorage;
    String connectivity;
    boolean hasFaceUnlock;
    boolean hasFingerprintSensor;
    boolean isWaterResistant;

    Tab(String brand, String model, double screenSize, int ram, int storage, String processor, int batteryCapacity,
        String os, double weight, boolean hasStylus, String resolution, boolean isCellular, String color, int releaseYear,
        double price, boolean hasExpandableStorage, String connectivity, boolean hasFaceUnlock, boolean hasFingerprintSensor,
        boolean isWaterResistant) 
        {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.weight = weight;
        this.hasStylus = hasStylus;
        this.resolution = resolution;
        this.isCellular = isCellular;
        this.color = color;
        this.releaseYear = releaseYear;
        this.price = price;
        this.hasExpandableStorage = hasExpandableStorage;
        this.connectivity = connectivity;
        this.hasFaceUnlock = hasFaceUnlock;
        this.hasFingerprintSensor = hasFingerprintSensor;
        this.isWaterResistant = isWaterResistant;
    }
}
