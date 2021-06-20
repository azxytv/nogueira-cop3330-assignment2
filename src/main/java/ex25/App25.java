package ex25;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Adam Nogueira
 */

class Main {
    public static void main(String[] args) {
        JFrame jf= new JFrame("PASSWORD VALIDATOR");
        JLabel l,answer;
        JTextField t;
        JButton check,reset;

        l=new JLabel("Enter a Password");
        answer=new JLabel("Result will be shown here");
        t=new JTextField(20);
        check=new JButton("Check Password");
        reset=new JButton("Reset");
        jf.add(l);
        jf.add(t);
        jf.add(check);
        jf.add(reset);
        jf.add(answer);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password=t.getText();
                String result=passwordValidator(password);
                answer.setText(result);
                answer.setForeground(Color.red);
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("");
                answer.setText("Result will be shown here");
                answer.setForeground(Color.black);
            }
        });
        jf.setSize(700,100);
        jf.setLayout(new FlowLayout());
        //f.pack();
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static String passwordValidator(String password){
        int digits=0;
        int symbols=0;
        int letters=0;
        String result="The password '"+password+"' is a ";
        for(int i=0;i<password.length();i++){
            if(Character.isDigit(password.charAt(i))){
                digits++;
            }
            else if(Character.isLetter(password.charAt(i))){
                letters++;
            }
            else{
                symbols++;
            }
        }
        if(password.length()<8){
            if(digits==password.length()){
                result+="very weak password";
            }
            else if(letters==password.length()){
                result+="weak password";
            }
        }
        else{
            if(letters!=0 && digits!=0 && symbols!=0){
                result+="very strong password";
            }
            else if(letters!=0 && digits!=0){
                result+="strong password";
            }

        }
        return result;
    }
}

