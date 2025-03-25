class SirenRunner 
{
    public static void main(String[] args) 
    {
        Siren siren = new Siren();
        System.out.println("Default type value: " + siren.type);
        System.out.println("Default volume value: " + siren.volume);
        System.out.println("Default isLoud value: " + siren.isLoud);
        System.out.println("Default color value: " + siren.color);

        siren.type = "Police Siren";
        siren.volume = 100;
        siren.isLoud = true;
        siren.color = "Red";

        System.out.println("Updated type value: " + siren.type);
        System.out.println("Updated volume value: " + siren.volume);
        System.out.println("Updated isLoud value: " + siren.isLoud);
        System.out.println("Updated color value: " + siren.color);
    }
}
