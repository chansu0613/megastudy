package bank;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class account {
    Scanner sc = new Scanner(System.in);
    static int moneyInMyWallet;
    static int inputMoney;
    static int currentMoney;
    boolean exit = false;
    String inputStr;

    account(){
        this.currentMoney = 100000;
    }
    void depositMoney(){
        System.out.print("Please check your money how much do you have : ");
        this.moneyInMyWallet = sc.nextInt();

        System.out.print("Input the money how much do you want to deposit : ");
        this.inputMoney = sc.nextInt();

        if (this.moneyInMyWallet < this.inputMoney) System.out.println("Not enough money.");
        else {
            this.moneyInMyWallet -= this.inputMoney;
            this.currentMoney += this.inputMoney;
            System.out.println("The money you have now : " + this.moneyInMyWallet);
            System.out.println("Current money : " + this.currentMoney);
        }
    }

    void withdrawMoney(){

    }

    void portionOfMoney(){

    }

    void exitProgram(){
        System.out.print("Do you really want to quit our program? ( y / n ) ");
        sc.nextLine();
        this.inputStr = sc.nextLine();
        if (this.inputStr == "y") System.out.println("Quit");
        else if (this.inputStr == "n") System.out.println("Back to main menu.");
    }

    void selectMenu(){

    }
}
