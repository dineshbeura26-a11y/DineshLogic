public class neon {
    public static void main(String args[])
    {
        System.out.println("enter a number:");
        int num =12;
        int square= num*num;
        int sum =0;
        while(square>0){
            sum +=square%10;
            square/=10;
        }
        if(sum==num){
            System.out.println(num+"is a neno number.");
        }else{
            System.out.println(num+"is not neno number.");
        }
    }
}
