package baseAlgo;

import java.util.*;
import java.io.*;
public class bj2438 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String str;

        for ( int i = 0; i < N; i++){
            str = String.valueOf(sb.append("*"));
            System.out.println(str);
        }
    }
}
