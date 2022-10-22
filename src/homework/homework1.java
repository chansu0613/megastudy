package homework;

import java.util.Scanner;

public class homework1 {
//    1. 배열 n개의 정수를 입력 받아, 평균보다 큰 정수 모두 출력

//    ex) 1, 1, 1, 10 ,10 => 10 10
//    ex) 1,2,3,4,5 => 4 5
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int sum = 0;
        int avg = 0;

        for (int i = 0;i < num.length;i++){
            num[i] = sc.nextInt();
            sum += num[i];
            avg = sum / n;
        }
        for (int j = 0; j < num.length; j++){
            if(num[j] > avg) System.out.print(num[j]+" ");
            else continue;
        }
    }
}
