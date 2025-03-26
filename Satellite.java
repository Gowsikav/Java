class Satellite 
{
    String name;
    String type;
    double weight;
    double height;
    double orbitAltitude;
    double speed;
    String launchDate;
    String launchVehicle;
    boolean isOperational;
    int lifespan;
    String manufacturer;
    String countryOfOrigin;
    boolean hasSolarPanels;
    double powerGeneration;
    String communicationFrequency;
    boolean isManned;
    String purpose;
    double fuelCapacity;
    boolean hasThrusters;
    boolean hasAI;

    Satellite(String name, String type, double weight, double height, double orbitAltitude, double speed,
              String launchDate, String launchVehicle, boolean isOperational, int lifespan, String manufacturer,
              String countryOfOrigin, boolean hasSolarPanels, double powerGeneration, String communicationFrequency,
              boolean isManned, String purpose, double fuelCapacity, boolean hasThrusters, boolean hasAI) 
              {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.height = height;
        this.orbitAltitude = orbitAltitude;
        this.speed = speed;
        this.launchDate = launchDate;
        this.launchVehicle = launchVehicle;
        this.isOperational = isOperational;
        this.lifespan = lifespan;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.hasSolarPanels = hasSolarPanels;
        this.powerGeneration = powerGeneration;
        this.communicationFrequency = communicationFrequency;
        this.isManned = isManned;
        this.purpose = purpose;
        this.fuelCapacity = fuelCapacity;
        this.hasThrusters = hasThrusters;
        this.hasAI = hasAI;
    }
}
