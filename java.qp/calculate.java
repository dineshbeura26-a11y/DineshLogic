import java.util.Scanner;

public class calculate {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter principal amount(p):");
        double p=sc.nextDouble();
        System.out.println("enter rate of interest(r):");
        double r = sc.nextDouble();
        System.out.println("enter the time of year(t):");
        double t =sc.nextDouble();
        double simpleInterest = (p*r*t)/100;
        System.out.println("simpleinterest="+simpleInterest);
    }
}
