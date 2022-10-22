package array;

public class example2 {
    public static void main(String[] args) {
        int[] score = {90, 80, 60, 100};

        int totalScore = 0;
        double avgScore = 0;

        for(int i = 0; i < score.length; i++){
            totalScore += score[i];
        }
        avgScore = totalScore / score.length;

        System.out.println("total: "+totalScore);
        System.out.println("avg: "+avgScore);
    }
}
