package lambda;

@FunctionalInterface
interface test_2{
    int cal(int a, int b, int c, int x);
}

public class test2 {
    public static void main(String[] args) {
        test_2 te = ((a, b, c, x) -> a * x * x + b * x + c);
        ;
        System.out.println(te.cal(1,2,3,4));
    }
}
