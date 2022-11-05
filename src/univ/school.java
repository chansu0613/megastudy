package univ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class school {
    public static void INCE(){
        Scanner sc = new Scanner(System.in);
        List<HashMap<Integer, HashMap>> lstCollege = new ArrayList();
        List Major1 = new ArrayList();

        System.out.println(lstCollege.get(0));
        System.out.print("Select number of major : ");
        int num1 = sc.nextInt();

        switch (num1){
            case 1:
                System.out.println(Major1.get(1));
                break;

            case 2:
                System.out.println(Major1.get(2));
                break;

            case 3:
                System.out.println(Major1.get(3));
                break;

            case 4:
                System.out.println(Major1.get(4));
                break;

            default:
                break;
        }
    }
}
