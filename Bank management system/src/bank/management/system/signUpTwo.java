package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class signUpTwo extends JFrame implements ActionListener {
        
        JTextField  pan,aadhar;
        JButton next;
        JRadioButton eyes,eno,syes,sno;
        JLabel additionalDetails,name,fname,dob,gender,email,marital,address, city,state,pinCode;
        JComboBox religion,category,income,education,occupation;
        String formno;
        
    signUpTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUT APPLICATION FORM - PAGE 2");
        
        //personalDetails
        additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        //name
        name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add(name);
        
        String valReligion[] = {"Hindhu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        //fname
        fname = new JLabel("Category: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[] = {"General","OBC","SC","ST","other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        //dob
        dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        //dateChooser
        
        String incomecategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        //gender
        gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
       
        
        
        //email
        email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educationValues[] = {"Non-Graduation","Graduation","Post Graduation","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        //marital
        marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String OccupationValues[] = {"Salaried","Self Employed","Bussiness","Student","Retired","Others"};
        occupation = new JComboBox(OccupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        //address
        address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        //addressTextField
        pan = new JTextField();
        pan.setBounds(300,440,400,30);
        pan.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        add(pan);
        //city
        city = new JLabel("Aadhar No:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        //cityTextField
        aadhar = new JTextField();
        aadhar.setBounds(300,490,400,30);
        aadhar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        add(aadhar);
        //state
        state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        //stateTextField
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(400,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup sgrp = new ButtonGroup();
        sgrp.add(syes);
        sgrp.add(sno);
        
        //pinCode
        pinCode = new JLabel("Existing Account:");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100,590,200,30);
        add(pinCode);
        //pincodeTextField
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(400,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup egrp = new ButtonGroup();
        egrp.add(eyes);
        egrp.add(eno);
        
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
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }
        else if(sno.isSelected()){
            seniorcitizen="No";
        }
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        }
        else if(eno.isSelected()){
            existingaccount = "No";
        }
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                  setVisible(false);
                  new signUpThree(formno).setVisible(true);
                
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        
    }
    
    public static void main(String args[]){
        new signUpTwo("");
    }
}
