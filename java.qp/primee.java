public class primee {
    public class Primee {
    public static void main(String args[]) {
        int num = 3;
        int sum = 0;

        for (int i = 2; i < num; i++) {
            boolean isprime = true;

            for (int j = 2; j <= i / 2; j++){
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }

            i f (isprime) {
                System.out.println(i); 
                sum++;
            }
        }

        System.out.println("Total prime numbers found: " + sum);
    }
}
}