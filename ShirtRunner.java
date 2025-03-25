class ShirtRunner
{
    public static void main(String[] args) 
    {
        Shirt shirt = new Shirt();
        System.out.println("Default color value: " + shirt.color);
        System.out.println("Default size value: " + shirt.size);
        System.out.println("Default material value: " + shirt.material);
        System.out.println("Default isFullSleeve value: " + shirt.isFullSleeve);

        shirt.color = "Black";
        shirt.size = "L";
        shirt.material = "Cotton";
        shirt.isFullSleeve = true;

        System.out.println("Updated color value: " + shirt.color);
        System.out.println("Updated size value: " + shirt.size);
        System.out.println("Updated material value: " + shirt.material);
        System.out.println("Updated isFullSleeve value: " + shirt.isFullSleeve);
    }
}
