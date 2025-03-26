class Cab 
{
    String company;
    String model;
    String color;
    int capacity;
    double farePerKm;
    boolean isElectric;
    boolean hasAC;
    boolean hasWiFi;
    int manufacturingYear;
    String fuelType;
    double mileage;
    boolean isAvailable;
    String driverName;
    int driverAge;
    String licenseNumber;
    boolean hasGPS;
    boolean isLuxury;
    int numberOfAirbags;
    String city;
    String country;

    Cab(String company, String model, String color, int capacity, double farePerKm, boolean isElectric, boolean hasAC,
        boolean hasWiFi, int manufacturingYear, String fuelType, double mileage, boolean isAvailable, String driverName,
        int driverAge, String licenseNumber, boolean hasGPS, boolean isLuxury, int numberOfAirbags, String city, String country) 
    {
        this.company = company;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
        this.farePerKm = farePerKm;
        this.isElectric = isElectric;
        this.hasAC = hasAC;
        this.hasWiFi = hasWiFi;
        this.manufacturingYear = manufacturingYear;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.isAvailable = isAvailable;
        this.driverName = driverName;
        this.driverAge = driverAge;
        this.licenseNumber = licenseNumber;
        this.hasGPS = hasGPS;
        this.isLuxury = isLuxury;
        this.numberOfAirbags = numberOfAirbags;
        this.city = city;
        this.country = country;
    }
}
