 class side {
    int length;
    int breadth;
    int area(){
        return length * breadth;
    }
}
public class area(){
    int length=0;

    public static void main()
    {
        area obj =new area();
        length =10;
    }

}
public class SumCalculator {
    
    // Constructor for adding two integers
    SumCalculator(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two integers: " + sum);
    }

    // Constructor for adding three integers
    SumCalculator(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of three integers: " + sum);
    }

    // Constructor for adding two doubles
    SumCalculator(double a, double b) {
        double sum = a + b;
        System.out.println("Sum of two doubles: " + sum);
    }

    // Constructor for adding an integer and a double
    SumCalculator(int a, double b) {
        double sum = a + b;
        System.out.println("Sum of integer and double: " + sum);
    }

    public static void main(String[] args) {
        // Creating objects of the SumCalculator class with different constructor calls
        SumCalculator obj1 = new SumCalculator(10, 20);           // Sum of two integers
        SumCalculator obj2 = new SumCalculator(10, 20, 30);       // Sum of three integers
        SumCalculator obj3 = new SumCalculator(10.5, 20.3);       // Sum of two doubles
        SumCalculator obj4 = new SumCalculator(10, 20.5);         // Sum of integer and double
    }
}

