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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Result_panel extends JFrame{
    JLabel label,label1,label2,label3,nullLabel;
    Container c;
    JPanel outputPanel,innerpanel1;
    JTextArea button1,button2,button3;
    JButton button;
   // String specific_line_text1,specific_line_text2,specific_line_text3,specific_line_text4,specific_line_text5,specific_line_text6;
    //String str1,str2,str3;
    int number1=0,number2=0,number3=0;
   public Result_panel(){
    components();
} 
    
    public void components(){
    c=this.getContentPane();
    c.setBackground(Color.white);
    c.setLayout(new BorderLayout(50,100));
    
    Font f=new Font("SansSerif", Font.BOLD, 18);
    
     
    ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
    this.setIconImage(icon1.getImage());
    
    //vote counting of candidate 1
    
		try (BufferedReader br = new BufferedReader(new FileReader("E:\\file1.txt"))) {
			
			while (( br.readLine()) != null) {
				number1=number1+1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
                //ends vote counting of candidate 1
                
    //vote counting of candidate 2
    
		try (BufferedReader br = new BufferedReader(new FileReader("E:\\file2.txt"))) {
			
			while (( br.readLine()) != null) {
				number2=number2+1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}//ends vote counting of candidate 2
                
    //vote counting of candidate 3
    
		try (BufferedReader br = new BufferedReader(new FileReader("E:\\file3.txt"))) {
			
			while (( br.readLine()) != null) {
				number3=number3+1;
			}
		} catch (IOException e) {
			e.printStackTrace();
                       
                        
		}//ends vote counting of candidate 3
                
                //converting votes into string for printing
                String str1=String.valueOf(number1);
                String str2=String.valueOf(number2);
                 String str3=String.valueOf(number3);
                 //ends converting
       nullLabel = new JLabel();        
        c.add(nullLabel,BorderLayout.EAST);
        
        nullLabel = new JLabel();        
        c.add(nullLabel,BorderLayout.WEST);
        
        nullLabel = new JLabel();        
        c.add(nullLabel,BorderLayout.SOUTH);
    
        outputPanel = new JPanel();
        outputPanel.setLayout(new GridLayout(3,1));
        
        outputPanel.setBackground(Color.white);
        c.add(outputPanel,BorderLayout.CENTER);
        
    
  label=new JLabel("Result of voting");
  label.setOpaque(true);
  label.setFont(new Font("SansSerif", Font.BOLD, 20));
  label.setBackground(Color.white);  
  label.setHorizontalAlignment(JLabel.CENTER);
  outputPanel.add(label); 
  
   innerpanel1 =new JPanel();
   innerpanel1.setLayout(new GridLayout(1,3));
   innerpanel1.setBackground(Color.white);
   outputPanel.add(innerpanel1);
   
   
  label1=new JLabel();
  label1.setOpaque(true); 
  label1.setIcon(new ImageIcon("G:/output.jpg"));
  label1.setBackground(Color.white);
  innerpanel1.add(label1);
  
  
  label2=new JLabel();
  label2.setOpaque(true);  
  label2.setIcon(new ImageIcon("G:/output1.jpg"));
  label2.setBackground(Color.white); 
  innerpanel1.add(label2);
  
  label3=new JLabel();
  label3.setOpaque(true);
  label3.setIcon(new ImageIcon("G:/output2.jpg"));
  label3.setBackground(Color.white);
  innerpanel1.add(label3);
  
  JPanel innerpanel2=new JPanel();
  innerpanel2.setLayout(new GridLayout(3,6));
  innerpanel2.setBackground(Color.white);
  outputPanel.add(innerpanel2);
  
  
  button1=new JTextArea();
  button1.setEditable(false);
  button1.setOpaque(true);
  button1.setText(str1);
  button1.setFont(new Font("Arial",Font.BOLD,24));
  button1.setForeground(Color.red);
  button1.setBackground(Color.yellow);
  innerpanel2.add(button1);
  
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  
  button2=new JTextArea();
  button2.setEditable(false);
  button2.setOpaque(true);
  button2.setFont(new Font("Arial",Font.BOLD,24));
  button2.setForeground(Color.red);
  button2.setBackground(Color.yellow);
  button2.setText(str2);
  innerpanel2.add(button2);
  
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  
  
  button3=new JTextArea();
  button3.setEditable(false);
  button3.setOpaque(true);
  button3.setText(str3);
  button3.setFont(new Font("Arial",Font.BOLD,24));
  button3.setForeground(Color.red);
  button3.setBackground(Color.yellow);
  innerpanel2.add(button3);
  
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  nullLabel=new JLabel();
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);

  
  
  button=new JButton("back");
  button.setOpaque(true);
  button.setForeground(Color.yellow);
  button.setBackground(Color.blue);
  button.setFont(f);
  innerpanel2.add(button);
    
 button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        dispose();   
        
        File Voting_info= new File("E:\\voting_info.txt");
        Voting_info.delete();
        
        File folder= new File("E:\\webcame images");
        for (File file: folder.listFiles()) 
          {
             file.delete();         
          }
        folder.delete();
        
        File image_number_file= new File("E:\\web_image_number.txt");
        image_number_file.delete();
        
        File newfile= new File("E:\\file1.txt");
        newfile.delete();
        
        File newfile2= new File("E:\\file2.txt");
        newfile2.delete();
        
        File newfile3= new File("E:\\file3.txt");
        newfile3.delete();
        
        
                Admin_panel frame2=new Admin_panel();
                 frame2.setVisible(true);
                 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame2.setSize(700,500);
                 frame2.setLocationRelativeTo(null);
                 frame2.setTitle("Admin Panel");
 

            }
        });
    
    }
    
   
    
 
 
  
}

