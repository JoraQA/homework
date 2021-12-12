public class Homework {
    public static void main(String[] args) {
                //Scanner scanner = new Scanner(System.in);
                int num = 879;
                int n = 0;
                for (int i = 0; num > 0; i++) {
                    n = num % 10;
                    num = num / 10;
                    System.out.print(n);
                }

            }
    }

