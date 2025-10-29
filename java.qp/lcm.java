public class lcm {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 26;

        int gcd = findGCD(num1, num2);
        int lcm = (num1 * num2) / gcd;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


