import java.util.*;
class MatrixAdd
{
   public static void main(String args[])
   {
       
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the array1 row size : ");
         int r1 = in.nextInt();
         System.out.println("Enter the array1 column size : ");
         int c1 = in.nextInt();
         System.out.println("Enter the array2 row size : ");
         int r2 = in.nextInt();
         System.out.println("Enter the array2 column size : ");
         int c2 = in.nextInt();
         if(r1==r2 &&c1==c2)
        {
            int a[][] = new int[10][10];
            int b[][] = new int[10][10];
            int c[][] = new int[10][10];

             System.out.println("Array1 Elements :");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                   a[i][j] = in.nextInt();
                }
             }
        
             System.out.println("Array2 Elements :");
            for(int i=0;i<r2;i++)
            {
               for(int j=0;j<c2;j++)
               {
                   b[i][j] = in.nextInt();
                }
              }
             System.out.println("Matrix 1  : ");
             for(int i=0;i<r1;i++)
             {
                 for(int j=0;j<c1;j++)
                 {
                     System.out.print("\t"+a[i][j]+" ");
                 }
                 System.out.println(" ");
             }  

              System.out.println("Matrix 2  : ");
              for(int i=0;i<r2;i++)
              {
                  for(int j=0;j<c2;j++)
                  {
                      System.out.print("\t"+a[i][j]+" ");
                   }
                   System.out.println(" ");
               } 
        
            for(int i=0;i<r1;i++)
            {
                for(int  j=0;j<c1;j++)
                {
                     c[i][j] = a[i][j] + b[i][j];
                }
            }
    
          System.out.println("Sum of two Matrix : ");
         for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print("\t"+c[i][j]+" ");
            }
            System.out.println(" ");
        }  
    }
     else 
       {
               System.out.println("Not possible! as matrix roW and column are not same!");
       } 
      
         
    }
}