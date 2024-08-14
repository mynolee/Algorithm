package class1bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i = 1; i<=a; i++){
            for(int j = a-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k =0; k<i; k++){
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }
}
