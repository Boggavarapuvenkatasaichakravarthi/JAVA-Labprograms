import java.util.Scanner;
import java.io.*;
class callbyvalue
{
	 void read(int x,int y)
	{
	x=x+10;
	y=y+10;
	}
}
class lab12a
{
public static void main(String args[])
{
callbyvalue c=new callbyvalue();
system.out.println("enter two numbers:");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("before the x and y values are"+x+","+y);
c.read(x,y);
System.out.println("after the x and y values are"+x+","+y);
}
}