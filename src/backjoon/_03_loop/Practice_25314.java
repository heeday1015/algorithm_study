package backjoon._03_loop;

import java.util.Scanner;

public class Practice_25314 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        String str = "";
        in.close();

        //for문에서 조건식은 초기 한번만 실행
        for(int i = 1; i <= num/4; i++){
            str += "long ";
        }
        System.out.println(str + "int");
    }
}
