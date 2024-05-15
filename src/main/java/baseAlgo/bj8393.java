package baseAlgo;

import java.util.*;
import java.io.*;

public class bj8393 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i <= N; i++){
            sum += i;
        }

        System.out.println(sum);

    }
}
