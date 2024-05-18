package sweaD2;

import java.util.*;
import java.io.*;
/*
public class d2_1208 {



}


 */


import java.util.*;
import java.io.*;

public class d2_1208 {

    static int k, n;
    static int[] arr;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long maxLen = 0;
        long low = 1;
        long high = Arrays.stream(arr).max().getAsInt();

        while (low <= high) {
            long mid = (low + high) / 2;
            long sum = 0;
            for (int i = 0; i < k; i++) {
                sum += arr[i] / mid;
            }
            if (sum >= n) {
                maxLen = mid;  // mid가 조건을 만족하면 더 큰 값을 찾아본다.
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(maxLen);
    }
}
