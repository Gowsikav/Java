public class ClothesBrands 
{
    static String[] brandList = {null, null, null, null, null};
    static int index = 0;

    static void saveBrand(String name) 
    {
        if (index < brandList.length)
        {
            brandList[index] = name;
            System.out.println("Brand " + name + " successfully added.");
            index++;
        } 
        else {
            System.out.println("Clothes Brand list is full! Cannot add more.");
        }
    }

    static void displayBrands()
    {
        if(brandList!=null)
        {
           System.out.println("Clothes Brands List:");
           for (String brand : brandList)
            { 
                System.out.println(brand);
            }
         }
        else 
        {
        System.out.println("Brand List is Empty");
        }
    }

    static void searchBrand(String name)
    {
        for (int index=0;index<brandList.length;index++)
        {
            if ( brandList[index].equalsIgnoreCase(name)) 
            {
                System.out.println("Brand " + name + " is present.");
                break;
            }
            if(index==brandList.length-1)
                System.out.println("Brand " + name + " is not present.");
        }
        
    }
}
