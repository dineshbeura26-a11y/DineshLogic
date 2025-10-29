public class amstrongnumber {
    public static void main(String args[]){
        
        for (int i=1;i<=1000;i++){
           // int n= 1000;
        int sum =0;
        int digit=0;
        int m=i;
            while (m!=0) {
                
                m=m/10;
                digit++;
                
            }
            int j=i;
            while (m!=0)
            {

                int r=j%10;
                sum =sum+(int)Math.pow(r,digit);
                j=j/10;

            }
                
            }
                if(sum==i){
                  System.out.println(i);
                }
                

        }
    }

