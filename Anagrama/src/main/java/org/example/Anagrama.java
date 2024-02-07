package org.example;

import java.util.Arrays;

public class Anagrama {
    public static boolean isAnagram(String wordOne, String wordTwo){
        //convertir las palabras en minusculas y ordenar los caracteres.
        char[] wordOneArray = wordOne.toLowerCase().toCharArray();
        char[] wordTwoArray = wordTwo.toLowerCase().toCharArray();
        Arrays.sort(wordOneArray);
        Arrays.sort(wordTwoArray);

        return Arrays.equals(wordOneArray, wordTwoArray);
    }
}
