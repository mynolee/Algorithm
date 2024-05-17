package baseDP;

import java.util.*;
import java.io.*;

public class bj11057 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n+2][10];

        for(int i = 0; i < 10; i++){
            dp[1][i] = 1;
        }

        for(int j = 2; j <= n+1; j++){
            for(int k = 0; k<10;k++){
                dp[j][0] = (dp[j][0] + dp[j-1][k])%10007;
            }
            for(int l = 1; l < 10; l++){
                for(int m = l; m < 10;m++) {
                    dp[j][l] = (dp[j][l] + dp[j - 1][m]) % 10007;
                }
            }
        }

        System.out.println(dp[n+1][0]);


    }
}


// 끝자리가 j일때인 경우도 코딩 가능 - 나랑 다른 생각 - 알고리즘은 동일
