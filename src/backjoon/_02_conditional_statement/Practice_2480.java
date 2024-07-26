package backjoon._02_conditional_statement;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_2480 {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//
//        int dice1 = in.nextInt();
//        int dice2 = in.nextInt();
//        int dice3 = in.nextInt();
//
//        // 만약 모든 주사위 숫자가 다른 경우
//        if(dice1 != dice2 && dice2 != dice3 && dice3 != dice1){
//            int max;
//
//            // 만약 dice1 > dice2 라면
//            if(dice1 > dice2){
//                // dice1이 dice2보다 크고, dice3이 dice1보다 큰 경우
//                if(dice3 > dice1){
//                    max = dice3;
//                // 그게 아닌경우(dice1이 dice2와 dice3보다 큰 경우)
//                } else {
//                    max = dice1;
//                }
//            // 그게 아니라면(dice2가 dice1보다 큰 경우)
//            } else {
//                // dice2가 dice1보다 크고, dice3이 dice2보다 큰 경우
//                if(dice3 > dice2){
//                    max = dice3;
//                // 그게 아니라면(dice2가 dice1과, dice3보다 큰 경우)
//                } else {
//                    max = dice2;
//                }
//            }
//            System.out.println(max * 100);
//        }
//        // 최소 한 쌍 이상의 서로 같은 주사위가 존재할 경우
//        else {
//            // dice1과 dice2와 같고 dice1과 dice3이 같은 경우(주사위 3개의 모든 숫자가 같은 경우)
//            if(dice1 == dice2 && dice1 == dice3){
//                System.out.println(10000 + dice1 * 1000);
//            } else {
//                // dice1과 dice2와 같거나, 아니면 dice3과 같은경우
//                if(dice1 == dice2 || dice1 == dice3){
//                    System.out.println(1000 + dice1 * 100);
//                // dice2와 dice3이 같은 경우
//                } else {
//                    System.out.println(1000 + dice2 * 100);
//                }
//            }
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A != B && A != C && B != C){
            int max;
            if(A > B){
                if(C > A){
                    max = C;
                }
                else {
                    max = A;
                }
            } else {
                if(C > B){
                    max = C;
                }
                else {
                    max = B;
                }
            }
            bw.write(String.valueOf(max * 100) + "\n");
        }

        else {
            if(A == B && A == C){
                bw.write(10000 + A * 1000 + "\n");
                //System.out.println(10000 + dice1 * 1000);
            }
            else {
                if(A == B || A == C){
                    bw.write(1000 + A * 100 + "\n");
                }
                else {
                    bw.write(1000 + B * 1000 + "\n");
                }
            }
        }
        bw.flush();

        br.close();
        bw.close();

        
        // StringBuilder써서 구현
//        StringBuilder sb = new StringBuilder();
//
//        if (A != B && A != C && B != C) {
//            int max;
//            if (A > B) {
//                if (C > A) {
//                    max = C;
//                } else {
//                    max = A;
//                }
//            } else {
//                if (C > B) {
//                    max = C;
//                } else {
//                    max = B;
//                }
//            }
//            sb.append(max * 100);
//        } else {
//            if (A == B && A == C) {
//                sb.append(10000 + A * 1000);
//            } else {
//                if (A == B || A == C) {
//                    sb.append(1000 + A * 100);
//                } else {
//                    sb.append(1000 + B * 1000);
//                }
//            }
//        }
//
//        bw.write(sb.toString() + "\n");
//        bw.flush();
//        br.close();
//        bw.close();
    }
}
