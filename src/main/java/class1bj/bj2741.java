package class1bj;

import java.util.*;
import java.io.*;

public class bj2741 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i< a; i++){
            System.out.println(i+1);
        }
    }
}
