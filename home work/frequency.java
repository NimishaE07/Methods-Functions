class frequency {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 1, 4, 2};

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean visited = false;

            // check if already counted
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    visited = true;
                    break;
                }
            }

            if (visited) continue;

            // count frequency
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
