package backjoon._02_conditional_statement;

import java.util.Scanner;

// 사분면 고르기
public class Practice_14681 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        if(x >= 0 && y >= 0){
            System.out.println(1);
        } else if(x <= 0 && y >= 0){
            System.out.println(2);
        } else if(x <= 0 && y <= 0){
            System.out.println(3);
        } else if(x >= 0 && y <= 0){
            System.out.println(4);
        }
    }
}
