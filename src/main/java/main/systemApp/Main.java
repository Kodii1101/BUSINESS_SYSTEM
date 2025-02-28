package main.systemApp;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Main {
    public static void main(String[] args) {
        char[] password = "mySecurePassword".toCharArray();
        System.out.println("Hello, ARGON2!");
        Argon2 argon2 = Argon2Factory.create();
        String hash = argon2.hash(10, 65536, 1, password);
        System.out.println("Hashed Password: " + hash);
    }
}