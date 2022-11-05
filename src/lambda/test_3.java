package lambda;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class test_3 {
    public static void main(String[] args) {

        Supplier<String> s1 = () -> {
            return "hong gil dong";
        };
        System.out.println(s1.get());

        s1 = () -> "lee sun sin";
        System.out.println(s1.get());

        IntSupplier s2 = () -> (int) (Math.random() * 6) +1;
        System.out.println("dice : "+ s2.getAsInt());


        DoubleSupplier s3 = () -> Math.random();
        System.out.println("random : "+ s3.getAsDouble());
    }
}
