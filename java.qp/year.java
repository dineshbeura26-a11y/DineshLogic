public class year {
    public static void main(String args[])
    {
        System.out.println("enter a year:");
        int year = 2025;
        if((year % 400==0)||(year% 4==0&&year%100!=0))
        {
            System.out.println(year+"is a leap year.");
        }else{
            System.out.println(year+"is not a leap year.");
        }
    }
}
