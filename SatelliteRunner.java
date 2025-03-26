class SatelliteRunner 
{
    public static void main(String[] args) 
    {
        Satellite satellite1 = new Satellite("Hubble", "Observational", 11110, 13.2, 547, 7.5,
                                             "1990-04-24", "Space Shuttle Discovery", true, 30,
                                             "NASA", "USA", true, 2.8, "S-Band",
                                             false, "Space observation", 200, true, true);

        System.out.println("Satellite 1 Details:");
        System.out.println("Name: " + satellite1.name);
        System.out.println("Type: " + satellite1.type);
        System.out.println("Weight: " + satellite1.weight + " kg");
        System.out.println("Height: " + satellite1.height + " m");
        System.out.println("Orbit Altitude: " + satellite1.orbitAltitude + " km");
        System.out.println("Speed: " + satellite1.speed + " km/s");
        System.out.println("Launch Date: " + satellite1.launchDate);
        System.out.println("Launch Vehicle: " + satellite1.launchVehicle);
        System.out.println("Is Operational: " + satellite1.isOperational);
        System.out.println("Lifespan: " + satellite1.lifespan + " years");
        System.out.println("Manufacturer: " + satellite1.manufacturer);
        System.out.println("Country of Origin: " + satellite1.countryOfOrigin);
        System.out.println("Has Solar Panels: " + satellite1.hasSolarPanels);
        System.out.println("Power Generation: " + satellite1.powerGeneration + " kW");
        System.out.println("Communication Frequency: " + satellite1.communicationFrequency);
        System.out.println("Is Manned: " + satellite1.isManned);
        System.out.println("Purpose: " + satellite1.purpose);
        System.out.println("Fuel Capacity: " + satellite1.fuelCapacity + " kg");
        System.out.println("Has Thrusters: " + satellite1.hasThrusters);
        System.out.println("Has AI: " + satellite1.hasAI);
        System.out.println();

        Satellite satellite2 = new Satellite("GPS IIR-M", "Navigation", 2032, 2.2, 20200, 3.9,
                                             "2005-09-25", "Delta II", true, 15,
                                             "Lockheed Martin", "USA", true, 1.5, "L1, L2",
                                             false, "Global positioning", 150, true, false);

        System.out.println("Satellite 2 Details:");
        System.out.println("Name: " + satellite2.name);
        System.out.println("Type: " + satellite2.type);
        System.out.println("Weight: " + satellite2.weight + " kg");
        System.out.println("Height: " + satellite2.height + " m");
        System.out.println("Orbit Altitude: " + satellite2.orbitAltitude + " km");
        System.out.println("Speed: " + satellite2.speed + " km/s");
        System.out.println("Launch Date: " + satellite2.launchDate);
        System.out.println("Launch Vehicle: " + satellite2.launchVehicle);
        System.out.println("Is Operational: " + satellite2.isOperational);
        System.out.println("Lifespan: " + satellite2.lifespan + " years");
        System.out.println("Manufacturer: " + satellite2.manufacturer);
        System.out.println("Country of Origin: " + satellite2.countryOfOrigin);
        System.out.println("Has Solar Panels: " + satellite2.hasSolarPanels);
        System.out.println("Power Generation: " + satellite2.powerGeneration + " kW");
        System.out.println("Communication Frequency: " + satellite2.communicationFrequency);
        System.out.println("Is Manned: " + satellite2.isManned);
        System.out.println("Purpose: " + satellite2.purpose);
        System.out.println("Fuel Capacity: " + satellite2.fuelCapacity + " kg");
        System.out.println("Has Thrusters: " + satellite2.hasThrusters);
        System.out.println("Has AI: " + satellite2.hasAI);
        System.out.println();

         Satellite satellite3 = new Satellite("INSAT-3DR", "Meteorological", 2210, 2.1, 35786, 3.1,
                                             "2016-09-08", "GSLV-F05", true, 12,
                                             "ISRO", "India", true, 2.2, "C-Band",
                                             false, "Weather monitoring", 180, true, true);

        System.out.println("Satellite 3 Details:");
        System.out.println("Name: " + satellite3.name);
        System.out.println("Type: " + satellite3.type);
        System.out.println("Weight: " + satellite3.weight + " kg");
        System.out.println("Height: " + satellite3.height + " m");
        System.out.println("Orbit Altitude: " + satellite3.orbitAltitude + " km");
        System.out.println("Speed: " + satellite3.speed + " km/s");
        System.out.println("Launch Date: " + satellite3.launchDate);
        System.out.println("Launch Vehicle: " + satellite3.launchVehicle);
        System.out.println("Is Operational: " + satellite3.isOperational);
        System.out.println("Lifespan: " + satellite3.lifespan + " years");
        System.out.println("Manufacturer: " + satellite3.manufacturer);
        System.out.println("Country of Origin: " + satellite3.countryOfOrigin);
        System.out.println("Has Solar Panels: " + satellite3.hasSolarPanels);
        System.out.println("Power Generation: " + satellite3.powerGeneration + " kW");
        System.out.println("Communication Frequency: " + satellite3.communicationFrequency);
        System.out.println("Is Manned: " + satellite3.isManned);
        System.out.println("Purpose: " + satellite3.purpose);
        System.out.println("Fuel Capacity: " + satellite3.fuelCapacity + " kg");
        System.out.println("Has Thrusters: " + satellite3.hasThrusters);
        System.out.println("Has AI: " + satellite3.hasAI);
    }
}
