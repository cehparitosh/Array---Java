import java.io.*;
class Cal_no_of_days_form_1_jan
{
    public static void main(String arg[ ]) throws IOException
    {
        int a[ ]={31,28,31,30,31,30,31,31,30,31,30,31};
        int d,m,y,s,i;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        s=0;
        System.out.println("Enter day : ");
        d=Integer.parseInt(br.readLine( ));
        System.out.println("Enter month : ");
        m=Integer.parseInt(br.readLine( ));
        System.out.println("Enter year : ");
        y=Integer.parseInt(br.readLine( ));
        for(i=0;i<m-1;i++)
            s=s+a[i];
        if(y%4==0) s=s+1;
        s=s+d;
        System.out.println("Total number of days : " + s);
    }
}