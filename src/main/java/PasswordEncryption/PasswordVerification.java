package PasswordEncryption;

import java.security.NoSuchAlgorithmException;

public class PasswordVerification {
    public static boolean verifyPassword(String enteredPassword, String storedHash) {
        String enteredHash = PasswordEncryption.encrypt(enteredPassword);
		return storedHash.equals(enteredHash);
    }

    public static void main(String[] args) {
        String enteredPassword = "vansda";
        String storedHash = "749330fcb81d1e2eec7b79da9badead0ba0060d27a0d2d668f2c6501d1814d55";

        boolean passwordVerified = PasswordVerification.verifyPassword(enteredPassword, storedHash);

        if (passwordVerified) {
            System.out.println("Password is correct.");
        } else {
            System.out.println("Password is incorrect.");
        }
    }
}
