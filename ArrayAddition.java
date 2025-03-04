class ArrayAddition {
    public static void main(String[] args) {
        int array[] = {9,9,9}; 
        int n = array.length;
        boolean carry=true;
        for (int index = n - 1; index >= 0; index--)
        {
            if(carry)
            {
                array[index]+=1;
                if(array[index]==10)
                {
                    array[index]=0;
                }
                else 
                {
                    carry=false;
                }
            }
        }

        System.out.print("{");
        if(carry)
            System.out.print("1, ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");


        
    }
}
