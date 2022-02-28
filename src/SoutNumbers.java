import model.NumberMinorMajor;

import java.util.Scanner;

public class SoutNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type the number");
        int number= input.nextInt();

        NumberMinorMajor n = new NumberMinorMajor(number);

        System.out.println(n.arraySoutMinortoMajor());
        System.out.println(n.arraySoutMajortoMinor());
    }
}
