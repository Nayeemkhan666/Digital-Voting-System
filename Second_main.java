/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spl_project;

import java.io.File;
import javax.swing.JFrame;

public class Second_main 
{
    public static void main(String[]args)
    {
       User_panel frame=new User_panel();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(700,500);
       frame.setLocationRelativeTo(null);
       frame.setTitle("User panel");
       
        
    }
    
}
