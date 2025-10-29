

    public class Areae {
    double areaRect;  
    double areaCir;   
    
    
    Areae(double r) {
        areaCir = Math.PI * r * r;  
        System.out.println("Area of Circle: " + areaCir);
    }


    Areae(int l, int b) {
        areaRect = l * b; 
        System.out.println("Area of Rectangle: " + areaRect);
    }

    public static void main(String[] args) {
        Areae obj1 = new Areae(10.5);  
        Areae obj2 = new Areae(23, 12);  
    }
}

