public class star_test {
    public static void main(String[] args) {

        int mid = 5;
        int left = mid;
        int right = mid;

        for(int i = 0; i < 5;i++){
            for (int j = 0; j < 9;j++) {
                if (j >= mid && j <= mid) {
                    System.out.print("*");
                }
                else if(j < mid){
                    System.out.print(" ");
                }
            }
            left--;
            right++;
            System.out.print(" "+left);
            System.out.print(" "+right);
            System.out.println();
        }
    }
}
