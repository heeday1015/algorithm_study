package backjoon._02_conditional_statement;

import java.util.Scanner;

// 오븐 끝나는 시간 구하기
// 시를 분으로 바꾸고, 분을 시로 바꾸고, 24시가 넘어가게 되면 0부터 시작하도록 코드 구현
public class Practice_2525 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hour = in.nextInt(); // 시
        int min = in.nextInt(); // 분
        int takeTime = in.nextInt(); // 요리하는데 걸리는 시간

        min = 60 * hour + min;
        min += takeTime;

        hour = (min / 60) % 24; // 시(24시 이상이면 0시부터 시작)
        min = min % 60; // 분

        System.out.println(hour + " " + min);
    }
}
