class ZipRunner 
{
    public static void main(String[] args) 
    {
        Zip zip1 = new Zip("YKK", "Coil", "Polyester", "Black", 20.5, true, true, false, true, 50, 
                           "Metal", "Clothing", "Japan", 150.0, true, 5, false, "Straight", true, true);

        System.out.println("Zip 1 Details:");
        System.out.println("Brand: " + zip1.brand);
        System.out.println("Type: " + zip1.type);
        System.out.println("Material: " + zip1.material);
        System.out.println("Color: " + zip1.color);
        System.out.println("Length: " + zip1.length + " cm");
        System.out.println("Is Water Resistant: " + zip1.isWaterResistant);
        System.out.println("Is Auto Lock: " + zip1.isAutoLock);
        System.out.println("Is Two Way: " + zip1.isTwoWay);
        System.out.println("Is Rust Proof: " + zip1.isRustProof);
        System.out.println("Teeth Count: " + zip1.teethCount);
        System.out.println("Slider Material: " + zip1.sliderMaterial);
        System.out.println("Usage Type: " + zip1.usageType);
        System.out.println("Country of Origin: " + zip1.countryOfOrigin);
        System.out.println("Price: " + zip1.price + " INR");
        System.out.println("Is Heavy Duty: " + zip1.isHeavyDuty);
        System.out.println("Durability: " + zip1.durability + " years");
        System.out.println("Is Invisible: " + zip1.isInvisible);
        System.out.println("Stitching Pattern: " + zip1.stitchingPattern);
        System.out.println("Is Customizable: " + zip1.isCustomizable);
        System.out.println("Has Pull Tab: " + zip1.hasPullTab);
        System.out.println();

        Zip zip2 = new Zip("SBS", "Plastic", "Nylon", "Blue", 15.0, false, false, true, true, 40, 
                           "Plastic", "Bags", "China", 100.0, false, 4, true, "Zig-Zag", false, false);

        System.out.println("Zip 2 Details:");
        System.out.println("Brand: " + zip2.brand);
        System.out.println("Type: " + zip2.type);
        System.out.println("Material: " + zip2.material);
        System.out.println("Color: " + zip2.color);
        System.out.println("Length: " + zip2.length + " cm");
        System.out.println("Is Water Resistant: " + zip2.isWaterResistant);
        System.out.println("Is Auto Lock: " + zip2.isAutoLock);
        System.out.println("Is Two Way: " + zip2.isTwoWay);
        System.out.println("Is Rust Proof: " + zip2.isRustProof);
        System.out.println("Teeth Count: " + zip2.teethCount);
        System.out.println("Slider Material: " + zip2.sliderMaterial);
        System.out.println("Usage Type: " + zip2.usageType);
        System.out.println("Country of Origin: " + zip2.countryOfOrigin);
        System.out.println("Price: " + zip2.price + " INR");
        System.out.println("Is Heavy Duty: " + zip2.isHeavyDuty);
        System.out.println("Durability: " + zip2.durability + " years");
        System.out.println("Is Invisible: " + zip2.isInvisible);
        System.out.println("Stitching Pattern: " + zip2.stitchingPattern);
        System.out.println("Is Customizable: " + zip2.isCustomizable);
        System.out.println("Has Pull Tab: " + zip2.hasPullTab);
        System.out.println();

        Zip zip3 = new Zip("Coats", "Metal", "Brass", "Silver", 30.0, true, false, true, false, 60, 
                           "Brass", "Luggage", "India", 200.0, true, 6, false, "Cross", true, true);

        System.out.println("Zip 3 Details:");
        System.out.println("Brand: " + zip3.brand);
        System.out.println("Type: " + zip3.type);
        System.out.println("Material: " + zip3.material);
        System.out.println("Color: " + zip3.color);
        System.out.println("Length: " + zip3.length + " cm");
        System.out.println("Is Water Resistant: " + zip3.isWaterResistant);
        System.out.println("Is Auto Lock: " + zip3.isAutoLock);
        System.out.println("Is Two Way: " + zip3.isTwoWay);
        System.out.println("Is Rust Proof: " + zip3.isRustProof);
        System.out.println("Teeth Count: " + zip3.teethCount);
        System.out.println("Slider Material: " + zip3.sliderMaterial);
        System.out.println("Usage Type: " + zip3.usageType);
        System.out.println("Country of Origin: " + zip3.countryOfOrigin);
        System.out.println("Price: " + zip3.price + " INR");
        System.out.println("Is Heavy Duty: " + zip3.isHeavyDuty);
        System.out.println("Durability: " + zip3.durability + " years");
        System.out.println("Is Invisible: " + zip3.isInvisible);
        System.out.println("Stitching Pattern: " + zip3.stitchingPattern);
        System.out.println("Is Customizable: " + zip3.isCustomizable);
        System.out.println("Has Pull Tab: " + zip3.hasPullTab);
    }
}
