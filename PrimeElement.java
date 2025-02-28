class PrimeElement {
    public static void main(String[] args) {
        int[] list = {2, 5, 8, 49, 86, 7, 94, 6};

        for (int index = 0; index < list.length; index++) {
            if (isPrime(list[index])) {
                System.out.println(list[index] + " is a Prime Number");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) return false; 

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
