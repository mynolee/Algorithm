package baseAlgo;

import java.io.*;
import java.util.*;
public class bj10952 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        while (true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;
            if (sum == 0) break;
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
        br.close();

    }

}


