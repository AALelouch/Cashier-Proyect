package model;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private String sentence;
    private final String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private final int[] quantityOfLetters = new int[27];

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public List<String> sentenceToArray(){
        List<String> sentenceInLetters = new ArrayList<>();
        sentence = sentence.toLowerCase();
        for (int count = 0; count<sentence.length(); count++){
            sentenceInLetters.add(String.valueOf(sentence.charAt(count)));
        }
        return sentenceInLetters;
    }

    //count of letters
    public void setIndexOfArray(int index){
        quantityOfLetters[index] = quantityOfLetters[index]+1;
    }

    public void countLetter(String letter){
        switch (letter){
            case "a":
                setIndexOfArray(0);
                break;
            case "b":
                setIndexOfArray(1);
                break;
            case "c":
                setIndexOfArray(2);
                break;
            case "d":
                setIndexOfArray(3);
                break;
            case "e":
                setIndexOfArray(4);
                break;
            case "f":
                setIndexOfArray(5);
                break;
            case "g":
                setIndexOfArray(6);
                break;
            case "h":
                setIndexOfArray(7);
                break;
            case "i":
                setIndexOfArray(8);
                break;
            case "j":
                setIndexOfArray(9);
                break;
            case "k":
                setIndexOfArray(10);
                break;
            case "l":
                setIndexOfArray(11);
                break;
            case "m":
                setIndexOfArray(12);
                break;
            case "n":
                setIndexOfArray(13);
                break;
            case "ñ":
                setIndexOfArray(14);
                break;
            case "o":
                setIndexOfArray(15);
                break;
            case "p":
                setIndexOfArray(16);
                break;
            case "q":
                setIndexOfArray(17);
                break;
            case "r":
                setIndexOfArray(18);
                break;
            case "s":
                setIndexOfArray(19);
                break;
            case "t":
                setIndexOfArray(20);
                break;
            case "u":
                setIndexOfArray(21);
                break;
            case "v":
                setIndexOfArray(22);
                break;
            case "w":
                setIndexOfArray(23);
                break;
            case "x":
                setIndexOfArray(24);
                break;
            case "y":
                setIndexOfArray(25);
                break;
            case "z":
                setIndexOfArray(26);
                break;
            case " ":
                break;
        }
    }

    public void printQuantityOfLetters(){
        for (int c = 0; c<sentenceToArray().size(); c++){
            countLetter(sentenceToArray().get(c));
        }

        for (int c = 0; c< quantityOfLetters.length; c++){
            if (quantityOfLetters[c] != 0){
                System.out.println(alphabet[c] + "-->" + quantityOfLetters[c]);
            }
        }
    }

}
