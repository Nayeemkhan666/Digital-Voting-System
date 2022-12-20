
package Spl_project;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Voter_panel extends JFrame{
    
    Container c;
    JPanel outputPanel,innerpanel1;
    JLabel label,label1,label2,label3,nullLabel;
    JButton button1,button2,button3,button4;
    int votes_of_first,votes_of_Second,votes_of_Third;
    // String specific_line_text1,specific_line_text2,specific_line_text3,specific_line_text4,specific_line_text5,specific_line_text6;
    String str1,str2,str3;
    
     public Voter_panel(){
     components();
    }
    public void components(){
    c=this.getContentPane();
    c.setBackground(Color.white);
    c.setLayout(new BorderLayout(50,100));
    
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
    
    Font f=new Font("SansSerif", Font.BOLD, 18);
    
     
    ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
    this.setIconImage(icon1.getImage());
    

   
 
  label=new JLabel("Candidates of voting");
  label.setOpaque(true);
  label.setFont(new Font("SansSerif", Font.BOLD, 20));
  label.setBackground(Color.white);
  //label.setForeground(Color.black); 
  
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
  
  
  
  button1=new JButton(" vote");
  button1.setOpaque(true); 
  innerpanel2.add(button1);
  
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  
  button2=new JButton(" vote");
  button2.setOpaque(true);  
  innerpanel2.add(button2);
  
  
  nullLabel=new JLabel();
  innerpanel2.add(nullLabel);
  
  button3=new JButton("vote");
  button3.setOpaque(true);
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
  
  button4=new JButton("back");
  button4.setOpaque(true);
  button4.setEnabled(false);
  button4.setForeground(Color.yellow);
  button4.setBackground(Color.blue);
  innerpanel2.add(button4);
  
  
   
   
  button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
             button1.setEnabled(false);
              button2.setEnabled(false);
             button3.setEnabled(false);
              button4.setEnabled(true);
              
            
         
          try{
                    
         Writer output;
         output = new BufferedWriter(new FileWriter("E:\\file1.txt", true));
         output.append("1\n");
         output.close();
          
           
          }
              
          catch(IOException ex){}
           }
               

    
            
        });
  
   button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
         
             button1.setEnabled(false);
             button2.setEnabled(false);
             button3.setEnabled(false);
             button4.setEnabled(true);
                  try{
          
               Writer output;
         output = new BufferedWriter(new FileWriter("E:\\file2.txt", true));
         output.append("1\n");
         output.close();
          }
              
          catch(IOException ex){}
           
            }
        });
   
    button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           
             button1.setEnabled(false);
             button2.setEnabled(false);
             button3.setEnabled(false);
             button4.setEnabled(true);
               try{
          
            Writer output;
         output = new BufferedWriter(new FileWriter("E:\\file3.txt", true));
         output.append("1\n");
         output.close();
          }
              
          catch(IOException ex){}
           
            }
           
        });
    
    button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
            dispose();
        User_panel frame=new User_panel();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(700,500);
       frame.setLocationRelativeTo(null);
       frame.setTitle("User panel");
             
            }
        });}
    
 
      
    
}
