package school;

import java.util.Scanner;

public class studentScore {
    public static void main(String[] args) {
        score info = new score();
        UI ui = new UI();

        ui.presentUI();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            // num == 1
            case 1:
                System.out.println("학생 추가");
                info.addStudent();

                break;
            // num == 2
            case 2:
                System.out.println("학생 성적 추가");
                info.addScore();
                break;
            // num == 3
            case 3:
                System.out.println("학생 정보 조회");
                info.showInformation();
                break;
            // num == 4
            case 4:
                System.out.println("반 평균");
                info.showAverageInfo();
                break;
            // else
            default:
                System.out.printf("프로그램 종료");
                break;
        }
    }
}
