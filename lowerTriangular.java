import java.util.*;
class lowerTriangular
{
    void lowermat(int matrix[][],  
                      int row, int col) 
    { 
        int i, j; 
        for (i = 0; i < row; i++) 
        { 
            for (j = 0; j < col; j++) 
            { 
                if (i < j) 
                { 
                    System.out.print("0" + " "); 
                } 
                else
                System.out.print(matrix[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
      
 
   public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
       lowerTriangular lt=new lowerTriangular();
        int i,j,count=0,no,size,flag=0;
        System.out.println("Enter size");
        size =sc.nextInt();
        int a[][]=new int[size][size];

        for(i=0;i<size;i++)
        {
            for (j=0;j<size;j++)
            {
                System.out.println("Enter the element("+i+","+j+")");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The given matrix:");
        for(i=0;i<size;i++)
        {
            for (j=0;j<size;j++)
            {
                System.out.print(a[i][j]);
              
            }
            System.out.println();
        }
        System.out.println("Lower triangular matrix");
        lt.lowermat(a,size,size);
    }
}