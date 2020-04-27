package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    permute("", word);
    }

    public static void permute(String permutated, String word){
        if (word.length() == 0){
            System.out.println(permutated);
            return;
        }
        for (int i = 0; i < word.length(); i++){
            permute(permutated + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
        }
    }

}
