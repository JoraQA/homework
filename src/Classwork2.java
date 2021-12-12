public class Classwork2 {


    static int factorial(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;

        }
        return factorial;
    }


    public static void main(String[] args) {
        int y = 5;
        int f = factorial(y);
        System.out.println(f);
    }
}