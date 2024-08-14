package class1bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class bj11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int sum = 0;

        for(byte value : br.readLine().getBytes()){
            sum += (value - '0');
        }
        System.out.println(sum);

        /*
        for (int j = 0; j<i; j++}{
        sum += num.charAt(j) - '0';
        }
         */
    }
}
