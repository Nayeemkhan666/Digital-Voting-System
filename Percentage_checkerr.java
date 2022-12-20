
package Spl_project;


public class Percentage_checkerr 
{
    public int  percentage_checking(int[][]mat1,int[][]mat2)
    {
       
        int count=0;
        for(int i=0;i<250;i++)
        {
          for(int j=0;j<250;j++)
          {
              if(mat1[i][j] == mat2[i][j])
              {
                  count=count+1;
              }
             
          }
   
        }
        
       
      return count;  
    }
    
}
