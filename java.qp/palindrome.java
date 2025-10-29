import java.util.*;
public class palindrome {
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number :");
        int num =sc.nextInt();
        int original = num,reversed =0;
        while (num>0){
            int digit =num% 10;
            reversed = reversed*10+digit;
            num/=10;
        }
        if (original ==reversed)
        System.out.println("palinderome");
        else
             System.out.println("not palinderom");

    }
}
