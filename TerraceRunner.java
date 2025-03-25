class TerraceRunner 
{
    public static void main(String[] args)
    {
        Terrace terrace = new Terrace();
        System.out.println("Default height value: " + terrace.height);
        System.out.println("Default area value: " + terrace.area);
        System.out.println("Default hasRailing value: " + terrace.hasRailing);
        System.out.println("Default color value: " + terrace.color);

        terrace.height = 20;
        terrace.area = 150;
        terrace.hasRailing = true;
        terrace.color = "Blue";

        System.out.println("Updated height value: " + terrace.height);
        System.out.println("Updated area value: " + terrace.area);
        System.out.println("Updated hasRailing value: " + terrace.hasRailing);
        System.out.println("Updated color value: " + terrace.color);
    }
}
