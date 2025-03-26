class PlanetRunner 
{
    public static void main(String[] args) 
    {
        Planet planet1 = new Planet("Earth", 5.972E24, 6371, 1, "Terrestrial", true, 149.6E6, false, true, 
                                    "78% Nitrogen, 21% Oxygen", 9.8, 365, 24, false, 15, true, true, "Blue", 
                                    "Ancient Civilization", 0);

        System.out.println("Planet 1 Details:");
        System.out.println("Name: " + planet1.name);
        System.out.println("Mass: " + planet1.mass + " kg");
        System.out.println("Radius: " + planet1.radius + " km");
        System.out.println("Number of Moons: " + planet1.numberOfMoons);
        System.out.println("Type: " + planet1.type);
        System.out.println("Has Life: " + planet1.hasLife);
        System.out.println("Distance from Sun: " + planet1.distanceFromSun + " km");
        System.out.println("Has Rings: " + planet1.hasRings);
        System.out.println("Has Atmosphere: " + planet1.hasAtmosphere);
        System.out.println("Atmosphere Composition: " + planet1.atmosphereComposition);
        System.out.println("Gravity: " + planet1.gravity + " m/s²");
        System.out.println("Orbital Period: " + planet1.orbitalPeriod + " days");
        System.out.println("Rotation Period: " + planet1.rotationPeriod + " hours");
        System.out.println("Is Dwarf: " + planet1.isDwarf);
        System.out.println("Surface Temperature: " + planet1.surfaceTemperature + "°C");
        System.out.println("Is Habitable: " + planet1.isHabitable);
        System.out.println("Has Magnetic Field: " + planet1.hasMagneticField);
        System.out.println("Color: " + planet1.color);
        System.out.println("Discovered By: " + planet1.discoveredBy);
        System.out.println("Discovery Year: " + planet1.discoveryYear);
        System.out.println();

        Planet planet2 = new Planet("Mars", 6.39E23, 3389, 2, "Terrestrial", false, 227.9E6, false, true, 
                                    "95% Carbon Dioxide", 3.7, 687, 25, false, -60, false, true, "Red", 
                                    "Galileo Galilei", 1610);

        System.out.println("Planet 2 Details:");
        System.out.println("Name: " + planet2.name);
        System.out.println("Mass: " + planet2.mass + " kg");
        System.out.println("Radius: " + planet2.radius + " km");
        System.out.println("Number of Moons: " + planet2.numberOfMoons);
        System.out.println("Type: " + planet2.type);
        System.out.println("Has Life: " + planet2.hasLife);
        System.out.println("Distance from Sun: " + planet2.distanceFromSun + " km");
        System.out.println("Has Rings: " + planet2.hasRings);
        System.out.println("Has Atmosphere: " + planet2.hasAtmosphere);
        System.out.println("Atmosphere Composition: " + planet2.atmosphereComposition);
        System.out.println("Gravity: " + planet2.gravity + " m/s²");
        System.out.println("Orbital Period: " + planet2.orbitalPeriod + " days");
        System.out.println("Rotation Period: " + planet2.rotationPeriod + " hours");
        System.out.println("Is Dwarf: " + planet2.isDwarf);
        System.out.println("Surface Temperature: " + planet2.surfaceTemperature + "°C");
        System.out.println("Is Habitable: " + planet2.isHabitable);
        System.out.println("Has Magnetic Field: " + planet2.hasMagneticField);
        System.out.println("Color: " + planet2.color);
        System.out.println("Discovered By: " + planet2.discoveredBy);
        System.out.println("Discovery Year: " + planet2.discoveryYear);
        System.out.println();

        Planet planet3 = new Planet("Jupiter", 1.898E27, 69911, 79, "Gas Giant", false, 778.5E6, true, true, 
                                    "89% Hydrogen, 10% Helium", 24.8, 4333, 10, false, -145, false, true, "Brown", 
                                    "Galileo Galilei", 1610);

        System.out.println("Planet 3 Details:");
        System.out.println("Name: " + planet3.name);
        System.out.println("Mass: " + planet3.mass + " kg");
        System.out.println("Radius: " + planet3.radius + " km");
        System.out.println("Number of Moons: " + planet3.numberOfMoons);
        System.out.println("Type: " + planet3.type);
        System.out.println("Has Life: " + planet3.hasLife);
        System.out.println("Distance from Sun: " + planet3.distanceFromSun + " km");
        System.out.println("Has Rings: " + planet3.hasRings);
        System.out.println("Has Atmosphere: " + planet3.hasAtmosphere);
        System.out.println("Atmosphere Composition: " + planet3.atmosphereComposition);
        System.out.println("Gravity: " + planet3.gravity + " m/s²");
        System.out.println("Orbital Period: " + planet3.orbitalPeriod + " days");
        System.out.println("Rotation Period: " + planet3.rotationPeriod + " hours");
        System.out.println("Is Dwarf: " + planet3.isDwarf);
        System.out.println("Surface Temperature: " + planet3.surfaceTemperature + "°C");
        System.out.println("Is Habitable: " + planet3.isHabitable);
        System.out.println("Has Magnetic Field: " + planet3.hasMagneticField);
        System.out.println("Color: " + planet3.color);
        System.out.println("Discovered By: " + planet3.discoveredBy);
        System.out.println("Discovery Year: " + planet3.discoveryYear);
        System.out.println();
    }
}
