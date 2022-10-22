package class_test;

public class NumSecond {
    void FindNumSecond(int ...x){
        int min = x[0];
        for (int i = 0;i <x.length;i++){
            //0 ... i ... n
            if(min>x[i]) min = x[i];
        }
        System.out.println(min);
    }
}
