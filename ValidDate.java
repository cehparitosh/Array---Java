import java.util.*;
class ValidDate
{
    public static void main(String arg[])
    {
    int a[ ]={31,28,31,30,31,30,31,31,30,31,30,31};
    int d,m,y,s,i;
    Scanner br =new Scanner(System.in);
    s=0;
    System.out.println("Enter day : ");
    d=br.nextInt( );
    System.out.println("Enter month : ");
    m=br.nextInt( );
    System.out.println("Enter year : ");
    y=br.nextInt( );
    if(y%4==0) a[1]=29;
    if(m>12 || d>a[m-1])
        System.out.println("INVALID DATE");
        else
        {
            for(i=0;i<m-1;i++)
                    s=s+a[i];
            s=s+d;
            System.out.println("Total number of days : " + s);
        }
    }
}