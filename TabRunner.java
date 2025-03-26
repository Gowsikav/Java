class TabRunner 
{
    public static void main(String[] args)
    {
        Tab tab1 = new Tab("Apple", "iPad Pro", 12.9, 8, 256, "M1", 10000, "iPadOS", 1.5, true, "2732x2048", true,
                           "Silver", 2023, 999.99, true, "WiFi + 5G", true, true, false);

        System.out.println("Tab 1 Details:");
        System.out.println("Brand: " + tab1.brand);
        System.out.println("Model: " + tab1.model);
        System.out.println("Screen Size: " + tab1.screenSize + " inches");
        System.out.println("RAM: " + tab1.ram + " GB");
        System.out.println("Storage: " + tab1.storage + " GB");
        System.out.println("Processor: " + tab1.processor);
        System.out.println("Battery Capacity: " + tab1.batteryCapacity + " mAh");
        System.out.println("Operating System: " + tab1.os);
        System.out.println("Weight: " + tab1.weight + " kg");
        System.out.println("Has Stylus: " + tab1.hasStylus);
        System.out.println("Resolution: " + tab1.resolution);
        System.out.println("Is Cellular: " + tab1.isCellular);
        System.out.println("Color: " + tab1.color);
        System.out.println("Release Year: " + tab1.releaseYear);
        System.out.println("Price: $" + tab1.price);
        System.out.println("Expandable Storage: " + tab1.hasExpandableStorage);
        System.out.println("Connectivity: " + tab1.connectivity);
        System.out.println("Has Face Unlock: " + tab1.hasFaceUnlock);
        System.out.println("Has Fingerprint Sensor: " + tab1.hasFingerprintSensor);
        System.out.println("Is Water Resistant: " + tab1.isWaterResistant);

        Tab tab2 = new Tab("Samsung", "Galaxy Tab S8", 11.0, 8, 128, "Snapdragon 8 Gen 1", 8000, "Android", 1.2, true, 
                           "2560x1600", true, "Graphite", 2022, 799.99, true, "WiFi + LTE", true, true, false);

        System.out.println("\nTab 2 Details:");
        System.out.println("Brand: " + tab2.brand);
        System.out.println("Model: " + tab2.model);
        System.out.println("Screen Size: " + tab2.screenSize + " inches");
        System.out.println("RAM: " + tab2.ram + " GB");
        System.out.println("Storage: " + tab2.storage + " GB");
        System.out.println("Processor: " + tab2.processor);
        System.out.println("Battery Capacity: " + tab2.batteryCapacity + " mAh");
        System.out.println("Operating System: " + tab2.os);
        System.out.println("Weight: " + tab2.weight + " kg");
        System.out.println("Has Stylus: " + tab2.hasStylus);
        System.out.println("Resolution: " + tab2.resolution);
        System.out.println("Is Cellular: " + tab2.isCellular);
        System.out.println("Color: " + tab2.color);
        System.out.println("Release Year: " + tab2.releaseYear);
        System.out.println("Price: $" + tab2.price);
        System.out.println("Expandable Storage: " + tab2.hasExpandableStorage);
        System.out.println("Connectivity: " + tab2.connectivity);
        System.out.println("Has Face Unlock: " + tab2.hasFaceUnlock);
        System.out.println("Has Fingerprint Sensor: " + tab2.hasFingerprintSensor);
        System.out.println("Is Water Resistant: " + tab2.isWaterResistant);

        Tab tab3 = new Tab("Lenovo", "Tab P11 Pro", 11.5, 6, 128, "Snapdragon 730G", 8600, "Android", 1.3, true, 
                           "2560x1600", false, "Slate Grey", 2021, 499.99, true, "WiFi", false, true, false);

        System.out.println("\nTab 3 Details:");
        System.out.println("Brand: " + tab3.brand);
        System.out.println("Model: " + tab3.model);
        System.out.println("Screen Size: " + tab3.screenSize + " inches");
        System.out.println("RAM: " + tab3.ram + " GB");
        System.out.println("Storage: " + tab3.storage + " GB");
        System.out.println("Processor: " + tab3.processor);
        System.out.println("Battery Capacity: " + tab3.batteryCapacity + " mAh");
        System.out.println("Operating System: " + tab3.os);
        System.out.println("Weight: " + tab3.weight + " kg");
        System.out.println("Has Stylus: " + tab3.hasStylus);
        System.out.println("Resolution: " + tab3.resolution);
        System.out.println("Is Cellular: " + tab3.isCellular);
        System.out.println("Color: " + tab3.color);
        System.out.println("Release Year: " + tab3.releaseYear);
        System.out.println("Price: $" + tab3.price);
        System.out.println("Expandable Storage: " + tab3.hasExpandableStorage);
        System.out.println("Connectivity: " + tab3.connectivity);
        System.out.println("Has Face Unlock: " + tab3.hasFaceUnlock);
        System.out.println("Has Fingerprint Sensor: " + tab3.hasFingerprintSensor);
        System.out.println("Is Water Resistant: " + tab3.isWaterResistant);
    }
}
