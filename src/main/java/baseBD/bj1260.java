package baseBD;

import java.util.*;
import java.io.*;

public class bj1260 {

    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;

    static int node, line, start;

    static Queue<Integer> q  = new LinkedList<>();

    //이런거 쓸거니깐 선언한거

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        //선언한 것들 이제 쓸거니깐 사이즈 지정- 초기화

        for(int i = 0; i <line; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }
        //그래프 만들기

        dfs(start);
        sb.append("\n");
        check = new boolean[node+1];   //다시 초기화 - dfs, bfs 구별헤서 체크하려고

        bfs(start);
        System.out.println(sb);
    }

    public static void dfs(int start){

        check[start] = true;
        sb.append(start + " ");

        for(int i = 0; i<=node; i++){
            if(arr[start][i] == 1 && !check[i])
                dfs(i);
        }
    }

    public static void bfs(int start){
        q.add(start);
        check[start] = true;

        while(!q.isEmpty()){

            start = q.poll();
            sb.append(start + " ");

            for(int i =1; i<=node; i++){
                if(arr[start][i] ==1 && !check[i]){
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
