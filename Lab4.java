import java.util.*;
class Lab4
{
  int a[][],b[][],c[][],m,n,p,q;
  Lab4()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("enter m");
   m=s.nextInt();
   System.out.println("enter n");
   n=s.nextInt();
   System.out.println("enter p");
   p=s.nextInt();
   System.out.println("enter q");
   q=s.nextInt();
   a=new int[m][n];
   b=new int[p][q];
   System.out.println("the first matrix ele");
   for(int i=0;i<m;i++)
   {
    for(int j=0;j<n;j++)
     {
       a[i][j]=s.nextInt();
     }
   }
   System.out.println("the second matrix ele");
   for(int i=0;i<p;i++)
   {
    for(int j=0;j<q;j++)
     {
       b[i][j]=s.nextInt();
     }
   }
  }
   void add()
   {
    if((m==p) && (n==q))
    {
      c=new int[m][n];
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          c[i][j]=a[i][j]+b[i][j];
        }
      }
    }
   }
   void display()
   {
     
    for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
        
         System.out.println(c[i][j]);
        }
        
      }
   }
    void sub()
   {
    if((m==p) && (n==q))
    {
      c=new int[m][n];
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          c[i][j]=a[i][j]-b[i][j];
        }
      }
    }
   }
   
   void mul()
   {
    if(n==p)
    { 
     c=new int[m][q];
     for(int i=0;i<m;i++)
     {
      for(int j=0;j<q;j++)
     {
      c[i][j]=0;
      for(int k=0;k<n;k++)
      {
       c[i][j]=c[i][j]+a[i][k]*b[k][j];
      }
     }
    }
   }
  }
   
    
   
   public static void main(String args[])
   {
   Lab4 L=new Lab4();
    
   L.add();
   System.out.println("addition of two martix");
   L.display();
   L.sub();
   System.out.println("subtraction of two martix");
   L.display();
   L.mul();
   System.out.println("multiplication of two martix");
   L.display();
  }
}
  
	