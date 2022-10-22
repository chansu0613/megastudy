package class_test;

public class Num {
    int untilNowMax;
    int untilNowMin;

    //1. 배열을 받는다.
    //2. ...(spread operator)
    void FindNum(int ...x){
        //알고리즘 개념
        int max = x[0];
        for (int i = 0;i <x.length;i++){
            //0 ... i ... n
            if(max<x[i]) {
                max = x[i];
                if (untilNowMax < i) untilNowMax = i;
            }
        }
        System.out.println(max);
    }
    void FindNumSecond(int ...x) {
        //알고리즘 개념
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            //0 ... i ... n
            if (min < x[i]) {
                min = x[i];
                if (untilNowMin > i) untilNowMin = i;
            }
        }
        System.out.println(min);
    }
    void FindMaxMin(int ...x){
        FindNum(x);
        FindNumSecond(x);
    }
    void Minus(String cases){
        if (untilNowMax == 0 || untilNowMin == 0) System.out.println("wrong");
        switch (cases){
            case "plus":System.out.println(untilNowMax+untilNowMin); break;
            case "minus":System.out.println(untilNowMax-untilNowMin); break;
            case "multi":System.out.println(untilNowMax*untilNowMin); break;
            case "divide":System.out.println(untilNowMax/untilNowMin); break;
        }
    }
}
