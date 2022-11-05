package lambda;

import static java.lang.Integer.sum;

@FunctionalInterface
interface lanbdaInterface4{
    int cal(int x, int y);
}
public class test1 {
    public static void main(String[] args) {
        lanbdaInterface4 f4 = (x, y) -> {
            return x*y;
        };
        System.out.println("mul : "+ f4.cal(3,2));

        f4 = (x,y) -> x+y;
        System.out.println(f4.cal(3,2));

        f4 = (x,y) -> x-y;
        System.out.println(f4.cal(3,2));

        f4 = (x, y) -> {return x/y;};
        System.out.println(f4.cal(3,2));

        f4 = ((x, y) -> x%y);
        System.out.println(f4.cal(3,2));

        f4 = ((x, y) -> sum(x,y));
        System.out.println(f4.cal(3,2));
    }
}
