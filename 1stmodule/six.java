/*
Write an algorithm such that if an element in an MxN matrix is 0,
its entire row and column is set to 

*/

import java.util.Scanner;
 class  six
{
  int m=3;
  int n=3;
  int a[][]= new int[m][n];

  void insertmatrix()
  {
    Scanner obj = new Scanner(System.in);
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.println("enter");
       int d=obj.nextInt();

      a[i][j]=d;
     }
    }
  }


  void perform(int k,int j)
  {

   for(int i=0;i<m;i++)
   {
     this.a[k][i]=0;
     this.a[i][j]=0;
   }
  }

  void search()
  {
    int k=-1;
    int j=-1;
     for(int i=0;i<m;i++)
      {
        for(int o=0;o<n;o++)
        {
          if(this.a[i][o]==0)
          {

            k=i;
            j=o;
           perform(k,j);
            break;
          }
        }
      }

  }
  public static void main(String[]args)
  {
     six on= new six();
     on.insertmatrix();
     on.search();
     for(int i=0;i<on.m;i++)
     {
       for(int j=0;j<on.n;j++)
       {
         System.out.print(on.a[i][j]+" ");
       }
       System.out.println(" ");
     }
  }
}
