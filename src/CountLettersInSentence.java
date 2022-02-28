import model.Sentence;

import java.util.Scanner;

public class CountLettersInSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your sentence");
        String sentence = input.nextLine();

        Sentence sentenceOne = new Sentence(sentence);
        sentenceOne.printQuantityOfLetters();
    }
}
