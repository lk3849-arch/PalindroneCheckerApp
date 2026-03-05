// version 3.0
// author Abc
// Use Case 3: Reverse String Based Palindrome Check

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String reversed = "";

        // Reverse the string using for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

        sc.close();
    }
}