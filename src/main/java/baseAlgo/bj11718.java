package baseAlgo;

import java.io.*;
import java.util.*;

public class bj11718 {
    public static void main(String[] args) throws IOException{
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";

        while((str = br.readLine()) != null){
            System.out.println(str);
        }

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str == null || str.isEmpty()){
                break;
            }
            sb.append(str).append("\n");

        }
        br.close();
        System.out.println(sb);

    }
}
