package baseDP;

import java.util.*;
import java.io.*;

public class bj10844 {
    public static void main(String[] args) throws IOException{

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[101];

        dp[1] = 9;

        for(int i = 2; i <= n; i++){
            dp[i] = (2*dp[i - 1] -1) % 1000000000;
        }

        System.out.println(dp[n]);


         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n+1][10]; //사이즈 커서 크기 맞춰줘야

        for(int k = 0; k<10; k++){
            dp[1][k] = 1L;      // Long타입이므로 L 붙여줘야
        }

        for(int i = 2; i <= n;i++) {
            dp[i][0] = (dp[i - 1][1]) % 1000000000;
            dp[i][9] = (dp[i - 1][8]) % 1000000000;
            for (int j = 1; j < 9; j++) {
                dp[i][j] = (dp[i - 1][j - 1] % 1000000000 + dp[i - 1][j + 1] % 1000000000) % 1000000000;
            }

        }
        long sum = 0;
        for(int a = 1; a < 10;a++){
            sum = (sum + dp[n][a])%1000000000;
        }

        System.out.println(sum);


    }
}
