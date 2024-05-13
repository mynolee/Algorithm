package baseAlgo;

import java.util.*;
import java.io.*;

public class bj11719 {
    public static void main(String[] args) throws IOException {
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if (str == null){
                break;
            }
            sb.append(str).append("\n");
        }
        br.close();
        System.out.println(sb);
    }

 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            sb.append(str).append("\n");
        }
        br.close();

        System.out.println(sb.toString());

    }
}