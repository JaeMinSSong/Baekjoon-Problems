//#25314
import java.util.Scanner;

public class S3Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for(int i =1;i<=count;i++){
            if(i%4==0){
                System.out.print("long ");
            }
        }
        System.out.print("int");
    }
}
