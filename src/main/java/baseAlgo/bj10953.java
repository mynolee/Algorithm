package baseAlgo;
/*
import java.io.*;
import java.util.*;
public class bj10953 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        String str;
        StringBuilder sb = new StringBuilder();
        int i = sc.nextInt();


        for(int j = 0; j < i; j++ ) {
            str = sc.next();
            st = new StringTokenizer(str,",");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a+b);
        }
        sc.close();

    }
}

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj10953{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),",");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}