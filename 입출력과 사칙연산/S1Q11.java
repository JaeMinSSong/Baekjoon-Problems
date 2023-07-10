//10의 12승인 조건을 확인하지 못함 int → long 사용할 것
import java.util.Scanner;

public class S1Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();

        System.out.println(A+B+C);
        scanner.close();
    }
}
