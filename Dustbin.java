class Dustbin 
{
    String brand;
    String material;
    int capacity;
    String shape;
    String color;
    boolean hasLid;
    boolean isRecyclable;
    String type;
    double height;
    double width;
    double depth;
    boolean hasFootPedal;
    String openingMechanism;
    boolean isOdorProof;
    String usage;
    boolean isFireResistant;
    boolean isLeakProof;
    String warranty;
    String countryOfOrigin;
    int productionYear;

    Dustbin(String brand, String material, int capacity, String shape, String color, boolean hasLid, boolean isRecyclable,
            String type, double height, double width, double depth, boolean hasFootPedal, String openingMechanism,
            boolean isOdorProof, String usage, boolean isFireResistant, boolean isLeakProof, String warranty,
            String countryOfOrigin, int productionYear) 
    {
        this.brand = brand;
        this.material = material;
        this.capacity = capacity;
        this.shape = shape;
        this.color = color;
        this.hasLid = hasLid;
        this.isRecyclable = isRecyclable;
        this.type = type;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.hasFootPedal = hasFootPedal;
        this.openingMechanism = openingMechanism;
        this.isOdorProof = isOdorProof;
        this.usage = usage;
        this.isFireResistant = isFireResistant;
        this.isLeakProof = isLeakProof;
        this.warranty = warranty;
        this.countryOfOrigin = countryOfOrigin;
        this.productionYear = productionYear;
    }
}
