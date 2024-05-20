package baseBD;

import java.util.*;
import java.io.*;


public class bj1707 {

    static int k, count, start, v, e;
    static boolean[] check;
    static int[][] arr;

    public static void main(String[] arg) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        k = Integer.parseInt(br.readLine());



        for (int i = 0; i <k; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            v = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());

            arr = new int[v+1][v+1];

            for(int j = 1; j <= e; j++){
                StringTokenizer str = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(str.nextToken());
                int b = Integer.parseInt(str.nextToken());

                arr[a][b] = arr[b][a] = 1;
            }

            count = 0;
            start = 1;
            for(int m = 1; m<=v; m++){
                if( !check[m]) {
                    dfs(m);
                    count++;
                }
            }

            if( count == 2){
                System.out.println("YES");
            } else System.out.println("NO");
        }


    }
    public static void dfs(int start){
        check[start] = true;
        count++;

        for(int l = 1; l< v + 1; l++){
            if(arr[start][l] == 1 && !check[l])
                dfs(l);
        }
    }
}


/*
import java.io.*;
import java.util.*;

public class p1707 {
	static int v, e;
	static ArrayList<Integer>[] al;
	static int visit[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(stz.nextToken());

		for(int tc = 0; tc < t; tc++) {
			stz = new StringTokenizer(br.readLine());
			v = Integer.parseInt(stz.nextToken());
			e = Integer.parseInt(stz.nextToken());
			visit = new int[v+1];
			al = new ArrayList[v+1];

			for(int i = 0; i <= v; i++)
				al[i] = new ArrayList<Integer>();

			for(int i = 0; i < e; i++) {
				stz = new StringTokenizer(br.readLine());
				int p1 = Integer.parseInt(stz.nextToken());
				int p2 = Integer.parseInt(stz.nextToken());

				al[p1].add(p2);
				al[p2].add(p1);
			}
			grouping();
		}
	}

	public static void grouping() {
		Queue<Integer> q = new LinkedList<Integer>();

		for(int i = 1; i <= v; i++) {
			if(visit[i] == 0) {
				q.add(i);
				visit[i] = 1;
			}

			while(!q.isEmpty()) {
				int now = q.poll();

				for(int j = 0; j < al[now].size(); j++) {
					if(visit[al[now].get(j)] == 0) {
						q.add(al[now].get(j));
					}

					if(visit[al[now].get(j)] == visit[now]) {
						System.out.println("NO");
						return;
					}

					if(visit[now] == 1 && visit[al[now].get(j)] == 0)
						visit[al[now].get(j)] = 2;
					else if(visit[now] == 2 && visit[al[now].get(j)] == 0)
						visit[al[now].get(j)] = 1;
				}
			}
		}

		System.out.println("YES");
	}

}
 */