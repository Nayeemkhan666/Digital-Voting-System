
package Spl_project;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Image_load_in_java  {
    String s;
    int count=0;
    
     //String folder= Files.readAllLines(Paths.get("E:\\voting_info.txt")).get(1);
    
     
     static  File dir3 = new File("E:\\webcame images");
     
     // array of supported extensions (use a List if you prefer)
    static  String[] EXTENSIONS = new String[]{
        "gif", "png", "bmp" ,"jpg"// and other formats you need
    };
    // filter to identify images based on their extensions for supplied images
    static final FilenameFilter IMAGE_FILTER = new FilenameFilter() {

        @Override
        public boolean accept(final File dir, final String name) {
            for (final String ext : EXTENSIONS) {
                if (name.endsWith("." + ext)) {
                    return (true);
                }
            }
            return (false);
        }
    };
    // filter to identify images based on their extensions for webcame captured images
    static final FilenameFilter IMAGE_FILTER2 = new FilenameFilter() {

        @Override
        public boolean accept(final File dir3, final String name) {
            for (final String ext : EXTENSIONS) {
                if (name.endsWith("." + ext)) {
                    return (true);
                }
            }
            return (false);
        }
    };

 public int work() throws IOException  {
  
     // webcame
     Webcame_capture web= new Webcame_capture();
     web.web();
     //Reading the last captured image using  the webcame
     int size=0,count=0;
        if (dir3.isDirectory()) { // make sure it's a directory
            File [] listoffiles=dir3.listFiles(IMAGE_FILTER2);
            size=listoffiles.length;
            
            for (final File f : listoffiles) {
                BufferedImage img = null;
                count=count+1;
                try {
                    if(count == size) 
                            { img = ImageIO.read(f);
                             System.out.println(f.getName());
                             ImageIO.write(img, "jpg", new File("E:\\Face recognition test\\image.jpg"));
    
                            }
                 }
                catch (final IOException e) {
                    // handle errors here
                }
            }
        }
     
     //cropping of image
     try
     {
       Croppping_of_image crop=new Croppping_of_image();
       Histo_equi hist=new Histo_equi("E:\\Face recognition test\\image1.jpg");
     
     }
     
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, "Please give your image again", "Error", JOptionPane.ERROR_MESSAGE);
     }
     
     //Normalization of photo using histogram equilization
     
     //Conversion of image to pixel matrix
     Image_to_pixel pixel=new Image_to_pixel();
   
  
     int [][] mat1= pixel.Image_to_pixel_method();
     
   
   
   // cleaning the folder
    File dir2=new File("E:\\Face recognition test");
      
     for (File file: dir2.listFiles()) 
     {
          file.delete();
         
      }
     
       String folder=Files.readAllLines(Paths.get("E:\\voting_info.txt")).get(0);
       File dir = new File(folder);
     
        if (dir.isDirectory()) { // make sure it's a directory
            for (final File f : dir.listFiles(IMAGE_FILTER)) {
                BufferedImage img = null;
                

                try {
                   img = ImageIO.read(f);
                   System.out.println(f.getName());
                   ImageIO.write(img, "jpg", new File("E:\\Face recognition test\\image.jpg"));
                   Croppping_of_image crop2 =new Croppping_of_image(); 
                   Histo_equi hist2 =new Histo_equi("E:\\Face recognition test\\image1.jpg");
                   Image_to_pixel pixel2 = new Image_to_pixel();
                   int [][] mat2= pixel.Image_to_pixel_method();
                 
                   
                 
                    
                     for (File file: dir2.listFiles())
                     {
                             file.delete();
                     }
                     
                    Percentage_checkerr percentage =new Percentage_checkerr();
                    int matched_number=percentage.percentage_checking(mat1, mat2);
                    System.out.println(matched_number);
                    if(count<matched_number)
                    {
                        count=matched_number;
                    }
                    
                 
                   
                } 
                catch (final Exception e)
                {
                    // handle errors here
                }
            }
            
        }
      System.out.println(count);  
      return count;   
    }

    
}
