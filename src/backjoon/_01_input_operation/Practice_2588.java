package backjoon._01_input_operation;

import java.util.Scanner;

//곱셈 할 때 순차적으로 계산되는 값 구하기
public class Practice_2588 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(num1 * (num2%10)); //일의자리 구하기
        System.out.println(num1*(num2%100/10)); //십의자리 구하기
        System.out.println(num1*(num2/100)); //백의자리 구하기
        System.out.println(num1 * num2);
    }
}
