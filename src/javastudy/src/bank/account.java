package bank;

import java.util.Arrays;
import java.util.Scanner;

public class account {
    Scanner sc = new Scanner(System.in);
    int money;
    int presentMoney;
    boolean exit = false;
    String[] str;
    String input;

    account(){
        this.money = sc.nextInt();
        this.presentMoney = 50000;
        this.str = new String[]{"y", "n"};
        this.input = sc.nextLine();
    }
    void depositMoney(){
        this.presentMoney += this.money;
        System.out.println("Present money is "+this.presentMoney);
        System.out.println();
    }

    void withdrawMoney(){

    }

    void portionOfMoney(){

    }

    void exitProgram(){
        System.out.println("Do you really want to quit our program?");
        this.input = sc.nextLine();
        System.out.println(this.input);
        if (this.input == "y") System.out.println("Quit");
        else System.out.println("Back to main menu.");
    }

    void selectMenu(){

    }
}
