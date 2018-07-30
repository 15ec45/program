import java.io.*;
import java.util.*;
public class count
{
public static void main(String []args)
{
int a,count=0;
Scanner s=new Scanner(System.in);
a=s.nextInt();
while(a>0)
{
count=count+1;
a=a/10;
}
System.out.println(count);
}
}
