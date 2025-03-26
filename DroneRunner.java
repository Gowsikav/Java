class DroneRunner
 {
    public static void main(String[] args) 
    {
        Drone drone1 = new Drone("DJI", "Mavic Air 2", 570, 68.4, 34, 18.5, "4K", true, false, 3500, "WiFi", true, 
                                 5000, "Remote", true, 4, false, true, true, 799.99);

        System.out.println("Drone 1 Details:");
        System.out.println("Brand: " + drone1.brand);
        System.out.println("Model: " + drone1.model);
        System.out.println("Weight: " + drone1.weight + " grams");
        System.out.println("Max Speed: " + drone1.maxSpeed + " km/h");
        System.out.println("Flight Time: " + drone1.flightTime + " minutes");
        System.out.println("Range: " + drone1.range + " km");
        System.out.println("Camera Quality: " + drone1.cameraQuality);
        System.out.println("Has GPS: " + drone1.hasGPS);
        System.out.println("Is Waterproof: " + drone1.isWaterproof);
        System.out.println("Battery Capacity: " + drone1.batteryCapacity + " mAh");
        System.out.println("Connectivity: " + drone1.connectivity);
        System.out.println("Has Obstacle Avoidance: " + drone1.hasObstacleAvoidance);
        System.out.println("Max Altitude: " + drone1.maxAltitude + " meters");
        System.out.println("Controller Type: " + drone1.controllerType);
        System.out.println("Supports Autonomous Flight: " + drone1.supportsAutonomousFlight);
        System.out.println("Number of Rotors: " + drone1.numberOfRotors);
        System.out.println("Has Night Vision: " + drone1.hasNightVision);
        System.out.println("Foldable: " + drone1.foldable);
        System.out.println("Has Live Streaming: " + drone1.hasLiveStreaming);
        System.out.println("Price: $" + drone1.price);
        System.out.println();

        Drone drone2 = new Drone("Parrot", "Anafi", 320, 55, 25, 12, "4K HDR", true, false, 2700, "Bluetooth", false, 
                                 4500, "App Control", true, 4, false, true, true, 699.99);

        System.out.println("Drone 2 Details:");
        System.out.println("Brand: " + drone2.brand);
        System.out.println("Model: " + drone2.model);
        System.out.println("Weight: " + drone2.weight + " grams");
        System.out.println("Max Speed: " + drone2.maxSpeed + " km/h");
        System.out.println("Flight Time: " + drone2.flightTime + " minutes");
        System.out.println("Range: " + drone2.range + " km");
        System.out.println("Camera Quality: " + drone2.cameraQuality);
        System.out.println("Has GPS: " + drone2.hasGPS);
        System.out.println("Is Waterproof: " + drone2.isWaterproof);
        System.out.println("Battery Capacity: " + drone2.batteryCapacity + " mAh");
        System.out.println("Connectivity: " + drone2.connectivity);
        System.out.println("Has Obstacle Avoidance: " + drone2.hasObstacleAvoidance);
        System.out.println("Max Altitude: " + drone2.maxAltitude + " meters");
        System.out.println("Controller Type: " + drone2.controllerType);
        System.out.println("Supports Autonomous Flight: " + drone2.supportsAutonomousFlight);
        System.out.println("Number of Rotors: " + drone2.numberOfRotors);
        System.out.println("Has Night Vision: " + drone2.hasNightVision);
        System.out.println("Foldable: " + drone2.foldable);
        System.out.println("Has Live Streaming: " + drone2.hasLiveStreaming);
        System.out.println("Price: $" + drone2.price);
        System.out.println();

        Drone drone3 = new Drone("Autel", "Evo II", 1150, 72, 40, 25, "8K", true, true, 7100, "RF", true, 
                                 6000, "Remote", true, 6, true, false, true, 1499.99);

        System.out.println("Drone 3 Details:");
        System.out.println("Brand: " + drone3.brand);
        System.out.println("Model: " + drone3.model);
        System.out.println("Weight: " + drone3.weight + " grams");
        System.out.println("Max Speed: " + drone3.maxSpeed + " km/h");
        System.out.println("Flight Time: " + drone3.flightTime + " minutes");
        System.out.println("Range: " + drone3.range + " km");
        System.out.println("Camera Quality: " + drone3.cameraQuality);
        System.out.println("Has GPS: " + drone3.hasGPS);
        System.out.println("Is Waterproof: " + drone3.isWaterproof);
        System.out.println("Battery Capacity: " + drone3.batteryCapacity + " mAh");
        System.out.println("Connectivity: " + drone3.connectivity);
        System.out.println("Has Obstacle Avoidance: " + drone3.hasObstacleAvoidance);
        System.out.println("Max Altitude: " + drone3.maxAltitude + " meters");
        System.out.println("Controller Type: " + drone3.controllerType);
        System.out.println("Supports Autonomous Flight: " + drone3.supportsAutonomousFlight);
        System.out.println("Number of Rotors: " + drone3.numberOfRotors);
        System.out.println("Has Night Vision: " + drone3.hasNightVision);
        System.out.println("Foldable: " + drone3.foldable);
        System.out.println("Has Live Streaming: " + drone3.hasLiveStreaming);
        System.out.println("Price: $" + drone3.price);
    }
}
