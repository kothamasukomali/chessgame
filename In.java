import java.io.*;
import java.util.Scanner;
interface A
{
 public void m1();
}
interface B
{
public void m2();
}
class C implements A,B
{
public void m1()
{
 System.out.println("method of interface-A");
}
 public void m2()
{
 System.out.println("method of interface-B");
}
}
class In
{
 public static void main(String args[])
{
 C ob=new C();
 ob.m1();
 ob.m2();
}
} 