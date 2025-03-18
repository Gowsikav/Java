public class ZomatoApp 
{

    static double totalAmount = 0,discount=0;
    static int totalOrders = 0;

    static double getPrice(String itemName) 
    {
      itemName = itemName.toLowerCase();
    
      if (itemName.equals("pizza")) {
        return 300;
      } 
      else if (itemName.equals("burger")) {
        return 150;
      } 
      else if (itemName.equals("fries")) {
        return 100;
      } 
      else if (itemName.equals("biryani")) {
        return 250;
      } 
      else if (itemName.equals("pasta")) {
        return 200;
      } 
      else if (itemName.equals("momos")) {
        return 120;
      } 
      else if (itemName.equals("sandwich")) {
        return 80;
      }
       else {
        return 100;
      }
    }

   static double applyDiscount(double amount)
    {
        if (amount > 500) {
            double discounted = (amount *10)/100;
            System.out.println("Applied 10% discount!");
            return discounted;
        }
        return 0;
    }

    static void orderFood(String itemName) 
    {
        double price = getPrice(itemName);
        totalAmount += price;
        totalOrders++;
        System.out.println("Ordered: " + itemName + " Price: " + price);
    }

    static void orderFood(String itemName, int quantity)
    {
        double price = getPrice(itemName) * quantity;
        totalAmount += price;
        totalOrders++;
        discount=applyDiscount(price);
        System.out.println("Ordered: " + itemName + " " + quantity + " Total Price: " + (price-discount));
    }

    static void orderFood(String[] itemNames) 
    {
        double sum = 0;
        System.out.println("\nOrdered multiple items:");
        for (String item : itemNames)
         {
            double price = getPrice(item);
            sum += price;
            System.out.println(item + " Price: " + price);
        }
        totalAmount += sum;
        totalOrders++;
        discount=applyDiscount(sum);
        System.out.println("Total for this order: " + (sum-discount));
    }

    static void orderFood(String itemName, String address)
    {
        double price = getPrice(itemName);
        totalAmount += price;
        totalOrders++;
        System.out.println("Ordered: " + itemName + " Price: " + price);
        System.out.println("Delivery Address: " + address);
    }

    static void orderFood(String itemName, int quantity, String address)
     {
        double price = getPrice(itemName) * quantity;
        totalAmount += price;
        totalOrders++;
        discount=applyDiscount(price);
        System.out.println("Ordered: " + itemName + " " + quantity + " Total Price: " + (price-discount));
        System.out.println("Delivery Address: " + address);
    }

    static void orderFood(String[] itemNames, String address) 
    {
        double sum = 0;
        System.out.println("\nOrdered multiple items to: " + address);
        for (String item : itemNames)
         {
            double price = getPrice(item);
            sum += price;
            System.out.println(item + " Price: " + price);
        }
        totalAmount += sum;
        totalOrders++;
        discount=applyDiscount(sum);
        System.out.println("Total for this order: " + (sum-discount));
        System.out.println("Delivery Address: " + address);
    }
     
    static void orderFood(String itemName, int quantity, String address, String paymentMethod) 
    {
        double price = getPrice(itemName) * quantity;
        totalAmount += discount;
        totalOrders++;
        discount = applyDiscount(price);
        System.out.println("Ordered: " + itemName + " " + quantity + " Price: " + (price-discount));
        System.out.println("Delivery Address: " + address);
        System.out.println("Payment Mode: " + paymentMethod);
    }

    static void details()
    {
        System.out.println("Total Orders: "+totalOrders);
        System.out.println("Total Amount: "+totalAmount);
    }
    
}
