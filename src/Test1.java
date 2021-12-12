import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x == 1 || y == 1 || z == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
        System.out.println(x==1 || y==1 ||  z==1);
    }
}
