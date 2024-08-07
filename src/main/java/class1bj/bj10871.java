package class1bj;

import java.util.*;
import java.io.*;

public class bj10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i<N;i++){
            int c = Integer.parseInt(st.nextToken());
            if( c < x){
                sb.append(c).append(' ');
            }
        }
        System.out.println(sb);

    }
}
