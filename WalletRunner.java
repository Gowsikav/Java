public class WalletRunner 
{
    public static void main(String[] args) 
    {
        String material = "Leather";
        String color = "Brown";
        boolean isLeather = true;
        int capacity = 10;
        String brand = "Gucci";
        double price = 199.99;
        boolean hasRFIDProtection = true;
        boolean isBiFold = true;
        boolean hasCoinPocket = false;
        int id = 1001;
        String owner = "John Doe";

        Wallet wallet = new Wallet();
        wallet.info();

        Wallet wallet1 = new Wallet(material);
        wallet1.info();

        Wallet wallet2 = new Wallet(material, color);
        wallet2.info();

        Wallet wallet3 = new Wallet(material, color, isLeather);
        wallet3.info();

        Wallet wallet4 = new Wallet(material, color, isLeather, capacity);
        wallet4.info();

        Wallet wallet5 = new Wallet(material, color, isLeather, capacity, brand);
        wallet5.info();

        Wallet wallet6 = new Wallet(material, color, isLeather, capacity, brand, price);
        wallet6.info();

        Wallet wallet7 = new Wallet(material, color, isLeather, capacity, brand, price, hasRFIDProtection);
        wallet7.info();

        Wallet wallet8 = new Wallet(material, color, isLeather, capacity, brand, price, hasRFIDProtection, isBiFold);
        wallet8.info();

        Wallet wallet9 = new Wallet(material, color, isLeather, capacity, brand, price, hasRFIDProtection, isBiFold, hasCoinPocket);
        wallet9.info();

        Wallet wallet10 = new Wallet(material, color, isLeather, capacity, brand, price, hasRFIDProtection, isBiFold, hasCoinPocket, id, owner);
        wallet10.info();
    }
}
