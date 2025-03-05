class MethodCounter
{
    static int count = 0;

    static void displayCount()
     {
        count++;
        System.out.println("Method invoked " + count + " times.");
    }

    public static void main(String[] args) {
        for(int i=1;i<5;i++)
        displayCount();
    }
}