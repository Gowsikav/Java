class AK47 
{
    String manufacturer;
    double weight;
    int magazineCapacity;
    double caliber;
    int fireRate;
    String countryOfOrigin;
    boolean isAutomatic;
    String material;
    int effectiveRange;
    double barrelLength;
    boolean hasBayonet;

    AK47() {
        System.out.println("No argument Constructor");
    }

    AK47(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    AK47(String manufacturer, double weight) {
        this(manufacturer);
        this.weight = weight;
    }

    AK47(String manufacturer, double weight, int magazineCapacity) {
        this(manufacturer, weight);
        this.magazineCapacity = magazineCapacity;
    }

    AK47(String manufacturer, double weight, int magazineCapacity, double caliber) {
        this(manufacturer, weight, magazineCapacity);
        this.caliber = caliber;
    }

    AK47(String manufacturer, double weight, int magazineCapacity, double caliber, int fireRate) {
        this(manufacturer, weight, magazineCapacity, caliber);
        this.fireRate = fireRate;
    }

    AK47(String manufacturer, double weight, int magazineCapacity, double caliber, int fireRate, 
        String countryOfOrigin) 
    {
        this(manufacturer, weight, magazineCapacity, caliber, fireRate);
        this.countryOfOrigin = countryOfOrigin;
    }

    AK47(String manufacturer, double weight, int magazineCapacity, double caliber, int fireRate,
     String countryOfOrigin, boolean isAutomatic) 
    {
        this(manufacturer, weight, magazineCapacity, caliber, fireRate, countryOfOrigin);
        this.isAutomatic = isAutomatic;
    }

    AK47(String manufacturer, double weight, int magazineCapacity, double caliber, int fireRate, 
        String countryOfOrigin, boolean isAutomatic, String material) 
    {
        this(manufacturer, weight, magazineCapacity, caliber, fireRate, countryOfOrigin, isAutomatic);
        this.material = material;
    }

    AK47(String manufacturer, double weight, int magazineCapacity, double caliber, int fireRate, 
        String countryOfOrigin, boolean isAutomatic, String material, int effectiveRange) 
    {
        this(manufacturer, weight, magazineCapacity, caliber, fireRate, countryOfOrigin, isAutomatic, material);
        this.effectiveRange = effectiveRange;
    }

    AK47(String manufacturer, double weight, int magazineCapacity, double caliber, int fireRate, 
        String countryOfOrigin, boolean isAutomatic, String material, int effectiveRange, 
        double barrelLength, boolean hasBayonet) 
    {
        this(manufacturer, weight, magazineCapacity, caliber, fireRate, countryOfOrigin, isAutomatic, material, effectiveRange);
        this.barrelLength = barrelLength;
        this.hasBayonet = hasBayonet;
    }

    void info() {
        System.out.println("\nInstance variable information");

        System.out.println("AK47 manufacturer: " + this.manufacturer);
        System.out.println("AK47 weight: " + this.weight + " kg");
        System.out.println("AK47 magazine capacity: " + this.magazineCapacity);
        System.out.println("AK47 caliber: " + this.caliber + " mm");
        System.out.println("AK47 fire rate: " + this.fireRate + " rounds per minute");
        System.out.println("AK47 country of origin: " + this.countryOfOrigin);
        System.out.println("AK47 is automatic: " + this.isAutomatic);
        System.out.println("AK47 material: " + this.material);
        System.out.println("AK47 effective range: " + this.effectiveRange + " meters");
        System.out.println("AK47 barrel length: " + this.barrelLength + " inches");
        System.out.println("AK47 has bayonet: " + this.hasBayonet);
    }
}
