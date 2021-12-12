import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int arr[] = new int[r];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int o = 0;
        {
    }
    for(int i = 1;i<arr.length;i++) {
        if (arr[i] > max) {
            max = arr[i];
            o = 1;
        }
    }
        System.out.println("mecy " + max + " indexov");

    }
}
