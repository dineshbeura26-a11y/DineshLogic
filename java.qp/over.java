public class over {
       over(int a, int b ){
       int sum =a+b;
       System.out.println("sum of two intergers:"+sum);

    }
    over(int a,int b,int c){
        int sum =a+ b+c;
        System.out.println("sum of three integer:"+sum);

    }
    over(double a,double b){
        double sum =a+b;
        System.out.println("sum of two doubles:"+sum);
    }
    over(int a,double b){
        double sum =a+b;
        System.out.println("sum of interger and doubal: "+sum);
    }
    public static void main(String args[]){
       over obj1 = new over(10, 20);          
        over obj2 = new over(10, 20, 30);    
         over obj3 = new over(10.5, 20.3);       
        over obj4 = new over(10, 20.5);       
    }
}



