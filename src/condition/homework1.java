package condition;

public class homework1 {
    public static void main(String[] args) {

        int mid = 4;
        int right = mid;
        int left = mid;

        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 9; j++) {
                if (left <= j && j <= right) System.out.print("*");
                else System.out.print(" ");
            }
            left--;
            right++;
            System.out.println();
        }
    }
}
