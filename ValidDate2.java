import java.util.*;
class ValidDate2
{
    public static void main(String arg[])
    {
    int a[ ]={31,28,31,30,31,30,31,31,30,31,30,31};
    String day[ ]={"","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    String rd="";
    int d,m,y,n,i;
    Scanner br =new Scanner(System.in);
    System.out.println("Enter date in six digit format eg 141296 : ");
    n=br.nextInt( );
    y=n%100;
    n=n/100;
    m=n%100;
    d=n/100;
    if(y%4==0) a[1]=29;
    if(m>12 || d>a[m-1])
        System.out.println("INVALID DATE");
        else
        {
            if(d==1 || d==21 || d==31) rd="st";
            else if(d==2 || d==22) rd="nd";
            else if(d==3 || d==23)  rd="rd";
            else rd="th";
            System.out.println(d + rd + " " + day[m] + ", " + y);
            System.out.println("VALID DATE");
        }
    }
}