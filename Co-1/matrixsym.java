import java.util.*;
public class matrixsym
{
  public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows of the Matrix : ");
       int row = in.nextInt();
       System.out.println("Enter the number of columns of the Matrix : ");
       int col = in.nextInt();
       int matrix[][] = new int[row][col];
       int i,j;
       boolean state = true;
        for(i=0;i<row;i++)
         {
            for(j=0;j<col;j++)
            {
                System.out.println("Enter the Element at M("+i+","+j+")");
                matrix[i][j] = in.nextInt();
             }
        }
        for(i=0;i<row;i++)
        {
           for(j=0;j<col;j++)
           {
               if(matrix[i][j] != matrix[j][i])
               {
                     state=false;
                      break;
               }
          }
       }
       if(state)
       {
           System.out.println("Matrix is Symmetric");
        }
        else
        {
             System.out.println("Matrix is  AntiSymmetric");
        }
   }
}    
        