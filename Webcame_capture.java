/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spl_project;

import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javax.imageio.ImageIO;


public class Webcame_capture {
    public  void web() throws IOException{
    Webcam webcame=Webcam.getDefault();
    webcame.setViewSize(new Dimension(640,480));
    webcame.open();
    BufferedImage Image=webcame.getImage();
    int number=0;
    try (BufferedReader br = new BufferedReader(new FileReader("E:\\web_image_number.txt"))) {
			
                        Writer output;
                        output = new BufferedWriter(new FileWriter("E:\\web_image_number.txt", true));
                        output.append("1\n");
                        output.close();
                        
			while (( br.readLine()) != null) {
				number=number+1;
			}
                        number+=10000;
                        
                         String str="image"+number +".jpg";
                         ImageIO.write(Image, "JPG",new File("E:\\webcame images\\"+str));
                         webcame.close();
		} 
                 catch (IOException e) {
			e.printStackTrace();
                 }
    
   
    
    
    
    
    }
}
