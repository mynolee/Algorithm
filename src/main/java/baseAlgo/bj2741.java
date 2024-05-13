package baseAlgo;

import java.util.*;
import java.io.*;

public class bj2741 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int i = Integer.parseInt(br.readLine());

        for(int j = 0; j < i; j++){
            //System.out.println(j+1);    --이렇게 바로 하면 러닝타임이 너무 오래걸림...
            sb.append(j+1).append('\n');
        }

        System.out.println(sb);


    }
}
