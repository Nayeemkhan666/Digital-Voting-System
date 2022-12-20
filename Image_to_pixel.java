
 package Spl_project;


import java.awt.image.BufferedImage;

import java.awt.image.DataBufferByte;

import java.io.File;

import java.io.IOException;

import javax.imageio.ImageIO;




public class Image_to_pixel {
    
    public static int get_pixel(int [][]img,int center,int x,int y){
    int value=0;
    try{if(img[x][y]>=center) value=1;}
    catch (Exception e){value=0;}
    return value;
    
    }
    
    
    public static int lbp_pixel(int [][]img,int x,int y)
    {
        int center=img[x][y];
        int []value_array=new int[8];
        value_array[0]=get_pixel(img,center,x-1,y-1);
        value_array[1]=get_pixel(img,center,x-1,y);
        value_array[2]=get_pixel(img,center,x-1,y+1);
        value_array[3]=get_pixel(img,center,x,y+1);
        value_array[4]=get_pixel(img,center,x+1,y+1);
        value_array[5]=get_pixel(img,center,x+1,y);
        value_array[6]=get_pixel(img,center,x+1,y-1);
        value_array[7]=get_pixel(img,center,x,y-1);
        int power_value[]={128,64,32,16,8,4,2,1};
        int value=0;
        for(int i=0;i<8;i++)
        {
            value+=value_array[i]*power_value[i];
        }
        
        return value;
    }
    
     private static int[][] convertToArrayLocation(BufferedImage inputImage) {

 

              final byte[] pixels = ((DataBufferByte) inputImage.getRaster()

                           .getDataBuffer()).getData(); // get pixel value as single array from buffered Image

              final int width = inputImage.getWidth(); //get image width value

              final int height = inputImage.getHeight(); //get image height value

              int[][] result = new int[height][width]; //Initialize the array with height and width

 

              //this loop allocates pixels value to two dimensional array

              for (int pixel = 0, row = 0, col = 0; pixel < pixels.length; pixel++) {

                     int argb = 0;

                     argb = (int) pixels[pixel];

 

                     if (argb < 0) { //if pixel value is negative, changing it  to positive

                           argb += 256;

                     }

 

                     result[row][col] = argb;

                     col++;

                     if (col == width) {

                           col = 0;

                           row++;

                     }

              }

              return result; //return the result as two dimensional array

       }
     
     public static int[][] getpixel(BufferedImage inputImage)
    {
        
       final int width = inputImage.getWidth(); 

       final int height = inputImage.getHeight();
       
       int [] [] result=new int [width] [height] ;
       
           for(int i=0;i<width;i++)
           {
               for(int j=0;j<height;j++)
               {
                   result[i][j]=inputImage.getRGB(i, j) & 0xFF;
               }
           }
       return result;
    }
     
  public  int[][] Image_to_pixel_method() throws IOException {
           
    
          //load the image from this current folder
          BufferedImage inputImage = ImageIO.read(new File("E:\\Face recognition test\\image2.jpg")); 
               
          //pass buffered image to the method and get back the result
          int[][] result = convertToArrayLocation(inputImage); 
               

          // row and column number of output matrix after lbp 
          int i=result.length;
          int j=result[0].length;
              
           
            
              
              
           //  initializing output matrix with determined row and column 
           int [][]lbp_pixels_array=new int [i][j];
           
       
           // inserting lbp processed pixel values one by one in output matrix 
           for(int k=0;k<i;k++)
           {
              for(int l=0;l<j;l++)
               {
                  lbp_pixels_array[k][l]=lbp_pixel(result,k,l);
               }
           }
           
          
           
          
      return  lbp_pixels_array;  
    }   
  
  
  }
             
    

