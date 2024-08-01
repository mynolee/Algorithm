package class1bj;

import java.util.*;
import java.io.*;

public class bj2438 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        for(int i = 1;i <= a; i++){
            for(int j = 0; j< i; j++){
               System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
