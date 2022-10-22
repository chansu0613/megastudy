package class_test_pkg;

public class member_test {
    public static void main(String[] args) {

        Car[] ticos = new Car[5];

        Car sm3 = new Car();
        sm3.color = "white";
        sm3.company = "hyundai";
        sm3.type = "gasoline";

        for (int i = 0; i < ticos.length; i++){
            ticos[i] = sm3;
        }
        System.out.println(ticos[0].color);
        sm3.color = "black";
        System.out.println(ticos[0].color);
    }
}
