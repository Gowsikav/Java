public class AK47Runner 
{
    public static void main(String[] args) 
    {
        String manufacturer = "Ram";
        double weight = 3.47;
        int magazineCapacity = 30;
        double caliber = 7.62;
        int fireRate = 600;
        String countryOfOrigin = "India";
        boolean isAutomatic = true;
        String material = "Steel & Wood";
        int effectiveRange = 400;
        double barrelLength = 16.3;
        boolean hasBayonet = false;

        AK47 ak1 = new AK47();
        ak1.info();

        AK47 ak2 = new AK47(manufacturer);
        ak2.info();

        AK47 ak3 = new AK47(manufacturer, weight);
        ak3.info();

        AK47 ak4 = new AK47(manufacturer, weight, magazineCapacity);
        ak4.info();

        AK47 ak5 = new AK47(manufacturer, weight, magazineCapacity, caliber);
        ak5.info();

        AK47 ak6 = new AK47(manufacturer, weight, magazineCapacity, caliber, fireRate);
        ak6.info();

        AK47 ak7 = new AK47(manufacturer, weight, magazineCapacity, caliber, fireRate, countryOfOrigin);
        ak7.info();

        AK47 ak8 = new AK47(manufacturer, weight, magazineCapacity, caliber, fireRate, countryOfOrigin, isAutomatic);
        ak8.info();

        AK47 ak9 = new AK47(manufacturer, weight, magazineCapacity, caliber, fireRate, countryOfOrigin, isAutomatic, material);
        ak9.info();

        AK47 ak10 = new AK47(manufacturer, weight, magazineCapacity, caliber, fireRate, countryOfOrigin, isAutomatic, material, effectiveRange);
        ak10.info();

        AK47 ak11 = new AK47(manufacturer, weight, magazineCapacity, caliber, fireRate, countryOfOrigin, isAutomatic, material, effectiveRange, barrelLength, hasBayonet);
        ak11.info();
    }
}
