package sweaD2;

import java.util.*;
import java.io.*;

public class d2_1859 {
    public static void main(String args[]) throws Exception {


/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int max = 0;
            int c = 1;
            long sum = 0;
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());

                if( j != 0 && arr[j]>arr[j-1]){
                    sum += arr[j] - arr[j-1];
                }
                if(max <= arr[j]){
                    sum += (arr[j]-max)*(c);  //d가 51364 의 1의 위치
                    max = arr[j];
                } else c++;

            }
            System.out.printf("#%d %d\n",i+1, sum);
        }



 */
        //이거 내가 짠건데 왜 안되는지 정말 몰게씀......


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int max = 0;
            long sum = 0;
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = n-1; j >= 0; j--){
                if(arr[j]>max) {
                    max = arr[j];
                }
                sum += max - arr[j];
            }
            System.out.printf("#%d %d\n",i+1,sum);
        }
        br.close();




    }

}