package auto_seller_test;

import java.util.Scanner;

public class admin_class {
    Scanner sc = new Scanner(System.in);
    String person = sc.nextLine();

    String[] beverage_list = new String[]{"pokari", "cola", "cidar", "welchis", "vita500"};
    int[] price_list = new int[]{700, 1000, 1000, 500, 500};
    int tmp = 15;
    int max = 30;

    void admin_or_customer(){
        String real_admin = new String("chansu");

        while (true) {
            if (person == real_admin) {
                int n = sc.nextInt();
                tmp += n;
                if (tmp > max){
                    tmp = max;
                    break;
                }
            } else continue;
        }
    }
    void admin(){
    }
}
