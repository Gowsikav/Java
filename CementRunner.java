public class CementRunner 
{
    public static void main(String[] args) 
    {
        String type = "Portland Cement";
        double weight = 50.0;
        String color = "Gray";
        double price = 350.00;
        boolean isWaterproof = true;
        int id = 301;
        String brand = "UltraCem";
        int grade = 43;
        String usage = "Construction";
        boolean isQuickDry = false;

        Cement cement = new Cement();
        cement.info();

        Cement cement1 = new Cement(type);
        cement1.info();

        Cement cement2 = new Cement(type, weight);
        cement2.info();

        Cement cement3 = new Cement(type, weight, color);
        cement3.info();

        Cement cement4 = new Cement(type, weight, color, price);
        cement4.info();

        Cement cement5 = new Cement(type, weight, color, price, isWaterproof);
        cement5.info();

        Cement cement6 = new Cement(type, weight, color, price, isWaterproof, id);
        cement6.info();

        Cement cement7 = new Cement(type, weight, color, price, isWaterproof, id, brand);
        cement7.info();

        Cement cement8 = new Cement(type, weight, color, price, isWaterproof, id, brand, grade);
        cement8.info();

        Cement cement9 = new Cement(type, weight, color, price, isWaterproof, id, brand, grade, usage);
        cement9.info();

        Cement cement10 = new Cement(type, weight, color, price, isWaterproof, id, brand, grade, usage, isQuickDry);
        cement10.info();
    }
}
