package com.mycompany.recursion;

public class Recursion {

    public static int fact(int n) {

        if (n <= 1) { // base case
            return 1;
        } else { // recursive case
            return n * fact(n - 1);
        }
    }

    public static String reverseString(String input) {
        if (input.equals("")) {
            return "";
        } else {
            return reverseString(input.substring(1)) + input.charAt(0);
        }
    }

    public static boolean isPalindrome(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        } else if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length() - 1));
        }

        return false;
    }

    public static int sum(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The factorial of 5 is " + fact(5));

        // alternatively we would sum up natural numbers as follows
        int n = 100;
        System.out.println("Sum of natural numbers from 1 to " + n + " is " + sum(n));

        String aString = "HowDoesitWork";
        System.out.println(aString + " reversed is " + reverseString(aString));

        aString = "amanaplanacanalpanama";
        if (isPalindrome(aString)) {
            System.out.println(aString + " is a Palindrome");
        } else {
            System.out.println(aString + " is not a Palindrome");
        }

    }

}
