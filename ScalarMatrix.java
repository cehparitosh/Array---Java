import java.util.*;
class Scalarmatrix
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
          
        int p = 0, q = 0, x = A[0][0]; // 'x' is storing the 1st main diagonal element
          
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                /* Checking that the matrix is diagonal or not */
                if(i!=j && A[i][j]!=0) // All non-diagonal elements must be zero
                {
                    p=1;
                    break;
                }
                /* Checking the matrix for scalarity */
                // All main diagonal elements must be equal to 'x' and non-zero
                if(i==j && (A[i][j]==0 || A[i][j]!=x)) 
                {
                    q=1;
                    break;
                }
            }
        }
          
        if(p==0 && q==0)
            System.out.println("The matrix is scalar");
        else
            System.out.println("The matrix is not scalar");
    }
}