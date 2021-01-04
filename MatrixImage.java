import java.util.*;

class MatrixImage

{
          int a[ ][ ];
          int i, j, m;
          Scanner ob=new Scanner(System.in);
          public void show( )
          {
                    System.out.println("Enter size of an Array from 2 to 20 ");
                    m=ob.nextInt( );
                    if(m>1 && m<=20)
                    {
                              a=new int[m][m];
                              for(i=0;i<m;i++)
                                 {
                                    for(j=0;j<m;j++)
                                        {
                                            System.out.print("Enter value for a[i][j] ");
                                            a[i][j]=ob.nextInt( );
                                        }
                                  }
                              System.out.println("Original Matrix is ");
                              System.out.println( );
                              for(i=0;i<m;i++)
                                 {
                                    for(j=0;j<m;j++)
                                            System.out.print(a[i][j]+"   ");
                                    System.out.println( );
                                  }
                             System.out.println( );
                             System.out.println("Image Matrix is ");
                             System.out.println( );
                             for(i=0;i<m;i++)
                                 {
                                    for(j=m-1;j>=0;j--)
                                        System.out.print(a[i][j]+"   ");
                                    System.out.println( );
                                 }
                      }
                    else System.out.println("SIZE OUT OFF RANGE");
          }
          public static void main(String arg[])
          {
                    MatrixImage obj = new MatrixImage( );
                    obj.show();
          }
}