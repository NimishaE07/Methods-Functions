class search {
    public static void main(String[] args) {

        int arr[] = {5, 10, 15, 20, 25};
        int key = 15;   // element to search
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
