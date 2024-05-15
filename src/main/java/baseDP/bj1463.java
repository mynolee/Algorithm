package baseDP;

import java.util.*;
import java.io.*;

public class bj1463 {
    public static void main(String[] args) throws IOException{
        /*

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(br.readLine());
        int k = 0;

        while(num != 1) {
            k++;
            if ((num % 3) == 0) {
                num = num / 3;
                if (num == 1) break;
            } else if ((num % 2) == 0) {
                num = num / 2;
                if (num == 1) break;
            } else num = num - 1;
        }

        System.out.println(k);
 */
        // 위의건 그냥 조건 그대로만 너무 봄...숫자가 커지면 커질수록 셋중에 뭐가 먼저인지 생각을 해야..


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        //DP 테이블 (각 숫자를 1로 만드는 데 필요한 최소 연산 횟수)
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++){
            //1을 뺘는 경우
            dp[i] = dp[i - 1] + 1;
            //2로 나누어 떨어지는 경우
            if(i%2 == 0)
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            //3으로 나누어 떨어지는 경우
            if(i%3 == 0)
                dp[i] = Math.min(dp[i], dp[i/3] +1);
        }
        System.out.println(dp[n]);




        /*
        static int result(int x,int count){
        if(x <2)
            return count;
        return Math.min(result(x/2 , count+1+(x%2)),result(x/3,count+1+(x%3)));

        이런거 대체 어케 생각함...
         */


    }

}