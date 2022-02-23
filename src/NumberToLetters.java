import model.Number;

import java.util.Scanner;

public class NumberToLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type the number that you want to convert to letters: ");
        int x = input.nextInt();

        if (x > 100000000) {
            System.out.println(
                    "Invalid number"
            );
        } else {
            Number n = new Number(x);
            System.out.println(n);
        }
    }
}
