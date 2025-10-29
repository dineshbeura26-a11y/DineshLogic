import java.util.*;
public class sumofprime {
   public static void main(String args[])
   {
    Scanner sc=new Scanner (System.in);
    System.out.println("enter a number:");
    int num =sc.nextInt();
    int sum=0;
    while(num>0){
        int digit =num%10;
        if(digit==2||digit==3||digit==5||digit==7)
        sum+=digit;
        num/=10;
    }
    System.out.println("sum of prime digits:"+sum);

   } 
}
