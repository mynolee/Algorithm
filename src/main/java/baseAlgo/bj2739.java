package baseAlgo;

import java.util.*;
import java.io.*;

public class bj2739 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < 9; i++){
            sb.append(num).append(" * ").append(i+1).append(" = ").append(num * (i+1)).append('\n');
        }
        br.close();
        System.out.println(sb);
    }
}
