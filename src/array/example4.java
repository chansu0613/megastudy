package array;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        int[] num = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (num[i]>num[j]){
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        for(int i = 0; i<5; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        System.out.println();
        System.out.print(num[0] + " ");
        System.out.print(num[1]);
    }
}
