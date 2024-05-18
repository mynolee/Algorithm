package baseBS;

import java.util.*;
import java.io.*;

public class bj1654 {

    static int k, n;

    static int[] arr;

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");


        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[k+1];

        long high = 0;

        for (int i = 1; i <= k; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(str.nextToken());
            if(high < arr[i]){
                high = arr[i];
            }
        }


        long maxlen = 0;
        long low = 1;

        while(low<=high){
            long mid = (low + high)/2;
            long sum = 0;
            for(int i = 1; i<=k;i++){
                sum +=arr[i]/mid;
            }
            if(sum >=n){
                maxlen = mid;
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        System.out.println(maxlen);



    }



}


