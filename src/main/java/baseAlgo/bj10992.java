package baseAlgo;

import java.util.*;
import java.io.*;

public class bj10992 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N-1; i++){
            if( i == 0){sb.append(" ".repeat(N-i-1)).append("*").append("\n");}
            else{
                sb.append(" ".repeat(N-i-1)).append("*").append(" ".repeat(2*i - 1)).append("*").append("\n");
            }
        }
        sb.append("*".repeat(2*N -1));
        System.out.println(sb);
        br.close();


    }
}
