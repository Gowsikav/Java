class Cosmetics 
{
    static String[] cosmeticNameList = {null, null, null};
    static int[][] codeAndPrice = {{0, 0, 0}, {0, 0, 0}};
    static int index = 0, place = 0;

    
    static void saveCosmeticName(String name, int code, int price) 
    {
        if (!isPresent(name)) 
        {
            if (index < cosmeticNameList.length)
             {
                cosmeticNameList[index] = name;
                codeAndPrice[0][index] = code;
                codeAndPrice[1][index] = price;
                System.out.println(name + " cosmetic is added");
                index++;
            } 
            else {
                System.out.println("Cosmetic List is Full, we can't add");
            }
        } 
        else {
            System.out.println(name + " is already present, we can't add");
        }
    }

    
    static boolean isPresent(String name)
     {
        if (cosmeticNameList == null)
         return false;
        for (int i = 0; i < cosmeticNameList.length; i++) 
        {
            if (cosmeticNameList[i] != null && cosmeticNameList[i].equalsIgnoreCase(name))
             {
                place = i;
                return true;
            }
        }
        return false;
    }

    
    static void display() 
    {
        if (cosmeticNameList != null) 
        {
            System.out.println("\nCosmetics List:");
            for (int i = 0; i < cosmeticNameList.length; i++) 
            {
                if (cosmeticNameList[i] != null)
                {
                    System.out.println("Code: " + codeAndPrice[0][i] + "  Name: " + cosmeticNameList[i] + "  Price: " + codeAndPrice[1][i]);
                }
            }
        } 
        else {
            System.out.println("Cosmetics List is Empty");
        }
    }

    
    static void delete(String name) 
    {
        if (isPresent(name))
         {
            cosmeticNameList[place] = null;
            codeAndPrice[0][place] = 0;
            codeAndPrice[1][place] = 0;
            System.out.println(name + " is deleted from cosmetics list");
        } 
        else {
            System.out.println(name + " is not present in Cosmetics List");
        }
    }


    static void update(String name, String newName) 
    {
        if (isPresent(name)) 
        {
            cosmeticNameList[place] = newName;
            System.out.println(name + " is updated to " + newName);
        } 
        else {
            System.out.println(name + " is not present in Cosmetics List");
        }
    }
}
