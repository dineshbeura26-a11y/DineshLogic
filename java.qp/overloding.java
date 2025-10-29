
class Overloding {
    void display() {
        System.out.println("dinesh coder");
    }
}

class Omm extends Overloding {
    @Override
    void display() {
        System.out.println("data analysis");
    }
}

public class Code {
    public static void main(String[] args) {
        Overloding obj1 = new Overloding();
        obj1.display();

        Overloding obj2 = new Omm();
        obj2.display();
    }
}