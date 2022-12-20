/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spl_project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Password_check extends JFrame
{
    Container c;
    JLabel label;
    JButton button_cancel,button_ok;
    JPasswordField password;
    String Text_password;
    public Password_check() 
    {
        components();
    }
    public void components() 
    {
        c=this.getContentPane();
        c.setLayout(null);
        
        label=new JLabel("Password :");
        label.setBounds(15,20,90,30);
        label.setFont(new Font("Arial",Font.BOLD,15));
        c.add(label);
        
        password=new JPasswordField();
        password.setBounds(110,20,150,30);
        password.setBackground(Color.white);
        c.add(password);
        
        
        
        button_cancel=new JButton("Cancel");
        button_cancel.setFont(new Font("Arial",Font.BOLD,15));
        button_cancel.setBounds(40,60,85,30);
        button_cancel.setBackground(Color.blue);
        button_cancel.setForeground(Color.yellow);
        c.add(button_cancel);
        
        button_ok=new JButton("Ok");
        button_ok.setFont(new Font("Arial",Font.BOLD,15));
        button_ok.setBounds(148,60,85,30);
        button_ok.setBackground(Color.blue);
        button_ok.setForeground(Color.yellow);
        c.add(button_ok);
        
        // reading the  given password line(2nd line)
        
        try{
         Text_password=Files.readAllLines(Paths.get("E:\\voting_info.txt")).get(1);
        }
        catch(Exception e)
        {
            System.out.println("error in reading password");
        }
        
        
        
        button_ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //getting text from jpasswordfield
                 String text=password.getText();
                
                if(text.equals(Text_password))
                {
                    dispose();
                    
                   try{
                   File newfile3= new File("E:\\Vote_End.txt");
                   if(!newfile3.createNewFile())
                   { 
                      newfile3.delete();
                      newfile3.createNewFile();        }
                   else
                   {
                   newfile3.createNewFile();}
                    }
                    catch(IOException ex){
                      System.out.println("An error is occured.");
                    }
                    
                    
                    // showing the result panel if password is ok
                    Result_panel frame2=new Result_panel(); 
                    frame2.setVisible(true);
                    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame2.setSize(700,500);
                    frame2.setLocationRelativeTo(null);
                    frame2.setTitle("Result panel");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Password is wrong", "Error", JOptionPane.ERROR_MESSAGE);
                    text="";
                }
        
 

            }
        });
        
        //cancel button dispose the current frame 
        button_cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                dispose();
                Ending_page frame=new Ending_page();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(700, 500);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setTitle("Ending Page");  
                
 

            }
        });
    }
    
    
    
}
