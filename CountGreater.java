class CountGreater {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 25, count = 0;

        for (int num : arr)
         if (num > target) count++;

        System.out.println("Count: " + count);
    }
}