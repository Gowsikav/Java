class CosmeticsRunner
 {
    public static void main(String[] args)
     {
        Cosmetics.saveCosmeticName("Lipstick", 1, 23);
        Cosmetics.saveCosmeticName("Eye Liner", 2, 45);
        Cosmetics.saveCosmeticName("Lipstick", 1, 23); 
        Cosmetics.saveCosmeticName("Moisturizer", 3, 40);
        Cosmetics.saveCosmeticName("Nail Polish", 4, 60); 

        if (Cosmetics.isPresent("Eye Liner"))
            System.out.println("Eye Liner is Present at index " + Cosmetics.place);
        else
            System.out.println("Eye Liner is not Present");

        if (Cosmetics.isPresent("Kajal"))
            System.out.println("Kajal is Present at index " + Cosmetics.place);
        else
            System.out.println("Kajal is not Present");

        
        Cosmetics.display();

        
        Cosmetics.delete("Moisturizer");
        Cosmetics.delete("Kajal");

       
        Cosmetics.update("Eye Liner", "Concealer");
        Cosmetics.update("Nail Polish", "Kajal");

        
        Cosmetics.display();
    }
}
