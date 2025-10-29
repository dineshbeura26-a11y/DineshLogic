public class paper {
    public static void main(String arg[])
    {
        int n= 153;
       int digit=0;
       int t=0;
       int sum=0;
       while (t!=0){
        n=n/10;
        digit++;


       }
        System.out.println("number  no digit"+digit);
            while (t!=0)
              {
                int r=t%10;
                sum=sum+(int)Math.pow(r,digit);
                  t=t/10;

              }  
            if (sum==n)
            System.out.println("the number is armstrong");
        }

       }

    

