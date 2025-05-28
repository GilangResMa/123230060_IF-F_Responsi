/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Admin;
import Controller.Admin.ControllerAdmin;
import Model.Admin.*;
import View.Admin.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Lab Informatika
 */
public class LoginPage extends JFrame{
    ControllerAdmin controller;
    JLabel header = new JLabel("Login Page");
    JLabel username = new JLabel("Username:");
    JLabel password = new JLabel("Password:");
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton login = new JButton("Login");
    
    public LoginPage(){
        controller = new ControllerAdmin(this);
        setTitle("Login Page");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(480,240);
        
        add(header);
        add(username);
        add(usernameField);
        add(password);
        add(passwordField);
        add(login);
        
        header.setBounds(20, 8, 440,24);
        username.setBounds(20, 32, 200,24);
        usernameField.setBounds(100, 32, 440,24);
        password.setBounds(20, 96, 200,24);
        passwordField.setBounds(100, 96, 440,24);
        login.setBounds(20, 160, 215,40);
        
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new InputData();
            }});    
        }
    }
