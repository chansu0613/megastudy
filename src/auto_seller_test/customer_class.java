package auto_seller_test;

import java.util.Scanner;

public class customer_class {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    String[] beverage_list = new String[]{"pokari", "cola", "cidar", "welchis", "vita500"};
    int[] price_list = new int[]{700, 1000, 1000, 500, 500};
    int tmp = 15;
    int max = 30;

    void customer(){
        for (int i = 0; i < beverage_list.length; i++) {
            if (str1 == beverage_list[i]){

            }
        }
    }
}
