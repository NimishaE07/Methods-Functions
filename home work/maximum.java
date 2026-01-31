class maximum {
    public static void main(String[] args) {

        int arr[] = {3, 8, 2, 15, 6}; // array

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum number: " + max);
    }
}
