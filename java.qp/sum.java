public class sum
{
    public static void main(String args[]){
      int num =2;  
    int sum =0;
    for(int i=1;i<num;i++) 
    {
    
    for(int j=1;j<i;j++)
    {
        int f=0;
        if(i%j==0)
        {
            f =1;
            break;
        }
    if (f ==0){
                    System.out.println("i");
        sum=sum +1;   
}
System.out.println(sum);
}
}
    }

}