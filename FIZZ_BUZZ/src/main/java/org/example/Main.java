package org.example;


public class Main {
    public static void main(String[] args) {

        int multiplo3 = 3;
        int multiplo5 = 5;

        for (int i = 1; i <=100; i++) {
            if (i % multiplo3 == 0 && i % multiplo5 == 0) {
                System.out.println(i + " FIZZ_BUZZ");
            } else if (i % multiplo3 == 0) {
                System.out.println(i + " FIZZ");
            } else if (i % multiplo5 == 0) {
                System.out.println(i + " BUZZ");
            }else{
                System.out.println(i);
            }
        }
    }
}