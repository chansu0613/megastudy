package generic;

public class genEx {
    public static void main(String[] args) {
        Generic<String> gen = new Generic<String>();
        String[] ss = {"홍길동", "이순신", "김유신"};

        gen.set(ss);
        gen.print();

        for (String s : gen.get()){
            System.out.println(s);
        }

        Integer[] ii = {1,2,3};

        Generic<Integer> gen2 = new Generic<Integer>();
        gen2.set(ii);
        gen2.print();

        for (Integer o : gen2.get()){
            System.out.println(o);
        }

    }
}

class Generic<T> {

    T[] tArray;

    void set(T[] n){
        tArray = n;
    }

    T[] get(){
        return tArray;
    }

    void print(){
        for (T o : tArray){
            System.out.println(o+" ");
        }
        System.out.println();
    }
}