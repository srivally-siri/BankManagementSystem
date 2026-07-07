package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener{
    
    String pinnumber;
    JButton b1;
    JLabel mini;
    
    MiniStatement(String pinnumber){
        this.pinnumber = pinnumber;
//        super("Mini Statement");
        
        setLayout(null);
        
        
        mini = new JLabel();
        add(mini);
        
        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150,20,100,20);
        add(bank); 
        
        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        
        JLabel balance = new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);
        System.out.println("Received PIN: " + pinnumber);
        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pinnumber = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number: "+rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardnumber").substring(12));
            }
        }
        catch(Exception e){
        }
        
        try{
            int bal=0;
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br></html>");
                if(rs.getString("type").equals("deposit")){
                        bal += Integer.parseInt(rs.getString("amount"));
                    }
                    else {
                        bal -= Integer.parseInt(rs.getString("amount"));
                    }
            }
            balance.setText("Your current ccount balance is Rs "+bal);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        b1 = new JButton("Exit");
        add(b1);
        
        b1.addActionListener(this);
        
        mini.setBounds(20,140,400,200);
        b1.setBounds(250, 500, 100, 25);
        
//        super("Mini Statement");
        setSize(400,600);
        setLocation(50,50);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String args[]){
        new MiniStatement("");
    }
    
}
