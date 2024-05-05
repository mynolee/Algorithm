package baseAlgo;

import java.io.*;
import java.util.*;

public class bj11022 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            String str = br.readLine();
            sb.append("Case #").append(i).append(": ").append(str.charAt(0)-'0').append(" + ").append(str.charAt(2)-'0').append(" = ").append(str.charAt(0)-'0' + str.charAt(2)-'0').append('\n');
        }
        System.out.println(sb);
    }
}
