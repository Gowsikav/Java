class Fibonacci
 {
    static void printFibonacci()
    {
        int limit = 10; 
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        
        for (int i = 2; i < limit; i++) 
        {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        printFibonacci();
    }
}