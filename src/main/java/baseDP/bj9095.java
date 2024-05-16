package baseDP;

import java.util.*;
import java.io.*;

public class bj9095 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[11];


        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 4; i < 11; i++){
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
/*
        dp[4] = 7;
        dp[5] = 13;
        dp[6] = 24;
        for(int i = 7; i < 11; i++){
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }

 */
        //위에 주석은 내가 한거...너무 숫자를 높여서까지 서술..반복문에 넣으려할것. 그전 숫자들도 규칙 적용 확인해서

        int[] arr = new int[n + 1];

        for(int j = 1; j <= n; j++){
            arr[j] = Integer.parseInt(br.readLine());
            sb.append(dp[arr[j]]).append("\n");
        }

        System.out.println(sb);

    }
}
