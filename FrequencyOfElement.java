class FrequencyOfElement {
    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 4, 5, 6, 6, 3};
        int visited[] = new int[arr.length]; 
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) continue; 

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = 1; 
                }
            }
            System.out.println(arr[i] + "-" + count);
        }
    }
}
