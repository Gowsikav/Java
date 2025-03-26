class Planet 
{
    String name;
    double mass;
    double radius;
    int numberOfMoons;
    String type;
    boolean hasLife;
    double distanceFromSun;
    boolean hasRings;
    boolean hasAtmosphere;
    String atmosphereComposition;
    double gravity;
    int orbitalPeriod;
    int rotationPeriod;
    boolean isDwarf;
    double surfaceTemperature;
    boolean isHabitable;
    boolean hasMagneticField;
    String color;
    String discoveredBy;
    int discoveryYear;

    Planet(String name, double mass, double radius, int numberOfMoons, String type, boolean hasLife, double distanceFromSun,
           boolean hasRings, boolean hasAtmosphere, String atmosphereComposition, double gravity, int orbitalPeriod,
           int rotationPeriod, boolean isDwarf, double surfaceTemperature, boolean isHabitable, boolean hasMagneticField,
           String color, String discoveredBy, int discoveryYear) 
    {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.numberOfMoons = numberOfMoons;
        this.type = type;
        this.hasLife = hasLife;
        this.distanceFromSun = distanceFromSun;
        this.hasRings = hasRings;
        this.hasAtmosphere = hasAtmosphere;
        this.atmosphereComposition = atmosphereComposition;
        this.gravity = gravity;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
        this.isDwarf = isDwarf;
        this.surfaceTemperature = surfaceTemperature;
        this.isHabitable = isHabitable;
        this.hasMagneticField = hasMagneticField;
        this.color = color;
        this.discoveredBy = discoveredBy;
        this.discoveryYear = discoveryYear;
    }
}
