package condition;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        //if => if문 if~else문, if~else if문
        // boolean => int 정수
        // double 실수
        // char 문자 하나
        // string 문자 여러개
        // boolean true or false

        // 자료형 boolean값 들어갈 수 있다.


        // int b = 4;
        // 기본형은 . 뒤에 아무것도 안나옴
        // 참조형은 . 뒤에 참조에 관련된 명령어들이 나옴

        System.out.println("Insert your xcore.");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade = "";


        switch (score/10){
            case 9 : grade = "A"; break;
            case 8 : grade = "B"; break;
            case 7 : grade = "C"; break;
            case 6 : grade = "D"; break;
            case 5 : grade = "E"; break;
            default: grade = "no human";
        }
        System.out.println("score is "+grade);
    }
}
