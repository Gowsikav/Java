class MirrorRunner 
{
    public static void main(String[] args) 
    {
        Mirror mirror1 = new Mirror("Philips", "Round", "Metal", "HD", 40, 30, 3.5, true, true, true, 
                                    "Tempered", "Silver", 5, true, true, "Bathroom", "Germany", 99.99, 
                                    "MR123", "Philips Inc.");

        System.out.println("Mirror 1 Details:");
        System.out.println("Brand: " + mirror1.brand);
        System.out.println("Shape: " + mirror1.shape);
        System.out.println("Frame Material: " + mirror1.frameMaterial);
        System.out.println("Reflection Quality: " + mirror1.reflectionQuality);
        System.out.println("Height: " + mirror1.height);
        System.out.println("Width: " + mirror1.width);
        System.out.println("Weight: " + mirror1.weight);
        System.out.println("Is Anti-Fog: " + mirror1.isAntiFog);
        System.out.println("Is Wall Mounted: " + mirror1.isWallMounted);
        System.out.println("Has Lighting: " + mirror1.hasLighting);
        System.out.println("Glass Type: " + mirror1.glassType);
        System.out.println("Frame Color: " + mirror1.frameColor);
        System.out.println("Thickness: " + mirror1.thickness);
        System.out.println("Is Shatterproof: " + mirror1.isShatterproof);
        System.out.println("Is Scratch Resistant: " + mirror1.isScratchResistant);
        System.out.println("Usage: " + mirror1.usage);
        System.out.println("Country of Origin: " + mirror1.countryOfOrigin);
        System.out.println("Price: $" + mirror1.price);
        System.out.println("Model Number: " + mirror1.modelNumber);
        System.out.println("Manufacturer: " + mirror1.manufacturer);

        Mirror mirror2 = new Mirror("IKEA", "Rectangle", "Wood", "Standard", 50, 40, 4.0, false, false, false, 
                                    "Standard", "Brown", 4, false, true, "Bedroom", "Sweden", 59.99, 
                                    "IK789", "IKEA Ltd.");

        System.out.println("\nMirror 2 Details:");
        System.out.println("Brand: " + mirror2.brand);
        System.out.println("Shape: " + mirror2.shape);
        System.out.println("Frame Material: " + mirror2.frameMaterial);
        System.out.println("Reflection Quality: " + mirror2.reflectionQuality);
        System.out.println("Height: " + mirror2.height);
        System.out.println("Width: " + mirror2.width);
        System.out.println("Weight: " + mirror2.weight);
        System.out.println("Is Anti-Fog: " + mirror2.isAntiFog);
        System.out.println("Is Wall Mounted: " + mirror2.isWallMounted);
        System.out.println("Has Lighting: " + mirror2.hasLighting);
        System.out.println("Glass Type: " + mirror2.glassType);
        System.out.println("Frame Color: " + mirror2.frameColor);
        System.out.println("Thickness: " + mirror2.thickness);
        System.out.println("Is Shatterproof: " + mirror2.isShatterproof);
        System.out.println("Is Scratch Resistant: " + mirror2.isScratchResistant);
        System.out.println("Usage: " + mirror2.usage);
        System.out.println("Country of Origin: " + mirror2.countryOfOrigin);
        System.out.println("Price: $" + mirror2.price);
        System.out.println("Model Number: " + mirror2.modelNumber);
        System.out.println("Manufacturer: " + mirror2.manufacturer);
        
        Mirror mirror3 = new Mirror("Sony", "Oval", "Plastic", "Ultra HD", 60, 45, 5.5, true, true, true, 
                                    "Acrylic", "Black", 6, true, false, "Dressing", "Japan", 129.99, 
                                    "SN456", "Sony Co.");

        System.out.println("\nMirror 3 Details:");
        System.out.println("Brand: " + mirror3.brand);
        System.out.println("Shape: " + mirror3.shape);
        System.out.println("Frame Material: " + mirror3.frameMaterial);
        System.out.println("Reflection Quality: " + mirror3.reflectionQuality);
        System.out.println("Height: " + mirror3.height);
        System.out.println("Width: " + mirror3.width);
        System.out.println("Weight: " + mirror3.weight);
        System.out.println("Is Anti-Fog: " + mirror3.isAntiFog);
        System.out.println("Is Wall Mounted: " + mirror3.isWallMounted);
        System.out.println("Has Lighting: " + mirror3.hasLighting);
        System.out.println("Glass Type: " + mirror3.glassType);
        System.out.println("Frame Color: " + mirror3.frameColor);
        System.out.println("Thickness: " + mirror3.thickness);
        System.out.println("Is Shatterproof: " + mirror3.isShatterproof);
        System.out.println("Is Scratch Resistant: " + mirror3.isScratchResistant);
        System.out.println("Usage: " + mirror3.usage);
        System.out.println("Country of Origin: " + mirror3.countryOfOrigin);
        System.out.println("Price: $" + mirror3.price);
        System.out.println("Model Number: " + mirror3.modelNumber);
        System.out.println("Manufacturer: " + mirror3.manufacturer);

    }
}
