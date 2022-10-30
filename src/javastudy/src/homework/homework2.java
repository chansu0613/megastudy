package homework;

import java.util.Scanner;

public class homework2 {
//    2. 배열 10개의 숫자를 입력 받고, 각 숫자의 개수 만큼 별표 출력
//
//    ex) 1 1 1 2 2 2 3 3 3 3  => 1:*** 2:*** 3:****
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();

        }
    }
}
