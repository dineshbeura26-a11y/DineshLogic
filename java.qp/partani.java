public class partani {
    

    public static void main(String[] args) {
        int n = 5; // Size of the square

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' if it's the border
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space inside
                }
            }
            System.out.println(); // Move to next line
        }
    }
}