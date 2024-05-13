package baseAlgo;

import java.io.*;
import java.util.*;

public class bj11721 {
    public static void main(String[] args) throws IOException {

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (int i = 0; i < (str.length()/10 + 1); i++){
            for(int j = i * 10; j < 10 * (i + 1); j++){
                if ( j == str.length()) break;
                sb.append(str.charAt(j));
            }
            sb.append("\n");
        }
        System.out.println(sb);
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            sb.append(str.charAt(i));
            if(i%10 == 9) sb.append('\n');
        }
        System.out.println(sb);
    }


}
