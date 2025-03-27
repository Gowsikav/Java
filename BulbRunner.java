public class BulbRunner 
{
    public static void main(String[] args) 
    {
        String brand = "Philips";
        int wattage = 9;
        String type = "LED";
        String color = "Warm White";
        boolean isSmart = true;
        int lifespan = 25000;
        double price = 12.99;
        String shape = "A19";
        boolean isDimmable = true;
        String baseType = "E26";
        boolean isEnergyEfficient = true;

        Bulb bulb1 = new Bulb();
        bulb1.info();

        Bulb bulb2 = new Bulb(brand);
        bulb2.info();

        Bulb bulb3 = new Bulb(brand, wattage);
        bulb3.info();

        Bulb bulb4 = new Bulb(brand, wattage, type);
        bulb4.info();

        Bulb bulb5 = new Bulb(brand, wattage, type, color);
        bulb5.info();

        Bulb bulb6 = new Bulb(brand, wattage, type, color, isSmart);
        bulb6.info();

        Bulb bulb7 = new Bulb(brand, wattage, type, color, isSmart, lifespan);
        bulb7.info();

        Bulb bulb8 = new Bulb(brand, wattage, type, color, isSmart, lifespan, price);
        bulb8.info();

        Bulb bulb9 = new Bulb(brand, wattage, type, color, isSmart, lifespan, price, shape);
        bulb9.info();

        Bulb bulb10 = new Bulb(brand, wattage, type, color, isSmart, lifespan, price, shape, isDimmable);
        bulb10.info();

        Bulb bulb11 = new Bulb(brand, wattage, type, color, isSmart, lifespan, price, shape, isDimmable, baseType, isEnergyEfficient);
        bulb11.info();
    }
}
