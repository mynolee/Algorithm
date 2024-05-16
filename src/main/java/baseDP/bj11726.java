package baseDP;

import java.util.*;
import java.io.*;

public class bj11726 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2])%10007;
            //mod 연산을 한 결과값을 출력해야 할 때에는 반드시 연산할 때마다 mod 연산을 해주어야 한다.
            // 계속 숫자를 더하고 마지막 출력시에만 mod연산을 해줄 경우
            // Integer.MAX_VALUE를 넘어 Overflow가 발생하기 때문에 잘못된 값이 출력될 수 있다.
        }

        System.out.println(dp[n]);
    }
}
