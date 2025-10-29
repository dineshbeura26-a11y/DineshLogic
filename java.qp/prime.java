import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first floating number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second floating number: ");
        float num2 = sc.nextFloat();

        float product = num1 * num2;
        System.out.println("The product is: " + product);

        sc.close();
    }
}
