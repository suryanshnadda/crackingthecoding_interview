 // to check if string contains duplicate character or not
 import java.util.Scanner;
public  class one
 {
   public static void main(String[] args)
   {
     String a="suryansh";
     int count=0;
     for(int i=0;i<a.length();i++)
     {
       for(int j=i+1;j<a.length();j++)
       {
         if(a.charAt(i)==(a.charAt(j)))
         { count++;
           System.out.println("duplicate_found");
           return;
         }
       }
     }

     System.out.println("no duplicate found");
     return;
   }

 }
