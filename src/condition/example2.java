package condition;

public class example2 {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }else{
                oddSum += i;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
