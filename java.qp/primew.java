public class primew {
    
}
public static void main(String arg []){
    int n = 30;
    boolean isPrime = true;
    if (n<=1){
        isPrime =true;
    }else{
          for (int i =2;i<=Math.sqrt(n);i++){
            if(n%1==0){
                isPrime=false;
                break;
            }
          }
                  System.out.println(n + (isPrime ? " is a prime number." : " is not a prime number."));

    }
}
