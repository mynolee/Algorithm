package baseAlgo;

public class prob1 {
    public static void main(String[] args){
        int x = 2, y  = 10, z = 0;
        z = x++*2+--y-5+x*(y%2);
        System.out.println(z);
    }
}


/*
 연산자 우선순위는 바인딩에 대한 우선순위 **
 주변 연산자와의 우선순위를 생각하여 바인딩 한 후
 안쪽 괄호부터 연산 시 연산 편함
 어디쪽 괄호부터 하든 값은 동일
 위와 같은 코드는 안쓰는 편 - 컴파일러에 따라 값이 바뀔수 있어


public static void main(String[] args) {
		int x;
		x = 2;
        System.out.println((x + 0) * 10 + x++);
        x = 2;
        System.out.println(x++ * 10 + (x + 0));
        x = 2;
        System.out.println(++x * 10 + (x + 0));
        x = 2;
        System.out.println((x + 0) * 10 + ++x);
        x = 2;
        System.out.println(x— * 10 + ++x);
        x = 2;
        System.out.println(—x * 10 + x++);}

22
23
33
23
22
11


이거 생각해봐야

연산자 우선순위는 어떤 연산이 먼저 일어나고 이런게 아니라
바인딩되는 순서로 이해하는게 편하다고 합니다

ex)
1 + 2 + 3   ->   ((1 + 2) + 3)
1 + 2 * 3   ->   (1 + (2 * 3))
(1 + 2) * 3   ->   ((1 + 2) * 3)
2 * 3 + (1 + 2)   ->   ((2 * 3) + (1 + 2))



위의 코드 바인딩하면

(z = ((((x++)*2)+(—y))-5)+(x*(y%2)))
이렇게 바인딩


 중위 표기법과 후위 표기법 확인해야

 */