// version 1.0
// author Abc
// useCase 1: Welcome page
// useCase 2: Print Hardcoded Palindrome Result

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App Management System");

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}
