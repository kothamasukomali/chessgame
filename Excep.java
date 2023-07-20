import java.io.*;
import java.util.Scanner;
class iae extends Exception
{
 public iae(String s)
{
 super(s);
}
}
class ude 
{
 static void check(int a) throws  iae;
{
 try
{
if(a<18) throw new iae("not eligible to vote");
else
{
System.out.println("eligible and welcome to vote system");
}
}
catch(iae e)
{
 System.out.println(e);
}
}
}
class Excep
{
 public static void main(String args[])
{
iae ob=new iae();
check();
}
}
