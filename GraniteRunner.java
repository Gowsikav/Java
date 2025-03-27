public class GraniteRunner 
{
    public static void main(String[] args) 
    {
        String type = "Black Galaxy";
        double weight = 80.0;
        String color = "Black with Gold Flecks";
        double thickness = 2.5;
        boolean isPolished = true;
        int id = 201;
        String origin = "India";
        double price = 500.00;
        String texture = "Glossy";
        boolean isHeatResistant = true;

        Granite granite = new Granite();
        granite.info();

        Granite granite1 = new Granite(type);
        granite1.info();

        Granite granite2 = new Granite(type, weight);
        granite2.info();

        Granite granite3 = new Granite(type, weight, color);
        granite3.info();

        Granite granite4 = new Granite(type, weight, color, thickness);
        granite4.info();

        Granite granite5 = new Granite(type, weight, color, thickness, isPolished);
        granite5.info();

        Granite granite6 = new Granite(type, weight, color, thickness, isPolished, id);
        granite6.info();

        Granite granite7 = new Granite(type, weight, color, thickness, isPolished, id, origin);
        granite7.info();

        Granite granite8 = new Granite(type, weight, color, thickness, isPolished, id, origin, price);
        granite8.info();

        Granite granite9 = new Granite(type, weight, color, thickness, isPolished, id, origin, price, texture);
        granite9.info();

        Granite granite10 = new Granite(type, weight, color, thickness, isPolished, id, origin, price, texture, isHeatResistant);
        granite10.info();
    }
}
