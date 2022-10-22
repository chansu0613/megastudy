package class_test._example;

public class Reser {
    int s[][] = new int[10][14];
    int r = 0;
    char c = ' ';
    boolean s_out;

    void makeReser(){

    }
    void confirmReser(){
        if (s_out == true) System.out.println("Reservation finished");
        else makeReser();
    }
}
