import java.util.*;
class Cal_no_of_days
{
    public static void main(String arg[]) 
    {
        int a[ ]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int d,m,y,d1,m1,y1,s,s1,i,x;
        Scanner br =new Scanner(System.in);
        s=0;
        s1=0;
        System.out.println("Enter First Date  day : ");
        d=br.nextInt( );
        System.out.println("Enter month : ");
        m=br.nextInt( );
        System.out.println("Enter year : ");
        y=br.nextInt( );
        System.out.println("Enter Second Date day : ");
        d1=br.nextInt( );
        System.out.println("Enter month : ");
        m1=br.nextInt( );
        System.out.println("Enter year : ");
        y1=br.nextInt( );
        for(i=1;i<m;i++)
            s=s+a[i];
        if(y%4==0) s=s+1;
        s=s+d;
        for(i=0;i<m1;i++)
            s1=s1+a[i];
        if(y1%4==0) s1=s1+1;
        s1=s1+d1;
        x=s1-s;
        System.out.print("Total number of days between : " + d+"/"+m+"/"+y);
        System.out.print(" and " + d1+"/"+m1+"/"+y1);
        System.out.print(" is " + x);
    }
}