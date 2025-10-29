import java.util.*;
public class perimeter {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of the rectangle:");
        double leangth=sc.nextDouble();
        System.out.println("enter the width of rectangle:");
        double width=sc.nextDouble();
       double perimeter =2*(leangth+width);
       System.out.println("perimeter of the rectangle is :"+ perimeter);
    }
}
