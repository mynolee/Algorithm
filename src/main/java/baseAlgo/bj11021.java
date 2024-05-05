package baseAlgo;

import java.util.*;
import java.io.*;

/*
public class bj11021 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String str = new String();

        for(int j = 0; j < T; j++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;
            System.out.println("Case #" + (j+1) + ": " + sum);

        }
        br.close();

    }
}


 */

public class bj11021 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            String str = br.readLine();
            sb.append("Case #").append(i).append(": ").append(str.charAt(0)-'0' + str.charAt(2)-'0').append('\n');
        }
        System.out.println(sb);
    }
}