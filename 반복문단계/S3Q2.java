//동적배열 사용 익혀둘 것!
import java.util.Scanner;

public class S3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] list = new int[T];

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            list[i] = A + B;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(list[i]);

        }
    }
}
