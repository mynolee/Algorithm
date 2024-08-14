package class1bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
public class bj10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        int min = 1000000;
        int max = -1000000;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<a; i++){

            int n = Integer.parseInt(st.nextToken());
            if( max < n){
                max = n;
            }
            if( min > n){
                min = n;
            }
        }
        System.out.println(min + " " + max);
    }
}


 */

interface Main{
    int InputSize = 9000012;
    int[] index = {0};
    byte[] inputBuffer = new byte[InputSize +1];

    static void main(String[] args)throws Exception{
        System.in.read(inputBuffer);

        int Num;
        int N = read();

        int max = -1000001;
        int min = 1000001;
        for(int i = 0; i<N; i++){
            Num =read();
            max = Math.max(max, Num);
            min = Math.min(min, Num);
        }
        System.out.println(min + " " + max);

    }

    static int read(){
        int ASCII, result = 0, isMinus = 1;
        while ((ASCII = inputBuffer[index[0]++]) > 32) {
            if(ASCII==45){
                isMinus= -1;
            } else result=result*10+ASCII-48;

        }
        return result*isMinus;
    }

}