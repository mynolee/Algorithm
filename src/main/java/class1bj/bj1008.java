package class1bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1008  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        Double a = Double.parseDouble(st.nextToken());
        Double b = Double.parseDouble(st.nextToken());

        System.out.println(a/b);

    }
}

