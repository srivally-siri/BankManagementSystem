package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login, signUp, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setTitle("ATM");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        
        ImageIcon i3= new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardNo = new JLabel("CardNo:");
        cardNo.setFont(new Font("Raleway",Font.BOLD,28));
        cardNo.setBounds(120,150,150,40);
        add(cardNo);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(290, 155, 250, 30);
        cardTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cardTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(cardTextField);
        
        JLabel PIN = new JLabel("PIN:");
        PIN.setFont(new Font("Raleway",Font.BOLD,28));
        PIN.setBounds(120,220,250,30);
        add(PIN);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(290,220,250,30);
        pinTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(pinTextField);
        
        login = new JButton("SignIn");
        login.setBounds(290,290,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("Clear");
        clear.setBounds(440,290,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signUp = new JButton("SignUp");
        signUp.setBounds(290,350,250,30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800,480);
        setVisible(true);
        setLocation(300,0);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        } 
        else if(ae.getSource()==login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
            System.out.println(query);
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    
                    new Transactions(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin Nuber");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
        else if(ae.getSource()==signUp){
            setVisible(false);
            new signUpOne().setVisible(true);
        } 
        
    }
    public static void main(String args[]){
        new Login();
    }
}
