class SoftwareInfo 
{
    static String name = "Java Application";
    static String version = "1.0.0";

    static void displaySoftwareInfo()
    {
        System.out.println("Software Name: " + name);
        System.out.println("Version: " + version);
    }

    public static void main(String[] args) {
        displaySoftwareInfo();
    }

}