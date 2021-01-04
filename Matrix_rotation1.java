import java.util.*;
class Matrix_rotation1
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int m=sc.nextInt();
  
        if(m<3 || m>9)
            System.out.println("Size Out Of Range");
        else
        {
            int A[][]=new int[m][m];
  
            /* Inputting the matrix */
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print("Enter an element : ");
                    A[i][j]=sc.nextInt();
                }
            }
            /* Printing the original matrix */
            System.out.println("*************************"); 
            System.out.println("ORIGINAL MATRIX");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
             
            /* Rotation of begins here */
            System.out.println("*************************"); 
            System.out.println("MATRIX AFTER ROTATION");
            for(int i=0;i<m;i++)
            {
                for(int j=m-1;j>=0;j--)
                {
                    System.out.print(A[j][i]+"\t");
                }
                System.out.println();
            }
             
            int sum = A[0][0]+A[0][m-1]+A[m-1][0]+A[m-1][m-1]; // Finding sum of corner elements
            System.out.println("Sum of the corner elements = "+sum);
        }
    }
}