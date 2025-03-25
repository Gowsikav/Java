class HangerRunner 
{
    public static void main(String[] args) 
    {
        Hanger hanger = new Hanger();
        System.out.println("Default type value: " + hanger.type);
        System.out.println("Default material value: " + hanger.material);
        System.out.println("Default isFoldable value: " + hanger.isFoldable);
        System.out.println("Default quantity value: " + hanger.quantity);

        hanger.type = "Cloth Hanger";
        hanger.material = "Plastic";
        hanger.isFoldable = true;
        hanger.quantity = 10;

        System.out.println("Updated type value: " + hanger.type);
        System.out.println("Updated material value: " + hanger.material);
        System.out.println("Updated isFoldable value: " + hanger.isFoldable);
        System.out.println("Updated quantity value: " + hanger.quantity);
    }
}
