class ArrayDisplay 
{
    static void displayArray() 
    {
        int[] arr = {1, 2, 3, 4, 5}; 
        System.out.print("Array Elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        displayArray();
    }
}