package baseAlgo;

import java.util.*;
import java.io.*;

public class bj11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());

        String num = br.readLine();

        int sum = 0;

        for (int j = 0; j < i; j++){
            sum += num.charAt(j) - '0';   // 아스키 코드로 변환되어 출력되는거 방지 위해 -'0'
        }
        br.close();
        System.out.println(sum);

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        String number = br.readLine();

        int result = 0;

        for(int i = 0; i < number.length(); i++){
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            result += num;
        }
        System.out.println(result);
        */
    }
}
