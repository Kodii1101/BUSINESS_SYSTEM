//package
package main.systemApp;

//package local

//package external
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
        // Create a new window (JFrame)
        JFrame frame = new JFrame("Login System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(620, 450);
        frame.setLayout(new GridBagLayout()); // Grid-based layout

        // Create UI Components
        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField(15);

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passText = new JPasswordField(15);

        JButton loginButton = new JButton("Login");

        // Layout Manager
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding

        // Add components to the window
        gbc.gridx = 0; gbc.gridy = 0; frame.add(userLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 0; frame.add(userText, gbc);

        gbc.gridx = 0; gbc.gridy = 1; frame.add(passLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 1; frame.add(passText, gbc);

        gbc.gridx = 1; gbc.gridy = 2; frame.add(loginButton, gbc);

        // Button Click Event
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Center and Show Window
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
        /*char[] password = "mySecurePassword".toCharArray();
        System.out.println("Hello, ARGON2!");
        Argon2 argon2 = Argon2Factory.create();
        String hash = argon2.hash(10, 65536, 1, password);
        System.out.println("Hashed Password: " + hash);*/
    }
