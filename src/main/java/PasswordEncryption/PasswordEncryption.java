package PasswordEncryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryption {
    public static String encrypt(String password) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(password.getBytes());
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : hash) {
                stringBuilder.append(String.format("%02x", b));
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String password = "Password";
        String encryptedPassword = PasswordEncryption.encrypt(password);
        System.out.println("Encrypted Password: " + encryptedPassword);
    }
}

    
    


