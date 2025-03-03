class ArrayAddition {
    public static void main(String[] args) {
        int array[] = {0}; 
        int n = array.length;
        
        for (int index = n - 1; index >= 0; index--) {
            array[index] += 1; 

            if (array[index] == 10) 
            {
                array[index] = 0; 
                
                if (index == 0)
                 {
                    int newArray[] = new int[n + 1];
                    newArray[0] = 1; 
                    System.out.print("{");
                    for (int i = 0; i < newArray.length; i++)
                     {
                        System.out.print(newArray[i]);
                        if (i < newArray.length - 1) 
                        {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("}");
                    return; 
                }
            } 
            else 
                break;
        }

        System.out.print("{");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
