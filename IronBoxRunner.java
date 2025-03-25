class IronBoxRunner 
{
    public static void main(String[] args) 
    {
        IronBox ironBox = new IronBox();
        System.out.println("Default brand value: " + ironBox.brand);
        System.out.println("Default power value: " + ironBox.power);
        System.out.println("Default isSteamIron value: " + ironBox.isSteamIron);
        System.out.println("Default color value: " + ironBox.color);

        ironBox.brand = "Philips";
        ironBox.power = 1200;
        ironBox.isSteamIron = true;
        ironBox.color = "Blue";

        System.out.println("Updated brand value: " + ironBox.brand);
        System.out.println("Updated power value: " + ironBox.power);
        System.out.println("Updated isSteamIron value: " + ironBox.isSteamIron);
        System.out.println("Updated color value: " + ironBox.color);
    }
}
