import java.util.Scanner;

public class S3Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}
