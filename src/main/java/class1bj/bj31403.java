package class1bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb1.append(a + b - c).append("\n").append(Integer.parseInt(sb2.append(a).append(b).toString()) - c);

        System.out.println(sb1);
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj31403 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String sum;
        int num = 0;
        int arr[] =new int[3];
        String str[] = new String[3];

        for(int i = 0; i<3; i++) {
            str[i] = br.readLine();
            arr[i] = (int)str[i].charAt(0)-'0';

        }
        System.out.println(arr[0]+arr[1]-arr[2]);
    }
}


 */