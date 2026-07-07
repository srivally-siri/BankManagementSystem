package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class signUpOne extends JFrame implements ActionListener {
        
        long random;
        JTextField nameTextField, fnameTextField, emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
        JButton next;
        JRadioButton male,female,married,unmarried,other;
        JDateChooser dateChooser;
        JLabel formno,personalDetails,name,fname,dob,gender,email,marital,address, city,state,pinCode;
        
    signUpOne(){
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong()%900L)+1000L);
        //formno
        formno = new JLabel("APPLICATION FORM NO."+ random);
        formno.setFont(new Font("Osward",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        //personalDetails
        personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        //name
        name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add(name);
        //nameTextField
        nameTextField = new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        nameTextField.setFont(new Font("Raleway",Font.BOLD,20));
        add(nameTextField);
        //fname
        fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        //fnameTextField
        fnameTextField = new JTextField();
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,20));
        add(fnameTextField);
        //dob
        dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        //dateChooser
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        //gender
        gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        //male
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        //feale
        female = new JRadioButton("Female");
        female.setBounds(450,290,80,30);
        female.setBackground(Color.WHITE);
        add(female);
        //gendergroup
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        //email
        email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        //emailTextField
        emailTextField = new JTextField();
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        emailTextField.setFont(new Font("Raleway",Font.BOLD,20));
        add(emailTextField);
        //marital
        marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        //married
        married = new JRadioButton("married");
        married.setBounds(300,390,80,30);
        married.setBackground(Color.WHITE);
        add(married);
        //ummarried
        unmarried = new JRadioButton("unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        //ummarried
        other = new JRadioButton("other");
        other.setBounds(600,390,90,30);
        other.setBackground(Color.WHITE);
        add(other);
        //other
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        //address
        address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        //addressTextField
        addressTextField = new JTextField();
        addressTextField.setBounds(300,440,400,30);
        addressTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addressTextField.setFont(new Font("Raleway",Font.BOLD,20));
        add(addressTextField);
        //city
        city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        //cityTextField
        cityTextField = new JTextField();
        cityTextField.setBounds(300,490,400,30);
        cityTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cityTextField.setFont(new Font("Raleway",Font.BOLD,20));
        add(cityTextField);
        //state
        state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        //stateTextField
        stateTextField = new JTextField();
        stateTextField.setBounds(300,540,400,30);
        stateTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        stateTextField.setFont(new Font("Raleway",Font.BOLD,20));
        add(stateTextField);
        //pinCode
        pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100,590,200,30);
        add(pinCode);
        //pincodeTextField
        pincodeTextField = new JTextField();
        pincodeTextField.setBounds(300,590,400,30);
        pincodeTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,20));
        add(pincodeTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,620,80,30);
        next.addActionListener(this);
        add(next);
        
        

        setSize(850,900);
        setLocation(350,10);
        setVisible(true);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno=""+random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }
        else if(unmarried.isSelected()){
            marital = "unmarried";
        }
        else if(other.isSelected()){
            marital="other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new signUpTwo(formno).setVisible(true);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]){
        new signUpOne();
    }
}
