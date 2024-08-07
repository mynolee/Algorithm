package class1bj;

import java.util.*;
import java.io.*;

public class bj10950 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        for(int i =0; i< a;i++){
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            sb.append(b+c).append(' ');
        }
        System.out.println(sb);
    }
}
