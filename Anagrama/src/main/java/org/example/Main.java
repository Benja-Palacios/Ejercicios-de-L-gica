package org.example;

import static org.example.Anagrama.isAnagram;

public class Main {
    public static void main(String[] args) {
        String wordOne = "Castor";
        String wordTwo = "castro";

        if (isAnagram(wordOne, wordTwo)) {
            System.out.println("las palabras "+wordOne +" y " +wordTwo + " son Anagramas");
        }else{
            System.out.println("las palabras "+wordOne +" y " +wordTwo + " no son Anagramas");
        }
    }
}