//#10951
//EOF의 존재 생각할 것
//https://st-lab.tistory.com/40

import java.util.Scanner;

public class S3Q12 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A + B);

        }
        scanner.close();
    }
}