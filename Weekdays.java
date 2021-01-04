import java.util.*;
class Weekdays
{

    public static void main(String arg[])
    {
        Scanner br = new Scanner(System.in);
        String day[]={"","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
        String b;
        int nd[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int dd,mm,yy,i,s,w,wd,t;
        s=0;
        wd=0;
        System.out.println("Enter day in dd format.");
        dd=br.nextInt();
        System.out.println("Enter month in mm format.");
        mm=br.nextInt();
        System.out.println("Enter year in yyyy format.");
        yy=br.nextInt();
        if(dd>0 && mm>0 && dd<=31 && mm<=12 )
             {
                    System.out.println("Enter day on 1st January ");
                    System.out.println(" MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY");
                    b=br.next();
                    for(i=1;i<8;i++)
                                if(b.equals(day[i])) wd=i;
                    for(i=1;i<mm;i++)
                                s=s+nd[i];
                    s=s+dd;
                    if(yy%4==0 && mm>2) s=s+1;
                    w=s%7;
                    t=wd+w-1;
                    if(t<=7) System.out.println(day[t]);
                    if(t>7)
                        {
                             t=t-7;
                             System.out.println(day[t]);
                         }
                }
      }
}