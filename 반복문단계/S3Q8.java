//#11022
//동적배열 사용 익혀둘 것!
//풀이 확인
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class S3Q8 {
    public static void main(String args[]) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int case_num = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= case_num; i++) {
            String str = br.readLine();
            int A = str.charAt(0)-'0';
            int B = str.charAt(2)-'0';
            sb.append("Case #").append(i).append(": ").append(A).append(" + ").append(B).append(" = ").append(A+B).append('\n');
        }
        System.out.println(sb);
    }
}