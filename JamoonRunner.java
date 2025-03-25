class JamoonRunner 
{
    public static void main(String[] args) 
    {
        Jamoon jamoon = new Jamoon();
        System.out.println("Default color value: " + jamoon.color);
        System.out.println("Default taste value: " + jamoon.taste);
        System.out.println("Default quantity value: " + jamoon.quantity);
        System.out.println("Default isSweet value: " + jamoon.isSweet);

        jamoon.color = "Brown";
        jamoon.taste = "Delicious";
        jamoon.quantity = 10;
        jamoon.isSweet = true;

        System.out.println("Updated color value: " + jamoon.color);
        System.out.println("Updated taste value: " + jamoon.taste);
        System.out.println("Updated quantity value: " + jamoon.quantity);
        System.out.println("Updated isSweet value: " + jamoon.isSweet);
    }
}
