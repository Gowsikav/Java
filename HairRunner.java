class HairRunner 
{
    public static void main(String[] args) 
    {
        Hair hair = new Hair();
        System.out.println("Default type value: " + hair.type);
        System.out.println("Default color value: " + hair.color);
        System.out.println("Default isCurly value: " + hair.isCurly);
        System.out.println("Default length value: " + hair.length);

        hair.type = "Straight";
        hair.color = "Black";
        hair.isCurly = false;
        hair.length = 25;

        System.out.println("Updated type value: " + hair.type);
        System.out.println("Updated color value: " + hair.color);
        System.out.println("Updated isCurly value: " + hair.isCurly);
        System.out.println("Updated length value: " + hair.length);
    }
}
