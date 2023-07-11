import java.util.Scanner;

public class S3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Total_cost = scanner.nextInt();
        int Total_num_type = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < Total_num_type; i++) {
            int cost = scanner.nextInt();
            int num_type = scanner.nextInt();
            sum += cost * num_type;
        }
        if (sum == Total_cost) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
