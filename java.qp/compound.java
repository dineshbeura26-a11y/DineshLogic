import java.util.Scanner;
public class compound {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter principal amount(p):");
        double p=sc.nextDouble();
        System.out.println("enter rate of interest(r):");
        double r = sc.nextDouble();
        System.out.println("enter the time of year(t):");
        double t =sc.nextDouble();
        System.out.println("enter number of time interest is compounded per year(n):");
        int n= sc.nextInt();
        double amount =p* Math.pow(1+(r /(100* n)),n*t);
        double compoundInterest =amount -p;
        System.out.println("final amount(a)="+amount);
        System.out.println("compound Interest ="+compoundInterest);
    }
}
