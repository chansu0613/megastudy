package school;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class score {
//    int scoreOfStudent = sc.nextInt();
    String[][] listOfName;
    int n;

    score(){
        this.listOfName = new String[4][10];
        this.n = 0;
    }
    void addStudent(){
        System.out.print("이름을 입력하세요 : ");

        for (int i = 1; i < listOfName.length; i++){
            Scanner sc = new Scanner(System.in);
            String nameOfStudent = sc.nextLine();

            if(!Arrays.asList(this.listOfName).contains(nameOfStudent)){
                this.listOfName[0][i] = nameOfStudent;
            }
            else{
                this.listOfName[0][i + 1] = nameOfStudent;
            }
        }
        System.out.println(listOfName[0][1]);
    }
    void addScore(){

        System.out.println("과목별 학생의 성적을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int korScore = sc.nextInt();
        int engScore = sc.nextInt();
        int mathScore = sc.nextInt();






    }
    void showInformation(){

        addScore();
        System.out.println();
    }
    void showAverageInfo(){

    }
}
