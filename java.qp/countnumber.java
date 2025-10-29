import java.util.*;
public class countnumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num =sc.nextInt();
        int count =0;
        int n =num;
        if(n==0){
            count =1;
        }
        else{
              while(n!=0){
                n =n/10;
              }
        }
        System.out.println("number of digits in"+num+"="+count);
    }
}
