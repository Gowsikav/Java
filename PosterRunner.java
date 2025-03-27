public class PosterRunner 
{
    public static void main(String[] args) 
    {
        double width = 24.0;
        double length = 36.0;
        String content = "Inspirational Quote";
        String material = "Glossy Paper";
        String color = "Multicolor";
        boolean isLaminated = true;
        String brand = "WallDecor";
        double price = 15.99;
        boolean isFramed = false;
        int id = 501;

        Poster poster = new Poster();
        poster.info();

        Poster poster1 = new Poster(width);
        poster1.info();

        Poster poster2 = new Poster(width, length);
        poster2.info();

        Poster poster3 = new Poster(width, length, content);
        poster3.info();

        Poster poster4 = new Poster(width, length, content, material);
        poster4.info();

        Poster poster5 = new Poster(width, length, content, material, color);
        poster5.info();

        Poster poster6 = new Poster(width, length, content, material, color, isLaminated);
        poster6.info();

        Poster poster7 = new Poster(width, length, content, material, color, isLaminated, brand);
        poster7.info();

        Poster poster8 = new Poster(width, length, content, material, color, isLaminated, brand, price);
        poster8.info();

        Poster poster9 = new Poster(width, length, content, material, color, isLaminated, brand, price, isFramed);
        poster9.info();

        Poster poster10 = new Poster(width, length, content, material, color, isLaminated, brand, price, isFramed, id);
        poster10.info();
    }
}
