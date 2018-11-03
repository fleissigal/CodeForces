import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class VasyaAndPassword_Round51A {




    public static void main(String[] args) {


        // Store T, and go over all of the strings one by one, sending each string to an aux function
        // The function will return the renewed password. Store the renewed password in an array

        Scanner reader = new Scanner(System.in);
        int T = Integer.parseInt(reader.nextLine());
        ArrayList<String> passwords = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            String tmp = reader.nextLine();
            passwords.add(i, changePassword(tmp));
        }

        reader.close();

        // Print the array line by line

        for (int i = 0; i < T; i++) {
            System.out.print(passwords.get(i));
            System.out.print("\n");
        }



    }

    static String changePassword(String oldPassword) {

        boolean hasUpperCase = hasUpperCase(oldPassword);
        boolean hasLowerCase = hasLowerCase(oldPassword);
        boolean hasNumber = hasNumber(oldPassword);

        if (hasUpperCase && hasLowerCase && hasNumber) return oldPassword;

        if (hasUpperCase && hasLowerCase && !hasNumber) {

            int numOfUpperCase = 0;
            int numOfLowerCase = 0;

            for (int i = 0; i < oldPassword.length(); i++) {
                if (isUpperCase(oldPassword.charAt(i))) numOfUpperCase++;
                if (numOfUpperCase > 1) return oldPassword.substring(0, i) + "1" + oldPassword.substring(i+1);
                if (isLowerCase(oldPassword.charAt(i))) numOfLowerCase++;
                if (numOfLowerCase > 1) return oldPassword.substring(0, i) + "1" + oldPassword.substring(i+1);
            }
        }

        if (hasUpperCase && !hasLowerCase && hasNumber) {
            int numOfUpperCase = 0;
            int numOfDigits = 0;

            for (int i = 0; i < oldPassword.length(); i++) {
                if (isUpperCase(oldPassword.charAt(i))) numOfUpperCase++;
                if (numOfUpperCase > 1) return oldPassword.substring(0, i) + "a" + oldPassword.substring(i+1);
                if (isDigit(oldPassword.charAt(i))) numOfDigits++;
                if (numOfDigits > 1) return oldPassword.substring(0, i) + "a" + oldPassword.substring(i+1);
            }
        }

        if (!hasUpperCase && hasLowerCase && hasNumber) {
            int numOfLowerCase = 0;
            int numOfDigits = 0;

            for (int i = 0; i < oldPassword.length(); i++) {
                if (isLowerCase(oldPassword.charAt(i))) numOfLowerCase++;
                if (numOfLowerCase > 1) return oldPassword.substring(0, i) + "A" + oldPassword.substring(i+1);
                if (isDigit(oldPassword.charAt(i))) numOfDigits++;
                if (numOfDigits > 1) return oldPassword.substring(0, i) + "A" + oldPassword.substring(i+1);
            }
        }

        if (!hasUpperCase && !hasLowerCase && hasNumber) {
            return "Aa" + oldPassword.substring(2);
        }

        if (hasUpperCase && !hasLowerCase && !hasNumber) {
            return "1a" + oldPassword.substring(2);
        }

        if (!hasUpperCase && hasLowerCase && !hasNumber) {
            return "A1" + oldPassword.substring(2);
        }

        return "";
    }

    static boolean hasUpperCase(String s) {
        return !s.equals(s.toLowerCase());
    }

    static boolean hasLowerCase(String s) {
        return !s.equals(s.toUpperCase());
    }

    static boolean hasNumber(String s) {
        return s.matches(".*\\d+.*");
    }

}
