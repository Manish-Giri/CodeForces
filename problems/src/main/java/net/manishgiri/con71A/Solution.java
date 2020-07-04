package net.manishgiri.con71A;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int n = scanner.nextInt();
        String[] words = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
        internationalize(words);
    }

    private static void internationalize(String[] words) {
        int wordLen;
        for (String word: words) {
            wordLen = word.length();
            if(wordLen < 10) {
                System.out.println(word);
            }
            else {
                System.out.println(word.charAt(0) + String.valueOf(word.substring(1, wordLen-1).length()) + word.charAt(wordLen-1));
            }
        }
    }
}
