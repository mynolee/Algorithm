package baseAlgo;

import java.util.*;
import java.io.*;

public class bj10818 {
    public static void main(String[] args) throws IOException{
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        String str = new String(br.readLine());
        int tmp = 0;

        StringTokenizer st = new StringTokenizer(str, " ");

        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int j = 0; j < num - 1; j++){
            for(int k = j + 1; k < num; k++)
                if (arr[j] > arr[k]){
                    tmp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = tmp;
            }
        }

        System.out.println(arr[0] + " " + arr[num-1]);


 */
        //for 문 두개써서 시간복잡도 장난 아님.. 시간초과나옴 - Arrays.sort()랑 st.hasMoreTokens() 생각하기

/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1000001;
        int min = 1000001;

        while(st.hasMoreTokens()){
            int val = Integer.parseInt(st.nextToken());
            if(val > max){
                max = val;
            } else min = val;
        }
        System.out.println(min + " " + max);

 */
        //BufferedReader + 배열 x 방법 --- 잘 작동되는거 같으나 아마 배열관련 크기 지정 문제인듯

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] arr = new int[N];
        while(st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N-1]);

    }


}
