public class ProductNames 
{
    static String[] productList = {null, null, null, null, null};
    static int index = 0;

    static void saveProduct(String name)
     {
        if (index < productList.length)
         {
            productList[index] = name;
            System.out.println("Product " + name + " successfully added.");
            index++;
        }
         else {
            System.out.println("Product list is full! Cannot add more.");
        }
    }

    static void displayProducts()
     {
        if (productList != null)
         {
            System.out.println("Product Names List:");
            for (String product : productList) {
                System.out.println(product);
            }
        } 
        else {
            System.out.println("Product List is Empty");
        }
    }

    static void searchProduct(String name)
     {
        for (int index = 0; index < productList.length; index++)
         {
            if (productList[index].equalsIgnoreCase(name))
             {
                System.out.println("Product " + name + " is present.");
                break;
            }
            if(index==productList.length-1)
                System.out.println("Product " + name + " is not present.");

        }
    }
}
