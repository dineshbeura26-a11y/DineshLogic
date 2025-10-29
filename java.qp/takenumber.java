public class takenumber {
    public static void main(String args[]){
        int n = 23;
        int digit=0;
        while(n!=0)
        {
          n=n/23;
          digit++;
        }
        int square=n*n;
        int temp =(int)Math.pow(10,digit);
        int resut= square%temp;
        if (n==resut){
            System.out.println("number of automorphic");
        }
        
    }
}
