package test;

public class test {
    public static void main(String[] args) {
        int[][] num = new int[10][5];

        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++){
                num[i][j] = 1;
                System.out.println(num[i][j]);
            }
        }
    }
}
