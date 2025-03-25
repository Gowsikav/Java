class CraneRunner 
{
    public static void main(String[] args) 
    {
        Crane crane = new Crane();
        System.out.println("Default type value: " + crane.type);
        System.out.println("Default capacity value: " + crane.capacity);
        System.out.println("Default isOperational value: " + crane.isOperational);
        System.out.println("Default color value: " + crane.color);

        crane.type = "Tower Crane";
        crane.capacity = 5000;
        crane.isOperational = true;
        crane.color = "Yellow";

        System.out.println("Updated type value: " + crane.type);
        System.out.println("Updated capacity value: " + crane.capacity);
        System.out.println("Updated isOperational value: " + crane.isOperational);
        System.out.println("Updated color value: " + crane.color);
    }
}
