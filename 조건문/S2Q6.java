import java.util.Scanner;

public class S2Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int T = scanner.nextInt();

        int HT = T / 60;
        int MT = T % 60;

        if (M + MT >= 60) {
            HT += 1;
            if (H + HT == 24) {
                M = M + MT - 60;
                H = 0;
            } else if (H + HT > 24) {
                M = M + MT - 60;
                H = H + HT - 24;
            } else {
                M = M + MT - 60;
                H = H + HT;
            }
        }
        else{
            if (H + HT == 24) {
                M = M + MT;
                H = 0;
            } else if (H + HT > 24) {
                M = M + MT;
                H = H + HT - 24;
            } else {
                M = M + MT;
                H = H + HT;
            }
        }
        System.out.println(H+" "+M);
    }
}
