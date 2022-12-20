
package Spl_project;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Admin_panel extends JFrame{
    Container c;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,nullLabel;
    JTextField textbox1,textbox2,textbox3,textbox4,textbox5;
    JPanel outputPanel,innerpanel;
    Font f,f2,f3;
    String str1,str2,str3,str4,str5,str6="G:\\output.jpg",str7="G:\\output1.jpg",str8="G:\\output2.jpg";
    int test_number=0;
    public  Admin_panel(){
    components();
    
    }
    
    public void components(){
    c=this.getContentPane();
    c.setBackground(Color.white);
    c.setLayout(new BorderLayout(150,45));
     nullLabel = new JLabel();
        
        c.add(nullLabel,BorderLayout.EAST);
        
        JLabel nullLabel = new JLabel();
        
        c.add(nullLabel,BorderLayout.WEST);
        
        nullLabel = new JLabel("Hello Election Commissioner");
        nullLabel.setFont(new Font("Arial",Font.BOLD,25));
        nullLabel.setHorizontalAlignment(JLabel.CENTER);
        nullLabel.setVerticalAlignment(JLabel.BOTTOM);
        c.add(nullLabel,BorderLayout.NORTH);
        nullLabel = new JLabel();
        c.add(nullLabel,BorderLayout.SOUTH);
        
        outputPanel = new JPanel();
        outputPanel.setLayout(new GridLayout(9,2,6,6));
        
        
        outputPanel.setBackground(Color.white);
        c.add(outputPanel,BorderLayout.CENTER);
    
    
    ImageIcon icon1=new ImageIcon(getClass().getResource("icon1.png"));
    this.setIconImage(icon1.getImage());
    f=new Font("Arial", Font.BOLD, 18);
    f2=new Font("Arial", Font.BOLD, 15);
    f3=new Font("Arial", Font.BOLD, 15);
    





 



 

 label3=new JLabel("Image folder location : ");;
 label3.setOpaque(true);
label3.setFont(f2);
//label3.setHorizontalAlignment(JLabel.CENTER);
label3.setBackground(Color.white);
label3.setForeground(Color.black);
outputPanel.add(label3);

textbox1=new JTextField();//textbox1.setBackground(Color.yellow);
textbox1.setForeground(Color.black);
textbox1.setBorder(BorderFactory.createLineBorder(Color.black));
outputPanel.add(textbox1);


 label4=new JLabel("Password : ");;
label4.setOpaque(true);
label4.setFont(f2);
//label4.setHorizontalAlignment(JLabel.CENTER);
label4.setBackground(Color.white);
label4.setForeground(Color.black);
outputPanel.add(label4);

 


JPasswordField textbox2=new JPasswordField();
textbox2.setBackground(Color.white);
textbox2.setForeground(Color.black);
textbox2.setBorder(BorderFactory.createLineBorder(Color.black));
outputPanel.add(textbox2);


nullLabel=new JLabel();
outputPanel.add(nullLabel);

nullLabel=new JLabel();
outputPanel.add(nullLabel);

nullLabel=new JLabel("Location of photos");
nullLabel.setFont(new Font("Arial",Font.BOLD,20));
outputPanel.add(nullLabel);

nullLabel=new JLabel();
outputPanel.add(nullLabel);

label5=new JLabel("Candidate 1:");
label5.setFont(f2);
label5.setOpaque(true);
//label4.setHorizontalAlignment(JLabel.CENTER);
label5.setBackground(Color.white);
label5.setForeground(Color.black);


outputPanel.add(label5);


textbox3=new JTextField();
textbox3.setBackground(Color.white);

textbox3.setForeground(Color.black);
textbox3.setBorder(BorderFactory.createLineBorder(Color.black));
outputPanel.add(textbox3);

label5=new JLabel("Candidate 2:");
label5.setOpaque(true);
label5.setFont(f2);

label5.setBackground(Color.white);
label5.setForeground(Color.black);


outputPanel.add(label5);

textbox4=new JTextField();
textbox4.setBackground(Color.white);

textbox4.setForeground(Color.black);
textbox4.setBorder(BorderFactory.createLineBorder(Color.black));
outputPanel.add(textbox4);

label5=new JLabel("Candidate 3:");
label5.setOpaque(true);
label5.setFont(f2);

label5.setBackground(Color.white);
label5.setForeground(Color.black);


outputPanel.add(label5);


textbox5=new JTextField();
textbox5.setBackground(Color.white);

textbox5.setForeground(Color.black);
textbox5.setBorder(BorderFactory.createLineBorder(Color.black));
outputPanel.add(textbox5);

nullLabel = new JLabel();
nullLabel.setOpaque(true);
nullLabel.setBackground(Color.white);
outputPanel.add(nullLabel);

nullLabel = new JLabel();
nullLabel.setOpaque(true);
nullLabel.setBackground(Color.white);
outputPanel.add(nullLabel);

    
        
        




nullLabel = new JLabel();
nullLabel.setOpaque(true);
nullLabel.setBackground(Color.white);
outputPanel.add(nullLabel);


innerpanel = new JPanel();
innerpanel.setLayout(new GridLayout(1,3));
innerpanel.setBackground(Color.white);
outputPanel.add(innerpanel); 

nullLabel = new JLabel();
nullLabel.setOpaque(true);
nullLabel.setBackground(Color.white);
innerpanel.add(nullLabel);



JButton button=new JButton("NEXT");
button.setForeground(Color.YELLOW);
button.setBackground(Color.blue);
innerpanel.add(button);

//file keeping the image file location and password
try
{
    File Voting_info= new File("E:\\voting_info.txt");
    if(!Voting_info.createNewFile())
    {
        Voting_info.delete();
        Voting_info.createNewFile();
    }
    else
    {
        Voting_info.createNewFile();
    }
    
    
}
catch(Exception e)
{
    System.out.println("An error is occured.");
}
// file keeping the number of webacme image
try
{
    File image_number_file= new File("E:\\web_image_number.txt");
    if(!image_number_file.createNewFile())
    {
        image_number_file.delete();
        image_number_file.createNewFile();
    }
    else
    {
        image_number_file.createNewFile();
    }
    //writing the 1st number 
    
    
    
    
}
catch(Exception e)
{
    System.out.println("An error is occured.");
}

//Checking the webcame image folder
try{
File folder= new File("E:\\webcame images");
     if(!folder.isDirectory())
     {
         folder.mkdir();
     }
     else
     {
         for (File file: folder.listFiles()) 
          {
             file.delete();         
          }
     }
             
}
catch(Exception e){
        System.out.println("An error is occured.");
       
        }
//Checking the face_recognition test image folder
try{
File folder2= new File("E:\\Face recognition test");
     if(!folder2.isDirectory())
     {
         folder2.mkdir();
     }
     else
     {
         for (File file: folder2.listFiles()) 
          {
             file.delete();         
          }
     }
             
}
catch(Exception e){
        System.out.println("An error is occured.");
       
        }


//deleting vote_end file    
File Vote_End= new File("E:\\Vote_End.txt");
     
    if(Vote_End.isFile())
    {
        Vote_End.delete();
    }  
    
    //deleting vote_start file    
File Vote_Start= new File("E:\\Vote_start.txt");
     
    if(Vote_Start.isFile())
    {
        Vote_Start.delete();
    }  


//file of votes of candidate 1
try{
File newfile= new File("E:\\file1.txt");
if(!newfile.createNewFile())
 { 
     newfile.delete();
newfile.createNewFile();        }
else
{
newfile.createNewFile();}
}
catch(IOException e){
        System.out.println("An error is occured.");
       
        }
//file of votes of candidate 2
try{
File newfile2= new File("E:\\file2.txt");
if(!newfile2.createNewFile())
 { 
     newfile2.delete();
newfile2.createNewFile();        }
else
{
newfile2.createNewFile();}
}
catch(IOException e){
        System.out.println("An error is occured.");
        }
//file of votes of candidate 2
try{
File newfile3= new File("E:\\file3.txt");
if(!newfile3.createNewFile())
 { 
     newfile3.delete();
newfile3.createNewFile();        }
else
{
newfile3.createNewFile();}
}
catch(IOException e){
        System.out.println("An error is occured.");
        }

button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
   test_number=0;        
   str1=textbox1.getText();
   str2=textbox2.getText();
   str3=textbox3.getText();
   str4=textbox4.getText();
   str5=textbox5.getText();
   
   
   if(!" ".equals(str1) && !"".equals(str2) && !"".equals(str3) && !"".equals(str4) && !"".equals(str5) ){
  
   int scaledWidth =100;int scaledHeight=100;
   
    File folder_of_voter_photo=new File(str1);
        if(folder_of_voter_photo.isDirectory())
        {
            test_number++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "folder location is not right", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        
     
   try{   
      File input_file=new File(str3);
      BufferedImage image= ImageIO.read(input_file);
      test_number++;
       BufferedImage outputImage = new BufferedImage(scaledWidth,
                scaledHeight, image.getType());
 
        // scales the input image to the output image
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(image, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();
 
        // extracts extension of output file
        String formatName = str6.substring(str6
                .lastIndexOf(".") + 1);
 
        // writes to output file
        ImageIO.write(outputImage, formatName, new File(str6));
   
      }
      
   catch(IOException ex){JOptionPane.showMessageDialog(null, "Give the address of photo of candidte 1 rightly", "Error", JOptionPane.ERROR_MESSAGE);}
   
   try{      
       File input_file2=new File(str4); 
       BufferedImage image1= ImageIO.read(input_file2); 
       test_number++;
       BufferedImage outputImage1 = new BufferedImage(scaledWidth,
                scaledHeight, image1.getType());
 
        // scales the input image to the output image
        Graphics2D g2d = outputImage1.createGraphics();
        g2d.drawImage(image1, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();
 
        // extracts extension of output file
        String formatName = str7.substring(str7
                .lastIndexOf(".") + 1);
 
        // writes to output file
        ImageIO.write(outputImage1, formatName, new File(str7));
       
      }
   
   catch(IOException ex){JOptionPane.showMessageDialog(null, "Give the address of photo of candidte 2 rightly", "Error", JOptionPane.ERROR_MESSAGE);}
   
    try{          
        File input_file3=new File(str5);
        BufferedImage image2= ImageIO.read(input_file3);
        test_number++;
        BufferedImage outputImage2 = new BufferedImage(scaledWidth,
                scaledHeight, image2.getType());
 
        // scales the input image to the output image
        Graphics2D g2d = outputImage2.createGraphics();
        g2d.drawImage(image2, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();
 
        // extracts extension of output file
        String formatName = str8.substring(str8
                .lastIndexOf(".") + 1);
 
        // writes to output file
        ImageIO.write(outputImage2, formatName, new File(str8));
       }
      
    catch(IOException ex){JOptionPane.showMessageDialog(null, "Give the address of photo of candidte 3 rightly", "Error", JOptionPane.ERROR_MESSAGE);}
   
    
    
    if( test_number == 4)
    {
       try
    {
        FileWriter newfile= new FileWriter("E:\\voting_info.txt");
        newfile.write(str1+"\n");
        newfile.write(str2);
        newfile.close();
    }
    catch (IOException ex) {
           
       }
       
       
       test_number=0;
       dispose();
       
        Starting_page frame=new Starting_page();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Starting Page"); 
    
   }
    str1=""; str2=""; str3=""; str4=""; str5="";
   }
   else JOptionPane.showMessageDialog(null, "Fill all the information box rightly", "Error", JOptionPane.ERROR_MESSAGE);
   }
            
        });
    }
    
    
    
}