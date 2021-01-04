import java.util.*;
class MatrixMultiplication
{
    void printMatrix(int P[][], int r, int c) // Funtion for printing an array
    {
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(P[i][j]+"\t");
            }
            System.out.println();
        }
    }
 
    public static void main(String args[]) 
    {     
        MatrixMultiplication ob = new MatrixMultiplication();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows for 1st array : "); //Inputting the rows of array A
        int r1=sc.nextInt();
        System.out.print("Enter no of columns for 1st array : "); //Inputting the columns of array A
        int c1=sc.nextInt();               
        System.out.print("Enter no of rows for 2nd array : "); //Inputting the rows of array B
        int r2=sc.nextInt();
        System.out.print("Enter no of columns for 2nd array : "); //Inputting the rows of array B
        int c2=sc.nextInt();
        if(c1 != r2)    //condition for multiplication to be possible
        {
            System.out.println("Matrix multiplication of the given order is not possible");
        }
 
        else
        {
 
            if(r1>0&&r2>0&&c1>0&&c2>0)
            {
                int A[][]=new int[r1][c1];
                int B[][]=new int[r2][c2];
                System.out.println("*************************");
                System.out.println("Inputting the 1st Matrix:"); //Accepting the values of array A
                System.out.println("*************************");
                for(int i=0;i<r1;i++)
                {
                    for(int j=0;j<c1;j++)
                    {
                        System.out.print("Enter any value : ");
                        A[i][j]=sc.nextInt();
                    }
                }
 
                System.out.println("*************************");
                System.out.println("Inputting the 2nd Matrix:"); //Accepting the values of array B
                System.out.println("*************************");
                for(int i=0;i<r2;i++)
                {
                    for(int j=0;j<c2;j++)
                    {
                        System.out.print("Enter any value : ");
                        B[i][j]=sc.nextInt();
                    }
                }
 
                //Matrix Multiplication begins here
                int C[][]=new int[r1][c2];
                int sum;
                for(int i=0;i<r1;i++)
                {
                    for(int j=0;j<c2;j++)
                    {
                        sum=0;
                        for(int k=0;k<c1;k++)
                        {
                            sum = sum + A[i][k]*B[k][j];
                        }
                        C[i][j] = sum;
                    }
                }
                //end of matrix multiplication
 
                System.out.println("*************************");
                System.out.println("The 1st Matrix is:"); //Printing the array A
                System.out.println("*************************");
                ob.printMatrix(A,r1,c1);
                System.out.println("*************************");
                System.out.println("The 2nd Matrix is:"); //Printing the array A
                System.out.println("*************************");
                ob.printMatrix(B,r2,c2);
                System.out.println("*************************");
                System.out.println("The Result of Multiplication is:"); //Printing the array A
                System.out.println("*************************");
                ob.printMatrix(C,r1,c2);
            }
            else
            {
                System.out.print("Enter positive no of rows and columns");
            }
        }
    }
}