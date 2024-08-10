package class2bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj4153 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true ){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if( a == 0 && b ==0 && c ==0 ){
                break;
            }
            if( (c*c) == (a*a + b*b)){
                System.out.println("right");
            }else if( (a*a) == (c*c + b*b)){
                System.out.println("right");
            } else if( (b*b) == (a*a + c*c)){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
