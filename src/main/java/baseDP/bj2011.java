package baseDP;

import java.io.*;

public class bj2011 {
    public static void main(String[] args) throws IOException{

    /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        String str;
        int offset = 0;
        int[] dp = new int[5001];
        dp[1] = 1;
        dp[2] = 2;
        int[] arr = new int[5001];

        for( int i = 3; i < 10; i++) {
            str = String.valueOf(i);
            for(int j  = 0; j <= sb.lastIndexOf(str); j++)
                offset = sb.indexOf(str);
                sb.insert(offset,",");
        }

        String a = String.valueOf(sb);
        String[] sts = a.split(",");
        String c;

        long sum = 1;
        for(int l = 3; l <= 100; l++){
            dp[l] = dp[l-2] + dp[l-1];
        }
        for( int k = 0; k < sts.length; k++){
            arr[k] = dp[(sts[k].length())];
        }
        for(int u = 0; u < arr.length; u++){
            sum = (sum*arr[u])%1000000;
        }
        System.out.println(sum);


        */
            // 내가 하려한건 점화식 처럼 해가지고 문자열 배열화시켜서 3 이상 나오는거 다 , 한담에
        //배열마다 각각 길이에 피보나치 값인 dp대입 후 각 배열마다 곱셈 후 27,28,29에 해당하는 값 빼기

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();

        if(ch[0] == '0'){
            System.out.println(0);
            return;
        }

        int[] dp = new int[ch.length+1];
        dp[0] = dp[1] =1;

        for (int i = 2; i<=ch.length;i++){
            if(ch[i-1] != '0'){
                    dp[i] +=dp[i-1]%1000000;
            }

            int temp = ((ch[i-2] - '0')*10 + ch[i-1] - '0');
            if (temp >=10 && temp <=26) {
                dp[i] +=dp[i-2] %1000000;
            }
        }
        System.out.println(dp[ch.length]%1000000);

    }
}
