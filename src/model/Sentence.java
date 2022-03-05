package model;

import java.util.*;

public class Sentence {
    private String sentence;
    private Map<String, Integer> map = new HashMap<>();

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

    public void countLetter(String letter){
        if (Objects.equals(letter, " ")) {
            letter = "Blank Space";
        }else if (map.containsKey(letter)) {
            map.put(letter, map.get(letter)+1);
        }else{
            map.put(letter, 1);
        }
    }

    public void printQuantityOfLetters(){
        for (int c = 0; c<sentenceToArray().size(); c++){
            countLetter(sentenceToArray().get(c));
        }

        for (String letter: map.keySet()) {
            System.out.println(letter + ":" + map.get(letter));
        }
    }
}
