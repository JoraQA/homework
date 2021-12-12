import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        
        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(6);
        }
        for (int x : arr) {
            System.out.print(x + " ");

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
                }
            }
        System.out.println();
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
    }











