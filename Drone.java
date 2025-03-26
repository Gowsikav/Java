class Drone 
{
    String brand;
    String model;
    double weight;
    double maxSpeed;
    double flightTime;
    double range;
    String cameraQuality;
    boolean hasGPS;
    boolean isWaterproof;
    int batteryCapacity;
    String connectivity;
    boolean hasObstacleAvoidance;
    int maxAltitude;
    String controllerType;
    boolean supportsAutonomousFlight;
    int numberOfRotors;
    boolean hasNightVision;
    boolean foldable;
    boolean hasLiveStreaming;
    double price;

    Drone(String brand, String model, double weight, double maxSpeed, double flightTime, double range, 
          String cameraQuality, boolean hasGPS, boolean isWaterproof, int batteryCapacity, String connectivity, 
          boolean hasObstacleAvoidance, int maxAltitude, String controllerType, boolean supportsAutonomousFlight, 
          int numberOfRotors, boolean hasNightVision, boolean foldable, boolean hasLiveStreaming, double price) 
          {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.flightTime = flightTime;
        this.range = range;
        this.cameraQuality = cameraQuality;
        this.hasGPS = hasGPS;
        this.isWaterproof = isWaterproof;
        this.batteryCapacity = batteryCapacity;
        this.connectivity = connectivity;
        this.hasObstacleAvoidance = hasObstacleAvoidance;
        this.maxAltitude = maxAltitude;
        this.controllerType = controllerType;
        this.supportsAutonomousFlight = supportsAutonomousFlight;
        this.numberOfRotors = numberOfRotors;
        this.hasNightVision = hasNightVision;
        this.foldable = foldable;
        this.hasLiveStreaming = hasLiveStreaming;
        this.price = price;
    }
}
