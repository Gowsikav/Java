class CabRunner 
{
    public static void main(String[] args) 
    {
        Cab cab1 = new Cab("Uber", "Toyota Camry", "White", 4, 1.5, false, true, true, 2020, "Petrol", 15.0, true, 
                           "John Doe", 35, "DL12345XYZ", true, false, 6, "New York", "USA");

        System.out.println("Cab 1 Details:");
        System.out.println("Company: " + cab1.company);
        System.out.println("Model: " + cab1.model);
        System.out.println("Color: " + cab1.color);
        System.out.println("Capacity: " + cab1.capacity);
        System.out.println("Fare Per Km: $" + cab1.farePerKm);
        System.out.println("Is Electric: " + cab1.isElectric);
        System.out.println("Has AC: " + cab1.hasAC);
        System.out.println("Has WiFi: " + cab1.hasWiFi);
        System.out.println("Manufacturing Year: " + cab1.manufacturingYear);
        System.out.println("Fuel Type: " + cab1.fuelType);
        System.out.println("Mileage: " + cab1.mileage + " km/l");
        System.out.println("Is Available: " + cab1.isAvailable);
        System.out.println("Driver Name: " + cab1.driverName);
        System.out.println("Driver Age: " + cab1.driverAge);
        System.out.println("License Number: " + cab1.licenseNumber);
        System.out.println("Has GPS: " + cab1.hasGPS);
        System.out.println("Is Luxury: " + cab1.isLuxury);
        System.out.println("Number of Airbags: " + cab1.numberOfAirbags);
        System.out.println("City: " + cab1.city);
        System.out.println("Country: " + cab1.country);
        System.out.println();

        Cab cab2 = new Cab("Lyft", "Honda Accord", "Black", 4, 1.7, false, true, false, 2019, "Diesel", 18.0, false, 
                           "Alice Brown", 40, "DL67890ABC", true, false, 4, "Los Angeles", "USA");

        System.out.println("Cab 2 Details:");
        System.out.println("Company: " + cab2.company);
        System.out.println("Model: " + cab2.model);
        System.out.println("Color: " + cab2.color);
        System.out.println("Capacity: " + cab2.capacity);
        System.out.println("Fare Per Km: $" + cab2.farePerKm);
        System.out.println("Is Electric: " + cab2.isElectric);
        System.out.println("Has AC: " + cab2.hasAC);
        System.out.println("Has WiFi: " + cab2.hasWiFi);
        System.out.println("Manufacturing Year: " + cab2.manufacturingYear);
        System.out.println("Fuel Type: " + cab2.fuelType);
        System.out.println("Mileage: " + cab2.mileage + " km/l");
        System.out.println("Is Available: " + cab2.isAvailable);
        System.out.println("Driver Name: " + cab2.driverName);
        System.out.println("Driver Age: " + cab2.driverAge);
        System.out.println("License Number: " + cab2.licenseNumber);
        System.out.println("Has GPS: " + cab2.hasGPS);
        System.out.println("Is Luxury: " + cab2.isLuxury);
        System.out.println("Number of Airbags: " + cab2.numberOfAirbags);
        System.out.println("City: " + cab2.city);
        System.out.println("Country: " + cab2.country);
        System.out.println();

        Cab cab3 = new Cab("Ola", "Hyundai Verna", "Silver", 4, 1.2, true, true, false, 2022, "Electric", 25.0, true, 
                           "Rahul Kumar", 30, "DL24680DEF", true, true, 8, "Bangalore", "India");

        System.out.println("Cab 3 Details:");
        System.out.println("Company: " + cab3.company);
        System.out.println("Model: " + cab3.model);
        System.out.println("Color: " + cab3.color);
        System.out.println("Capacity: " + cab3.capacity);
        System.out.println("Fare Per Km: $" + cab3.farePerKm);
        System.out.println("Is Electric: " + cab3.isElectric);
        System.out.println("Has AC: " + cab3.hasAC);
        System.out.println("Has WiFi: " + cab3.hasWiFi);
        System.out.println("Manufacturing Year: " + cab3.manufacturingYear);
        System.out.println("Fuel Type: " + cab3.fuelType);
        System.out.println("Mileage: " + cab3.mileage + " km/l");
        System.out.println("Is Available: " + cab3.isAvailable);
        System.out.println("Driver Name: " + cab3.driverName);
        System.out.println("Driver Age: " + cab3.driverAge);
        System.out.println("License Number: " + cab3.licenseNumber);
        System.out.println("Has GPS: " + cab3.hasGPS);
        System.out.println("Is Luxury: " + cab3.isLuxury);
        System.out.println("Number of Airbags: " + cab3.numberOfAirbags);
        System.out.println("City: " + cab3.city);
        System.out.println("Country: " + cab3.country);
        System.out.println();
    }
}
