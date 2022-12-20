
package Spl_project;

import javax.swing.JFrame;


public class Main {
public static void main(String[]args) throws InterruptedException
   {
       
        
   Welcome_Page frame=new Welcome_Page();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Welcome Page");
         for(int i=0;i<50;i++)
         {
             Thread.sleep(50);
             if(i==49)
             {
                 frame.dispose();
                 Admin_panel frame2=new Admin_panel();
   
                 frame2.setVisible(true);
                 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame2.setSize(700,500);
                 frame2.setLocationRelativeTo(null);
                 frame2.setTitle("Admin Panel");
             }
                
    
    


             
             
         }
        
        
        
             }
                
    
    


             
             
         }
        
        
   
   
    

 