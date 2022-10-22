package condition;

public class example_another {
    public static void main(String[] args) {
        char ch = 97;
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                if (i >= j) System.out.print(ch);
            }
            System.out.println();
            ch += 1;
        }
    }
}
