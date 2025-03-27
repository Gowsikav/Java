public class WineRunner 
{
    public static void main(String[] args) 
    {
        String name = "Château Margaux";
        String type = "Red";
        String brand = "Margaux";
        double alcoholContent = 13.5;
        int age = 10;
        String originCountry = "France";
        boolean isSparkling = false;
        String grapeVariety = "Cabernet Sauvignon";
        double bottleSize = 750;
        double price = 500.00;
        boolean isOrganic = true;

        Wine wine1 = new Wine();
        wine1.info();

        Wine wine2 = new Wine(name);
        wine2.info();

        Wine wine3 = new Wine(name, type);
        wine3.info();

        Wine wine4 = new Wine(name, type, brand);
        wine4.info();

        Wine wine5 = new Wine(name, type, brand, alcoholContent);
        wine5.info();

        Wine wine6 = new Wine(name, type, brand, alcoholContent, age);
        wine6.info();

        Wine wine7 = new Wine(name, type, brand, alcoholContent, age, originCountry);
        wine7.info();

        Wine wine8 = new Wine(name, type, brand, alcoholContent, age, originCountry, isSparkling);
        wine8.info();

        Wine wine9 = new Wine(name, type, brand, alcoholContent, age, originCountry, isSparkling, grapeVariety);
        wine9.info();

        Wine wine10 = new Wine(name, type, brand, alcoholContent, age, originCountry, isSparkling, grapeVariety, bottleSize);
        wine10.info();

        Wine wine11 = new Wine(name, type, brand, alcoholContent, age, originCountry, isSparkling, grapeVariety, bottleSize, price, isOrganic);
        wine11.info();
    }
}
