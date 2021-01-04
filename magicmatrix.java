import java.io.*;
class magicmatrix
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader read =new InputStreamReader (System.in);
        BufferedReader x= new BufferedReader(read);
        System.out.println("Enter the size of the matrix");
        int n=Integer.parseInt(x.readLine());
        if(n>5)
        System.out.println("Enter the number from 1 to 5");
        else
        {
            int A[][]=new int[n][n];
            int i,j,k,t;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    A[i][j]=0;
                }
            }
            if(n%2!=0)
            {
                i=0;
                j=n/2;
                k=1;
                while(k<=n*n)
                {
                    A[i][j]=k++;
                    i--;
                    j++;
                    if(i<0&&j>n-1)
                    {
                        i=i+2;
                        j--;
                    }
                    if(i<0)
                    i=n-1;
                    if(j>n-1)
                    j=0;
                    if(A[i][j]>0)
                    {
                        i=i+2;
                        j--;
                    }
                }
            }
            else
            {
                k=1;
                for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        A[i][j]=k++;
                    }
                }
                j=n-1;
                for(i=0;i<n/2;i++)
                {
                    t=A[i][j];
                    A[i][i]=A[j][j];
                    A[j][j]=t;
                    t=A[i][j];
                    A[i][j]=A[j][i];
                    A[j][i]=t;
                    j--;
                }
            }
            System.out.println("The magic matrix of size "+n+"x"+n+" is:");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
          
            }
        
        }
    }
}