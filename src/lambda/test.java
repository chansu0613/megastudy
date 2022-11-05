package lambda;

import java.util.Scanner;

//interface testEx{
//    int myAdd(int x, int y);
//}
//interface testEx1{
//    int mySub(int w, int z);
//}

interface  testEx{
    void print(String name);
}
public class test {
    public static void main(String[] args) {

        testEx te = name -> System.out.println("my name is " + name);
        te.print("hojea");
//        testEx te = (int x, int y)-> x + y + 100;
//        System.out.println(te.myAdd(2, 98));
//
//        testEx1 te1 = (int w, int z) -> w - z;
//        System.out.println(te1.mySub(50,40));
    }
}
