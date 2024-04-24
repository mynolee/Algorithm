package baseAlgo;

import java.io.*;
import java.util.*;
public class bj10953 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        int i = Integer.parseInt(br.readLine());

        while (true) {
            for(int j = 0; j < i; j++ ) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int sum = a + b;
                sb.append(sum).append("\n");
            }
        }
        System.out.print(sb);
        br.close();

    }
}