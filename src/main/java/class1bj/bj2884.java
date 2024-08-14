package class1bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj2884 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m >=45){
            m = m - 45;
        } else if (h == 0){
            h =23;
            m = m + 15;
        } else {
            h = h - 1;
            m = m + 15;
        }

        System.out.println(h + " " + m);

    }
}
