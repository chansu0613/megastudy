package api;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연도 : ");
        int year = sc.nextInt();
        System.out.print("달: ");
        int month = sc.nextInt();
        System.out.print("일: ");
        int day = sc.nextInt();



        Calendar cal = Calendar.getInstance();

        if (year > cal.get(Calendar.YEAR)) {
            year -= cal.get(Calendar.YEAR);
            if (month > cal.get(Calendar.MONTH) + 1) {
                month -= cal.get(Calendar.MONTH) + 1;
                if (day > cal.get(Calendar.DAY_OF_MONTH)) {
                    day -= cal.get(Calendar.DAY_OF_MONTH);
                }
            }
        }
    }
}
