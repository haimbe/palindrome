package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

    }
}

public class Palindrome {
    private String premierMot;
    private String secondMot;

    public Palindrome() {
        premierMot = "mot1";
        secondMot = "mot2";
    }


    public class void Palindrome2 (String premierMot, String secondMot){

       this.premierMot = "Kayak";
        this.secondMot = "Kayak";
        int i, nombre;
        nombre = 0;


        if (premierMot.length() == secondMot.length()) {

            for (i = 0; i < premierMot.length(); i++) {

                if (premierMot.charAt(i) == (secondMot.charAt(premierMot.length() - 1 - i))) {
                    nombre++;
                } else {
                    System.out.println("Ce ne sont pas des palindromes");
                }
            }
        }
        else{
                System.out.println("Ce ne sont pas des palindromes");
            }

            if (nombre == premierMot.length()) {
                System.out.println("Ce sont des palindromes");
            }



    }
}
