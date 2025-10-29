
public class math {
    public static void main(String args[]){
        int n=135;
        int count=0;
        int temp=n;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        while(n>=0){
            int rem=n%10;
            sum=math.pow(rem,digit--);
            n=n/10;
        }
        if(sum==n){
            System.out.println(sum);
        }
        }

}
