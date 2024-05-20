package sweaD3;

import java.io.*;
import java.util.*;

public class d3_1244 {

    static int[] arr;
    static int t,n, ma;
    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());

        for(int i = 0; i< t; i++){
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();
            arr = new int[tmp.length()];
            for (int j = 0; j< tmp.length(); j++){
                arr[j] = tmp.charAt(j) - '0';
            }
            n = Integer.parseInt(st.nextToken());
            if(n>arr.length)
                n = arr.length;
            ma = Integer.MIN_VALUE;

            dfs(0,0);
            System.out.println("#" + t + " " + ma);

        }


    }

    private static void dfs(int idx, int count){
        if(count == n){
            int number = 0;
            for(int i = 0; i< arr.length; i++){
                number = number*10 +arr[i];
            }
            ma  = Integer.max(ma,number);
            return;
        }
        for(int i = idx; i <arr.length-1;i++){
            for(int next = i+1; next<arr.length;next++){
                //if(arr[i] <=arr[next]){
                swap(i,next);
                dfs(i,count+1);
                swap(i,next);
            }
        }
    }

    private static void swap(int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
