class ChocolateRunner 
{
    public static void main(String[] args) 
    {
        Chocolate chocolate1 = new Chocolate("Cadbury", "Dairy Milk", 100, 2.5, "Milk Chocolate", true, false, 
                                             40.0, false, "UK", false, false, "None", 12, "Wrapper", false, 
                                             false, true, true, "Cadbury Ltd");

        System.out.println("Chocolate 1 Details:");
        System.out.println("Brand: " + chocolate1.brand);
        System.out.println("Name: " + chocolate1.name);
        System.out.println("Weight: " + chocolate1.weight + "g");
        System.out.println("Price: $" + chocolate1.price);
        System.out.println("Flavor: " + chocolate1.flavor);
        System.out.println("Has Nuts: " + chocolate1.hasNuts);
        System.out.println("Is Dark Chocolate: " + chocolate1.isDarkChocolate);
        System.out.println("Cocoa Percentage: " + chocolate1.cocoaPercentage + "%");
        System.out.println("Is Sugar-Free: " + chocolate1.isSugarFree);
        System.out.println("Country of Origin: " + chocolate1.countryOfOrigin);
        System.out.println("Has Caramel: " + chocolate1.hasCaramel);
        System.out.println("Has Filling: " + chocolate1.hasFilling);
        System.out.println("Filling Type: " + chocolate1.fillingType);
        System.out.println("Shelf Life: " + chocolate1.shelfLife + " months");
        System.out.println("Packaging Type: " + chocolate1.packagingType);
        System.out.println("Is Organic: " + chocolate1.isOrganic);
        System.out.println("Is Vegan: " + chocolate1.isVegan);
        System.out.println("Has Milk: " + chocolate1.hasMilk);
        System.out.println("Is Gluten-Free: " + chocolate1.isGlutenFree);
        System.out.println("Manufacturer: " + chocolate1.manufacturer);
        System.out.println();

        Chocolate chocolate2 = new Chocolate("Lindt", "Lindt Excellence", 150, 4.99, "Dark Chocolate", false, true, 
                                             85.0, false, "Switzerland", false, false, "None", 18, "Box", true, 
                                             true, false, true, "Lindt & Sprüngli");

        System.out.println("Chocolate 2 Details:");
        System.out.println("Brand: " + chocolate2.brand);
        System.out.println("Name: " + chocolate2.name);
        System.out.println("Weight: " + chocolate2.weight + "g");
        System.out.println("Price: $" + chocolate2.price);
        System.out.println("Flavor: " + chocolate2.flavor);
        System.out.println("Has Nuts: " + chocolate2.hasNuts);
        System.out.println("Is Dark Chocolate: " + chocolate2.isDarkChocolate);
        System.out.println("Cocoa Percentage: " + chocolate2.cocoaPercentage + "%");
        System.out.println("Is Sugar-Free: " + chocolate2.isSugarFree);
        System.out.println("Country of Origin: " + chocolate2.countryOfOrigin);
        System.out.println("Has Caramel: " + chocolate2.hasCaramel);
        System.out.println("Has Filling: " + chocolate2.hasFilling);
        System.out.println("Filling Type: " + chocolate2.fillingType);
        System.out.println("Shelf Life: " + chocolate2.shelfLife + " months");
        System.out.println("Packaging Type: " + chocolate2.packagingType);
        System.out.println("Is Organic: " + chocolate2.isOrganic);
        System.out.println("Is Vegan: " + chocolate2.isVegan);
        System.out.println("Has Milk: " + chocolate2.hasMilk);
        System.out.println("Is Gluten-Free: " + chocolate2.isGlutenFree);
        System.out.println("Manufacturer: " + chocolate2.manufacturer);
        System.out.println();

        Chocolate chocolate3 = new Chocolate("Ferrero", "Ferrero Rocher", 200, 10.99, "Hazelnut", true, false, 
                                             30.0, false, "Italy", true, true, "Hazelnut Cream", 15, "Gold Foil", 
                                             false, false, true, false, "Ferrero SpA");

        System.out.println("Chocolate 3 Details:");
        System.out.println("Brand: " + chocolate3.brand);
        System.out.println("Name: " + chocolate3.name);
        System.out.println("Weight: " + chocolate3.weight + "g");
        System.out.println("Price: $" + chocolate3.price);
        System.out.println("Flavor: " + chocolate3.flavor);
        System.out.println("Has Nuts: " + chocolate3.hasNuts);
        System.out.println("Is Dark Chocolate: " + chocolate3.isDarkChocolate);
        System.out.println("Cocoa Percentage: " + chocolate3.cocoaPercentage + "%");
        System.out.println("Is Sugar-Free: " + chocolate3.isSugarFree);
        System.out.println("Country of Origin: " + chocolate3.countryOfOrigin);
        System.out.println("Has Caramel: " + chocolate3.hasCaramel);
        System.out.println("Has Filling: " + chocolate3.hasFilling);
        System.out.println("Filling Type: " + chocolate3.fillingType);
        System.out.println("Shelf Life: " + chocolate3.shelfLife + " months");
        System.out.println("Packaging Type: " + chocolate3.packagingType);
        System.out.println("Is Organic: " + chocolate3.isOrganic);
        System.out.println("Is Vegan: " + chocolate3.isVegan);
        System.out.println("Has Milk: " + chocolate3.hasMilk);
        System.out.println("Is Gluten-Free: " + chocolate3.isGlutenFree);
        System.out.println("Manufacturer: " + chocolate3.manufacturer);
    }
}
