package baseAlgo;

import java.util.*;
import java.io.*;

public class bj2445 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < 2*N -1; i++) {
            if (i < N) {
                sb.append("*".repeat(i + 1)).append(" ".repeat(2 * (N - (i + 1)))).append("*".repeat(i + 1)).append("\n");
            } else {
                sb.append("*".repeat(2*N -(i + 1))).append(" ".repeat(2 * ((i + 1) - N))).append("*".repeat(2*N -(i + 1))).append("\n");
            }
        }
        System.out.println(sb);
        br.close();

    }
}
