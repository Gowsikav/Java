class PerfectSquare {
    public static void main(String[] args) {
        int arr[] = {4, 9, 16, 25};
        boolean isPerfect = true;

        for (int num : arr) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt != num) {
                isPerfect = false;
                break;
            }
        }

        System.out.println("Perfect Square Array: " + isPerfect);
    }
}