import java.util.*;
class DiagonalM
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int m=sc.nextInt();
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
  
        /* Printing the matrix */
        System.out.println("*************************");
        System.out.println("The Matrix is : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("*************************");
  
        int p=0, q=0;
          
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i!=j && A[i][j]!=0) // Checking non-diagonal elements
                {
                    p=1;
                    break;
                }
                if(i==j && A[i][j]==0) // Checking diagonal elements
                {
                    q++;
                }
            }
        }
          
        if(p==0 && q<m)
            System.out.println("The matrix is Diagonal");
        else
            System.out.println("The matrix is not Diagonal");
    }
}