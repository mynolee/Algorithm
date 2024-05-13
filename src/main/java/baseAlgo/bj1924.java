package baseAlgo;

import java.util.*;
import java.io.*;

public class bj1924 {
    public static void main(String[] args) throws IOException{
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = new String();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(str, ",");

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        while(true){
            if (x == 1) {
                y = y;
                break;
            } else if (x == 2) {
                y += 31;
                break;
            } else if (x == 3) {
                y += 31 + 28;
                break;
            } else if (x == 4) {
                y += 31 + 28 + 31;
                break;
            } else if (x == 5) {
                y += 31 + 28 + 31 + 30;
                break;
            } else if (x == 6) {
                y += 31 * 3 + 28 + 30;
                break;
            } else if (x == 7) {
                y += 31 * 3 + 28 + 30 * 2;
                break;
            } else if (x == 8) {
                y += 31 * 4 + 28 + 30 * 2;
                break;
            } else if (x == 9) {
                y += 31 * 5 + 28 + 30 * 2;
                break;
            } else if (x == 10) {
                y += 31 * 5 + 28 + 30 * 3;
                break;
            } else if (x == 11) {
                y += 31 * 6 + 28 + 30 * 3;
                break;
            } else if (x == 12) {
                y += 31 * 6 + 28 + 30 * 4;
                break;
            }
        }

        while(true){
            if (y % 7 == 0){
                str = "SUN";
                System.out.println(str);
                break;
            } else if (y % 7 == 1){
                str = "MON";
                System.out.println(str);
                break;
            } else if (y % 7 == 2){
                str = "TUE";
                System.out.println(str);
                break;
            } else if (y % 7 == 3){
                str = "WED";
                System.out.println(str);
                break;
            } else if (y % 7 == 4){
                str = "THU";
                System.out.println(str);
                break;
            } else if (y % 7 == 5){
                str = "FRI";
                System.out.println(str);
                break;
            } else if (y % 7 == 6){
                str = "SAT";
                System.out.println(str);
                break;
            }


        }

         */
        // 배열 생각...., 입력시 x y 로 입력되는거 처리 못함...

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] months = {0, 31, 28, 31, 30, 31,30, 31, 31, 30, 31, 30};
        int n = 0;
        for (int i = 0; i < m; i++) {
            n += months[i];
        }
        n += d-1;
        System.out.println(days[n%7]);
    }
}
