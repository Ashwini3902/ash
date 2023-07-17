import java.io.*;
import java.util.*;
class ar
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Hiii Appu!!\n\tAnswer this question !\n1.How do you call me most of the time?");
String a=s.next();
if(a.equals("Ammu")||a.equals("ammu"))
{
System.out.println("\n");
for(int i=0;i<=5;i++)
{
for(int j=0;j<=3;j++)
{
if(((i==0)&&(j==0))||((i==0)&&(j==1))||((i==0)&&(j==2))||((i==0)&&(j==3))||((i==1)&&(j==0))||((i==1)&&(j==3))||((i==2)&&(j==0))||((i==2)&&(j==1))||((i==2)&&(j==2))||((i==2)&&(j==3))||((i==3)&&(j==0))||((i==3)&&(j==1))||((i==4)&&(j==0))||((i==4)&&(j==2))||((i==5)&&(j==0))||((i==5)&&(j==3)))
{
System.out.print("A");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}

System.out.println("\n");
for(int i=0;i<=5;i++)
{
for(int j=0;j<=4;j++)
{
if(((i==1)&&(j==0))||((i==1)&&(j==1))||((i==1)&&(j==3))||((i==1)&&(j==4))||((i==2)&&(j==0))||((i==2)&&(j==2))||((i==2)&&(j==4))||((i==3)&&(j==1))||((i==3)&&(j==3))||((i==4)&&(j==2)))
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}

for(int i=0;i<=5;i++)
{
for(int j=0;j<=4;j++)
{
if(((i==1)&&(j==2))||((i==2)&&(j==1))||((i==2)&&(j==3))||((i==3)&&(j==0))||((i==3)&&(j==1))||((i==3)&&(j==2))||((i==3)&&(j==3))||((i==3)&&(j==4))||((i==4)&&(j==0))||((i==4)&&(j==4))||((i==5)&&(j==0))||((i==5)&&(j==4)))
{
System.out.print("R");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}
}
