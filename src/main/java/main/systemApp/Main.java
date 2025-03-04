//package
package main.systemApp;

//package local

//package external
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
        System.out.println("Transitioned to JavaFX!");
        char[] password = "mySecurePassword".toCharArray();
        System.out.println("Hello, ARGON2!");
        Argon2 argon2 = Argon2Factory.create();
        String hash = argon2.hash(10, 65536, 1, password);
        System.out.println("Hashed Password: " + hash);
    }
}
