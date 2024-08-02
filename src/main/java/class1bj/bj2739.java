package class1bj;

import java.util.*;
import java.io.*;

public class bj2739 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String str1 = String.valueOf(a);

        for(int i = 0; i<9; i++){
            System.out.println(str1 + " * " + (i+1) + " = " + (a*(i+1)));
        }
    }
}
