import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("input number: ");
        int num = sc.nextInt();
        int[] rand = new Random().ints(num, -10000, 10000).toArray();
//        int[] intStreamToArray = rand.toArray();

        OptionalInt maxInt = Arrays.stream(rand).max();
        OptionalInt minInt = Arrays.stream(rand).min();
        OptionalDouble avgDouble = Arrays.stream(rand).average();

        System.out.println("max : " + maxInt.getAsInt() + "\n" + "min : " + minInt.getAsInt() + "\n" + "avg : " + avgDouble.getAsDouble());

//        위가 한줄이라 짧긴 한데 보기에는 아래가 가독성이 좋은것 같고 리팩토링이 어떻게 해야 좋은건지 아직 잘 모르겠습니다.

//        System.out.println("max : " + maxInt.getAsInt());
//        System.out.println("min : " + minInt.getAsInt());
//        System.out.println("avg : " + avgDouble.getAsDouble());
    }
}