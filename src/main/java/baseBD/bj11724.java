package baseBD;

import java.util.*;
import java.io.*;

public class bj11724 {

    static StringBuilder sb = new StringBuilder();
    static int node, line;
    static boolean[] check;

    static int[][] arr;

    public static void main(String[] args) throws Exception{
/*
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());

 */

        node = read();
        line = read();

        arr = new int[node+1][node+1];
        check = new boolean[node +1];

        int a,b;

        for(int i = 0; i < line; i++){
/*
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

 */

            a = read();
            b = read();

            arr[a][b] = arr[b][a] = 1;
        }

        int count = 0;
        for(int i =1; i<=node;i++){
            if(!check[i]){
                bfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    public static void bfs(int start) {
        check[start] = true;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);

        while(!q.isEmpty()){
            start = q.poll();

            for(int i =1; i<=node;i++){
                if(arr[start][i] == 1 && !check[i]){
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }

    private static int read() throws Exception {
        int c, n = System.in.read() &15;

        while ((c = System.in.read()) > 32)
            n = (n << 3) + (n << 1) + ( c &15);

        if( c == 13) System.in.read();
        return n;
    }


}
