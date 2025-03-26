class Rocket 
{
    String name;
    double height;
    double weight;
    String manufacturer;
    int launchYear;
    boolean isReusable;
    double maxSpeed;
    String fuelType;
    int numberOfStages;
    boolean hasCrew;
    double payloadCapacity;
    String launchSite;
    String missionType;
    boolean hasLandedSuccessfully;
    double cost;
    String country;
    boolean isOperational;
    int thrustPower;
    String destination;
    String launchVehicle;

    Rocket(String name, double height, double weight, String manufacturer, int launchYear, boolean isReusable, double maxSpeed, 
           String fuelType, int numberOfStages, boolean hasCrew, double payloadCapacity, String launchSite, String missionType, 
           boolean hasLandedSuccessfully, double cost, String country, boolean isOperational, int thrustPower, 
           String destination, String launchVehicle) 
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.launchYear = launchYear;
        this.isReusable = isReusable;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.numberOfStages = numberOfStages;
        this.hasCrew = hasCrew;
        this.payloadCapacity = payloadCapacity;
        this.launchSite = launchSite;
        this.missionType = missionType;
        this.hasLandedSuccessfully = hasLandedSuccessfully;
        this.cost = cost;
        this.country = country;
        this.isOperational = isOperational;
        this.thrustPower = thrustPower;
        this.destination = destination;
        this.launchVehicle = launchVehicle;
    }
}
