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
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author ASUS
 */
public class Welcome_Page extends JFrame {
   public Container container;
    public JLabel nullLabel,welcomeLabel,projectLabel;
    public JPanel outputPanel;
    public Welcome_Page()
    {
        components();
    }
    public void components()
    {
     container = this.getContentPane();
     container.setBackground(Color.white);
     
     ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
     this.setIconImage(icon1.getImage());
     container.setLayout(new BorderLayout(150,50));
       
        nullLabel = new JLabel();
        
        container.add(nullLabel,BorderLayout.EAST);
        
        nullLabel = new JLabel();
        
        container.add(nullLabel,BorderLayout.WEST);
        
        
        
         
        outputPanel = new JPanel();
        outputPanel.setLayout(new GridLayout(2,1));
        
        outputPanel.setBackground(Color.white);
        container.add(outputPanel,BorderLayout.CENTER);
        
        welcomeLabel = new JLabel("Welcome to Digital voting system");
        welcomeLabel.setForeground(Color.blue);
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial",Font.BOLD,20));
        outputPanel.add(welcomeLabel);
        
        
        
        
        
        
        
        
        
        
        JLabel nulllaabel1= new JLabel();
        nulllaabel1.setHorizontalAlignment(JLabel.CENTER);
       nulllaabel1. setIcon(new ImageIcon("F:\\nirvachon.png"));
        outputPanel.add(nulllaabel1);
        
        
        
        
        
        
        
        
        
     
     
    }
    
     }
    

