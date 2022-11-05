package stream;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class stream_t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num : ");
        int num = sc.nextInt();

        IntStream intStream = IntStream.range(1,10);
        intStream.forEach(n -> System.out.println(n*num));

    }
}
