package baseAlgo;

import java.util.*;
import java.io.*;

public class bj2742 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++ ){
            sb.append(num - i).append('\n');
        }
        System.out.println(sb);
    }
}
