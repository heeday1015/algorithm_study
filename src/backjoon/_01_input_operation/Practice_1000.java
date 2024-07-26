package backjoon._01_input_operation;

//public class Practice_1000 {
//    public static void main(String[] args){
//
//        Scanner in = new Scanner(System.in);
//
//        int A = in.nextInt();
//        int B = in.nextInt();
//
//        System.out.print(A + B);
//    }
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice_1000 {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄을 읽어오고 공백을 기준으로 분리
        String[] input = br.readLine().split(" ");

        // 첫 번째와 두 번째 숫자를 읽어 정수로 변환
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        // 두 수의 합을 출력
        System.out.print(A + B);
    }
}