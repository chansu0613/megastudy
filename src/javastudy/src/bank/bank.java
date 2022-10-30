package bank;

public class bank {
    public static void main(String[] args) {
        bankUI b2 = new bankUI();

        b2.showUI();

        account b = new account();

        b.depositMoney();

        b.exitProgram();
    }
}
