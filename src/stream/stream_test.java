package stream;

import java.util.stream.IntStream;

public class stream_test {
    public static void main(String[] args) {
        //1. 스트림 생성
        IntStream intStream = IntStream.range(1,101);
        //2. 스트림 가공
        intStream.filter(num -> num % 5 == 0).forEach(num-> System.out.println(num));
    }
}
