
package Spl_project;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class User_panel extends JFrame{
    Container c;
    JPanel outputPanel,innerpanel1,innerpanel2;
    JLabel label1,label2,nullLabel,label3;
    Font f,f1;
    public User_panel(){
    components();
    }

  
    public void components(){
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
        outputPanel.setLayout(new GridLayout(6,1));
        
        outputPanel.setBackground(Color.white);
        c.add(outputPanel,BorderLayout.CENTER);
        
    ImageIcon icon1=new ImageIcon(getClass().getResource("icon1.png"));
    this.setIconImage(icon1.getImage());
     f=new Font("SansSerif", Font.BOLD, 18);
      f1=new Font("SansSerif", Font.BOLD, 14);
     
    label1=new JLabel("If you want to give vote then press ");
    label1.setOpaque(true);
    label1.setFont(f);
    label1.setHorizontalAlignment(JLabel.CENTER);
    label1.setBackground(Color.white);
    label1.setForeground(Color.black);    
    outputPanel.add(label1);

    
    
 label2=new JLabel("The following button ");
   
label2.setOpaque(true);
label2.setFont(f);
label2.setHorizontalAlignment(JLabel.CENTER);
label2.setBackground(Color.white);
label2.setForeground(Color.black);

outputPanel.add(label2);

    innerpanel1=new JPanel();
    innerpanel1.setLayout(new GridLayout(1,3));
    innerpanel1.setBackground(Color.white);
    outputPanel.add(innerpanel1);
  nullLabel = new JLabel();
  nullLabel.setBackground(Color.white);
  innerpanel1.add(nullLabel);
 

JButton button=new JButton("Vote");
button.setForeground(Color.YELLOW);
button.setBackground(Color.blue);
button.setFont(f1);
innerpanel1.add(button);

  nullLabel = new JLabel();
  nullLabel.setBackground(Color.white);
  innerpanel1.add(nullLabel);
  
  nullLabel = new JLabel();
  outputPanel.add(nullLabel);
  
  nullLabel = new JLabel();
  outputPanel.add(nullLabel);
  
  nullLabel = new JLabel();
  outputPanel.add(nullLabel);
  

  
 button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
     File newfile3= new File("E:\\Vote_start.txt");
     File newfile4= new File("E:\\Vote_End.txt");
       if(newfile4.isFile())
       {
           dispose();
           JOptionPane.showMessageDialog(null, "Voting is ended", "Error", JOptionPane.ERROR_MESSAGE);
           
       }
       else{
           
       
          if(newfile3.isFile()){
          dispose();
     
          Voter_panel frame=new Voter_panel(); 
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(700,500);
          frame.setLocationRelativeTo(null);
          frame.setTitle("Voter panel");}
     
          else
          {
         JOptionPane.showMessageDialog(null, "Voting is not started", "Error", JOptionPane.ERROR_MESSAGE);
          }
       }
             
 

            }
        });
 
 
 
    }
    
            
  
}
