package class2bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj2798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i< n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, n, m);
        System.out.println(result);

    }

    static int search(int[] arr, int n, int m){
        int result = 0;
        for(int j = 0; j<n-2; j++){
            for(int k = j+1; k<n-1; k++){
                for(int l = k+1; l<n; l++){
                    int temp = arr[j] + arr[k] + arr[l];

                    if(m == temp){
                        return temp;
                    }

                    if(result <temp &&temp <m){
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
