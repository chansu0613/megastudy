import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        System.out.print("원하는 단수를 입력하시오: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Map mul = new HashMap();

        System.out.println("\n구구단"+" "+ num +"단 출력!");

        for (int i = 1; i < 10;i++){
            mul.put(num, num * i);
            System.out.println(num + " * "+ i + " = " + mul.put(num, num * i));
        }
    }
}
