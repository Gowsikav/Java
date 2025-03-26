class RocketRunner 
{
    public static void main(String[] args)
     {
        Rocket rocket1 = new Rocket("Falcon 9", 70, 549054, "SpaceX", 2010, true, 27000, "RP-1/LOX", 2, false, 22800,
                                    "Kennedy Space Center", "Satellite Deployment", true, 67, "USA", true, 7607,
                                    "Low Earth Orbit", "Falcon Heavy");

        System.out.println("Rocket 1 Details:");
        System.out.println("Name: " + rocket1.name);
        System.out.println("Height: " + rocket1.height + " meters");
        System.out.println("Weight: " + rocket1.weight + " kg");
        System.out.println("Manufacturer: " + rocket1.manufacturer);
        System.out.println("Launch Year: " + rocket1.launchYear);
        System.out.println("Is Reusable: " + rocket1.isReusable);
        System.out.println("Max Speed: " + rocket1.maxSpeed + " km/h");
        System.out.println("Fuel Type: " + rocket1.fuelType);
        System.out.println("Number of Stages: " + rocket1.numberOfStages);
        System.out.println("Has Crew: " + rocket1.hasCrew);
        System.out.println("Payload Capacity: " + rocket1.payloadCapacity + " kg");
        System.out.println("Launch Site: " + rocket1.launchSite);
        System.out.println("Mission Type: " + rocket1.missionType);
        System.out.println("Has Landed Successfully: " + rocket1.hasLandedSuccessfully);
        System.out.println("Cost: $" + rocket1.cost + " million");
        System.out.println("Country: " + rocket1.country);
        System.out.println("Is Operational: " + rocket1.isOperational);
        System.out.println("Thrust Power: " + rocket1.thrustPower + " kN");
        System.out.println("Destination: " + rocket1.destination);
        System.out.println("Launch Vehicle: " + rocket1.launchVehicle);
        System.out.println();

        Rocket rocket2 = new Rocket("Saturn V", 110, 2900000, "NASA", 1967, false, 40000, "Liquid Hydrogen/LOX", 3, true,
                                    140000, "Cape Canaveral", "Moon Mission", false, 185, "USA", false, 34000,
                                    "Moon", "Apollo");

        System.out.println("Rocket 2 Details:");
        System.out.println("Name: " + rocket2.name);
        System.out.println("Height: " + rocket2.height + " meters");
        System.out.println("Weight: " + rocket2.weight + " kg");
        System.out.println("Manufacturer: " + rocket2.manufacturer);
        System.out.println("Launch Year: " + rocket2.launchYear);
        System.out.println("Is Reusable: " + rocket2.isReusable);
        System.out.println("Max Speed: " + rocket2.maxSpeed + " km/h");
        System.out.println("Fuel Type: " + rocket2.fuelType);
        System.out.println("Number of Stages: " + rocket2.numberOfStages);
        System.out.println("Has Crew: " + rocket2.hasCrew);
        System.out.println("Payload Capacity: " + rocket2.payloadCapacity + " kg");
        System.out.println("Launch Site: " + rocket2.launchSite);
        System.out.println("Mission Type: " + rocket2.missionType);
        System.out.println("Has Landed Successfully: " + rocket2.hasLandedSuccessfully);
        System.out.println("Cost: $" + rocket2.cost + " million");
        System.out.println("Country: " + rocket2.country);
        System.out.println("Is Operational: " + rocket2.isOperational);
        System.out.println("Thrust Power: " + rocket2.thrustPower + " kN");
        System.out.println("Destination: " + rocket2.destination);
        System.out.println("Launch Vehicle: " + rocket2.launchVehicle);
        System.out.println();
        
        Rocket rocket3 = new Rocket("GSLV Mk III", 43, 640000, "ISRO", 2014, false, 10000, "Solid/Liquid Cryogenic", 3, false,
                                    4000, "Sriharikota", "Satellite Deployment", true, 50, "India", true, 20000,
                                    "Geostationary Orbit", "LVM-3");

        System.out.println("Rocket 3 Details:");
        System.out.println("Name: " + rocket3.name);
        System.out.println("Height: " + rocket3.height + " meters");
        System.out.println("Weight: " + rocket3.weight + " kg");
        System.out.println("Manufacturer: " + rocket3.manufacturer);
        System.out.println("Launch Year: " + rocket3.launchYear);
        System.out.println("Is Reusable: " + rocket3.isReusable);
        System.out.println("Max Speed: " + rocket3.maxSpeed + " km/h");
        System.out.println("Fuel Type: " + rocket3.fuelType);
        System.out.println("Number of Stages: " + rocket3.numberOfStages);
        System.out.println("Has Crew: " + rocket3.hasCrew);
        System.out.println("Payload Capacity: " + rocket3.payloadCapacity + " kg");
        System.out.println("Launch Site: " + rocket3.launchSite);
        System.out.println("Mission Type: " + rocket3.missionType);
        System.out.println("Has Landed Successfully: " + rocket3.hasLandedSuccessfully);
        System.out.println("Cost: $" + rocket3.cost + " million");
        System.out.println("Country: " + rocket3.country);
        System.out.println("Is Operational: " + rocket3.isOperational);
        System.out.println("Thrust Power: " + rocket3.thrustPower + " kN");
        System.out.println("Destination: " + rocket3.destination);
        System.out.println("Launch Vehicle: " + rocket3.launchVehicle);
    }
}
