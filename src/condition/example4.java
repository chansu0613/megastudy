package condition;

public class example4 {
    public static void main(String[] args) {
        for(int i = 0; i <= 9; i++){
            for (int j = 0; j <= 5; j++){
                if (i >= j) System.out.print("*");
            }
            System.out.println();
        }
    }
}
