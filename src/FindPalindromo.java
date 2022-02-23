import model.Date;

import java.util.Scanner;

public class FindPalindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de palindromos:");
        int quantity = input.nextInt();
        try {
            Date d = new Date(23, 2, 2022, quantity);
            System.out.println(d.findPalindromo());


        }catch (IllegalArgumentException e){
            System.out.println("Invalid Quantity");
        }
    }
}
