package univ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static univ.school.INCE;

public class major {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean choice = true;
        List Major1 = new ArrayList();
        List Major2 = new ArrayList();
        List Major3 = new ArrayList();
        List<HashMap<Integer, HashMap>> lstCollege = new ArrayList();
        HashMap lstMajorINCE = new HashMap();
        HashMap lstMajorART = new HashMap();
        HashMap lstMajorHUMAN = new HashMap();

        Major1.add(0,"computer science");
        Major1.add(1,"electronic engineering");
        Major1.add(2,"super intelligence");
        Major1.add(3,"smart factory");

        lstMajorINCE.put(1, Major1.get(0));
        lstMajorINCE.put(2, Major1.get(1));
        lstMajorINCE.put(3, Major1.get(2));
        lstMajorINCE.put(4, Major1.get(3));

        lstCollege.add(lstMajorINCE);

        Major2.add(0, "singing");
        Major2.add(1, "string instrument");
        Major2.add(2, "percussion instrument");

        lstMajorART.put(1, Major2.get(0));
        lstMajorART.put(2, Major2.get(1));
        lstMajorART.put(3, Major2.get(2));

        lstCollege.add(lstMajorART);

        Major3.add(0, "journalism");
        Major3.add(1, "philosophy");
        Major3.add(2, "language");
        Major3.add(3, "national culture");

        lstMajorHUMAN.put(1, Major3.get(0));
        lstMajorHUMAN.put(2, Major3.get(1));
        lstMajorHUMAN.put(3, Major3.get(2));
        lstMajorHUMAN.put(4, Major3.get(3));

        lstCollege.add(lstMajorHUMAN);

        while (choice){
            System.out.print("Select number of college : ");
            int num = sc.nextInt();

            switch (num){
                case 1:
                    INCE();
                    break;

                case 2:
                    System.out.println(lstCollege.get(1));
                    System.out.print("Select number of major : ");
                    int num2 = sc.nextInt();

                    switch (num2){
                        case 1:
                            System.out.println(Major2.get(0));
                            break;

                        case 2:
                            System.out.println(Major2.get(1));
                            break;

                        case 3:
                            System.out.println(Major2.get(2));
                            break;

                        default:
                            break;
                    }
                    break;

                case 3:
                    System.out.println(lstCollege.get(2));
                    System.out.print("Select number of major : ");
                    int num3 = sc.nextInt();

                    switch (num3){
                        case 1:
                            System.out.println(Major3.get(0));
                            break;

                        case 2:
                            System.out.println(Major3.get(1));
                            break;

                        case 3:
                            System.out.println(Major3.get(2));
                            break;

                        case 4:
                            System.out.println(Major3.get(3));
                            break;

                        default:
                            break;
                    }
                    break;
            }
            return;
        }
    }
}
