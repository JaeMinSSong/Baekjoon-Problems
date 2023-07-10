import java.util.Scanner;

public class S1Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int H_B = B / 100;
        int T_B = (B % 100) / 10;
        int O_B = B % 10;

        System.out.println(O_B * A);
        System.out.println(T_B * A);
        System.out.println(H_B * A);
        System.out.println(A * B);

    }
}
