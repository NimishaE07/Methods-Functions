public class pg5 {

    // Method 1: no parameters
    public static void add() {
        System.out.println("No parameters");
    }

    // Method 2: two integer parameters
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        add();               // calls first method
        System.out.println(add(10, 20)); // calls second method
    }
}
