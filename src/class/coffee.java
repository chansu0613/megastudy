import java.util.Scanner;

public class coffee {
    Scanner sc = new Scanner(System.in);
    String str1;
    String[] selectMenu;
    int[] coffeePrice;
    int sum = 0;

    coffee(){
        this.str1 = sc.nextLine();
        this.selectMenu = new String[]{"latte", "ice americano", "espresso", "strawberry juice", "mint choco"};
        this.coffeePrice = new int[]{6500, 4000, 4500, 4300, 5000};
    }

    void starbucksMenu(String str1){
        for (int i = 0; i < selectMenu.length; i++) {
            if (str1 == selectMenu[i]) {
                System.out.println("you select " + coffeePrice[i]);
                System.out.println();
            }
            else {
                System.out.println("you select wrong menu.");
                System.out.println();
            }
        }
    }

    void price(String str1){
        for (int i = 0; i < selectMenu.length; i++) {
            if (str1 == selectMenu[i]) {
                sum += coffeePrice[i];
                System.out.println("You need to pay " + sum);
                System.out.println();
            }
            else System.out.println("Please check your menu.");
            System.out.println();
        }
    }
}