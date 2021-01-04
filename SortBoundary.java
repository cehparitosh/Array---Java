import java.util.*;
class SortBoundary
{
    int A[][], B[], m, n; 
    static int sum=0;
 
    void input() //Function for taking all the necessary inputs
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix : ");
        m=sc.nextInt();
        if(m<4 || m>10)
        {
            System.out.println("Invalid Range");
            System.exit(0);
        }
        else
        {
            A = new int[m][m];
            n = m*m;
            B = new int[n]; // 1-D Array to store Boundary Elements
 
            System.out.println("Enter the elements of the Matrix : ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print("Enter a value : ");
                    A[i][j]=sc.nextInt();
                }
            }
        }
    }
 
    /* The below function is used to store Boundary elements 
     * from array A[][] to array B[] 
     */
    void convert()
    {
        int x=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i == 0 || j == 0 || i == m-1 || j == m-1) // Condition for boundary elements
                {
                    B[x] = A[i][j];
                    x++;
                    sum = sum + A[i][j]; // Finding sum of boundary elements
                }
            }
        }
    }
 
    void sortArray() //Function for sorting Boundary elements stored in array B[]
    {
        int c = 0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(B[i]<B[j]) // for ascending use B[i]>B[j]
                {
                    c = B[i];
                    B[i] = B[j];
                    B[j] = c;
                }
            }
        }
    }
     
    /* Function fillSpiral is filling the boundary of 2-D array in spiral
     * way from the elements of 1-D array
     */
    void fillSpiral()
    {
        int R1=0, R2=m-1, C1=0, C2=m-1, x=0;
 
        for(int i=C1;i<=C2;i++) // accessing the top row
        {
            A[R1][i]=B[x++];
        }
        for(int i =R1+1;i<=R2;i++) // accessing the right column
        {
            A[i][C2]=B[x++];
        }
        for(int i =C2-1;i>=C1;i--) // accessing the bottom row
        {
            A[R2][i]=B[x++];
        }
        for(int i =R2-1;i>=R1+1;i--) // accessing the left column
        {
            A[i][C1]=B[x++];
        }
    }
 
    void printArray() //Function for printing the array A[][]
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }
 
    public static void main(String args[])
    {
        SortBoundary ob = new SortBoundary();
        ob.input();
        System.out.println("*********************");
        System.out.println("The original matrix:");
        System.out.println("*********************");
        ob.printArray(); //Printing the original array
        ob.convert(); //Storing Boundary elements to a 1-D array
        ob.sortArray(); //Sorting the 1-D array (i.e. Boundary Elements)
        ob.fillSpiral(); //Storing the sorted Boundary elements back to original 2-D array
 
        System.out.println("*********************");
        System.out.println("The Rearranged matrix:");
        System.out.println("*********************");
        ob.printArray(); //Printing the rearranged array
        System.out.println("*********************");
        System.out.println("The sum of boundary elements is = "+sum); //Printing the sum of boundary elements
    }
}