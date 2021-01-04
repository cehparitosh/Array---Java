import java.util.*;
    class SymmetricMatrix
    {
          int a[ ][ ];
          int b[ ][ ];
          int i, j, m, s, ld, rd;
          Scanner ob=new Scanner(System.in);
          public void show( )
          {
                      System.out.println("Enter size of an Array from 2 to 20 ");
                      m=ob.nextInt( );
                      if(m>1 && m<=10)
                      {
                                  a=new int[m][m];
                                  b=new int[m][m];
                                  for(i=0;i<m;i++)
                                     {
                                          for(j=0;j<m;j++)
                                              {
                                                      System.out.print("Enter value for a[i][j] ");
                                                      a[i][j]=ob.nextInt();
                                                 }
                                    }
                                  for(i=0;i<m;i++)
                                     {
                                          for(j=0;j<m;j++)
                                              {
                                                      b[i][j]=a[j][i];
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
                                 s=0;
                                  for(i=0;i<m;i++)
                                     {
                                          for(j=0;j<m;j++)
                                              if(a[i][j]!=b[i][j]) s++;
                                       }
                                 if(s==0) System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
                                     else System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");
                                 ld=0;
                                 rd=0;
                                 for(i=0;i<m;i++)
                                     {
                                          for(j=0;j<m;j++)
                                              {         
                                                    if(i==j) ld=ld+a[i][j];
                                                    if(i+j==m-1) rd=rd+a[i][j];
                                                  }
                                     }
                                 System.out.println("The sum of the left diagonal = " + ld);
                                 System.out.println("The sum of the right diagonal = " + rd);
                         }
                      else System.out.println("MATRIX SIZE IS OUT OFF RANGE");
          }
          public static void main(String arg[ ])
          {
                      SymmetricMatrix obj = new SymmetricMatrix();
                      obj.show( );
          }
      }