public class pg6 {

    
    public static void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

  
    public static void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }

    public static void main(String[] args) {
        add(10, 20);      
        add(10, 20, 30); 
    }
}
