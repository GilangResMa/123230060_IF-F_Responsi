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
public class InputData extends JFrame{
    ControllerAdmin controller;
    JLabel header = new JLabel("Input Data Penginapan");
    JLabel nama = new JLabel("Nama:");
    JLabel kontak = new JLabel("Kontak:");
    JLabel ruang = new JLabel("Ruang Menginap:");
    JLabel durasi = new JLabel("Durasi Menginap:");
    JLabel status = new JLabel("Status:");
    JTextField inputNamaField = new JTextField();
    JTextField inputKontakField = new JTextField();
    JTextField inputRuangField = new JTextField();
    JTextField inputDurasiField = new JTextField();
    JTextField inputStatusField = new JTextField();
    JButton addButton = new JButton("Add");
    JButton updateButton = new JButton("Update");
    JButton deleteButton = new JButton("Delete");
    JButton clearButton = new JButton("Clear");
    
    public InputData(){
        controller = new ControllerAdmin(this);
        setTitle("Login Page");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(480,240);
        
        add(header);
        add(nama);
        add(kontak);
        add(ruang);
        add(durasi);
        add(status);
        add(inputNamaField);
        add(inputKontakField);
        add(inputRuangField);
        add(inputDurasiField);
        add(inputStatusField);
        add(addButton);
        add(updateButton);
        add(deleteButton);
        add(clearButton);
        
        header.setBounds(20, 8, 440,24);
        username.setBounds(20, 32, 200,24);
        usernameField.setBounds(50, 32, 440,24);
        password.setBounds(20, 96, 200,24);
        passwordField.setBounds(50, 96, 440,24);
        login.setBounds(20, 160, 215,40);
        

       
    }}
