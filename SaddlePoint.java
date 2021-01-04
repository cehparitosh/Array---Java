import java.util.*;
class SaddlePoint
{
   public static void main()
   {
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter the order of the matrix : ");
       int n=sc.nextInt();
       int A[][]=new int[n][n];
       System.out.println("Inputting the elements in the matrix");
       System.out.println("******************************");
       for(int i=0;i<n;i++)
       {
         for(int j=0;j<n;j++)
         {
             System.out.print("Enter Element at ["+i+"]["+j+"] : ");
             A[i][j]=sc.nextInt();
         }
       }
         
       /* Printing the Original Matrix */
       System.out.println("******************************");
       System.out.println("The Original Matrix is");
       for(int i=0;i<n;i++)
       {
         for(int j=0;j<n;j++)
         {
             System.out.print(A[i][j]+"\t");
         }
         System.out.println();
       }
        
        
       int max, min, x, f=0;
       for(int i=0;i<n;i++)
       {
           /* Finding the minimum element of a row */
           min = A[i][0]; // Initializing min with first element of every row
           x = 0;
           for(int j=0;j<n;j++)
           {
                if(A[i][j]<min)
                {
                    min = A[i][j];
                    x = j; // Saving the column position of the minimum element of the row
                }
           }
             
           /* Finding the maximum element in the column 
            * corresponding to the minimum element of row */
           max = A[0][x]; // Initializing max with first element of that column
           for(int k=0;k<n;k++)
           {
                if(A[k][x]>max)
                {
                    max = A[k][x];
                }
           }
             
            /* If the minimum of a row is same as maximum of the corresponding column,
               then, we have that element as the Saddle point */
           if(max==min)
           {
               System.out.println("********************");
               System.out.println("Saddle point = "+max);
               System.out.println("********************");
               f=1;
           }
       }
         
       if(f==0)
       {
           System.out.println("********************");
           System.out.println("No saddle point");
           System.out.println("********************");
       }
   }
}