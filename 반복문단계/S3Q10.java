import java.util.Scanner;

public class S3Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i=1; i<=N;i++){
            for(int k=N-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
