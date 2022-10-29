package generic;

public class generic_test<T> {

    T[] tArray;

    void set(T[] n){
        tArray = n;
    }

    T[] get(){
        return tArray;
    }

    void print(){
        for (T element:tArray){
            System.out.println(element+"");
        }
        System.out.println();
    }
}
