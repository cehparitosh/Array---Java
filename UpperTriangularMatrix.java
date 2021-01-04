import java.util.*;
class UpperTriangularMatrix
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
        // printing the matrix 
        System.out.println("*************************"); 
        System.out.println("The Matrix Is : "); 
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("*************************"); 
        //Checking for upper triangular matrix
        int p=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(A[i][j]!=0) //all elements below main diagonal must be zero if not then we stop
                {
                    p = 1;
                    break; 
                }
            }
        }
 
        if(p == 0)
        {
            System.out.println("The Matrix is Upper Triangular");
        }
        else
        {
            System.out.println("The Matrix is NOT Upper Triangular");
        }
    }
}