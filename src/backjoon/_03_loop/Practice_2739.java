package backjoon._03_loop;

import java.util.Scanner;

// 구구단 단 하나 출력
public class Practice_2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        System.out.println(num + "단");

        for(int i = 1; i <= 9; i++){
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
