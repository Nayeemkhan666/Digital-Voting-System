/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spl_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ending_page extends JFrame
{
    Container c;
    JPanel outputPanel,innerpanel1;
    JLabel label1,nullLabel;
    JButton button; 
    public Ending_page()
    {
        components();
    }
    public void components()
    {
        c=this.getContentPane();
        c.setBackground(Color.white);
        c.setLayout(new BorderLayout(150,100));
        
        nullLabel = new JLabel(); 
        
        c.add(nullLabel,BorderLayout.EAST);
        
        nullLabel = new JLabel();
        c.add(nullLabel,BorderLayout.WEST);
        
        nullLabel = new JLabel(); 
        c.add(nullLabel,BorderLayout.NORTH);
        
        nullLabel = new JLabel();
        c.add(nullLabel,BorderLayout.SOUTH);
        
        outputPanel = new JPanel();
        outputPanel.setLayout(new GridLayout(5,1));
        
        outputPanel.setBackground(Color.white);
        c.add(outputPanel,BorderLayout.CENTER);
        
        label1=new JLabel("Voting is  started");
        label1.setOpaque(true);
        label1.setFont(new Font("Arial",Font.BOLD,18));
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setBackground(Color.white);
        label1.setForeground(Color.black);    
        outputPanel.add(label1);
        
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        outputPanel.add(nullLabel);
        
        innerpanel1=new JPanel();
        innerpanel1.setLayout(new GridLayout(1,3));
        innerpanel1.setBackground(Color.white);
        outputPanel.add(innerpanel1);
        
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        innerpanel1.add(nullLabel);
        
        button=new JButton("End");
        button.setForeground(Color.YELLOW);
        button.setBackground(Color.blue);
        button.setFont(new Font("Arial",Font.BOLD,15));
        innerpanel1.add(button);
        
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        innerpanel1.add(nullLabel);
        
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        outputPanel.add(nullLabel);
        
         nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        outputPanel.add(nullLabel);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
               dispose();
               Password_check frame=new Password_check();
               frame.setVisible(true);
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setSize(280,150);
               frame.setLocationRelativeTo(null);
               frame.setResizable(false);
               frame.setTitle("Password Check"); 
                
 

            }
        });
        
    }
    
  
    
       
        
        
        
        
        
    
}
