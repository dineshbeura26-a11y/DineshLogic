public class fibonacci {
    
    public static void main(String[] args) {
        int nume = 1000;
        int a = 0, b = 1;

        System.out.println("Fibonacci series up to " + nume + ":");
        while (a <= nume) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}