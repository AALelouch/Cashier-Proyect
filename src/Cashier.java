import model.Withdrawals;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag1 = true;
        while (flag1) {
            System.out.println("Do you want to do a withdrawal?, 1 for yes and 2 for not");
            int op;
            op = input.nextInt();

            if (op == 1) {
                System.out.println("Type the quantity of this withdrawal");
                int q;
                q = input.nextInt();
                try {
                    Withdrawals w1 = new Withdrawals(q);
                    w1.calculateTheNumberOfBills();
                    System.out.println("The quantity of fifty bills are " + w1.get1());
                    System.out.println("The quantity of twenty bills are " + w1.get2());
                    System.out.println("The quantity of ten bills are " + w1.get3());
                    System.out.println(w1.getCashRequest());
                }
                catch (IllegalArgumentException e){
                    System.out.println("Invalid value for the withdrawal");
                }

            }
            if (op == 2) {
                System.out.println("Thanks for use me");
                flag1 = false;
            }
            if (op != 1 && op != 2){
                System.out.println("Invalid option");
                System.out.println();
            }
        }

    }
}