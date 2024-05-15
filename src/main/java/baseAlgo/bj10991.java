package baseAlgo;

import java.util.*;
import java.io.*;

public class bj10991 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            sb.append(" ".repeat(N-(i+1))).append("*").append(" *".repeat(i)).append("\n");
        }
        System.out.println(sb);

    }
}
