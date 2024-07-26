package backjoon._03_loop;

import java.util.Scanner;

//두 정수를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//각 테스트 케이스마다 A+B를 출력한다.
public class Practice_10950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        int[] arr = new int[T];

        for(int i = 0; i < T; i++){
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            arr[i] = num1 + num2;
        }
        for(int j : arr){
            System.out.println(j);
        }
    }
}
