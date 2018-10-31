// reverse the string
import java.util.Scanner;
public class two
{

   String reverse(String a)
   {

     String b="";
     for(int i=a.length()-1;i>-1;i--)
     {
       b=b.concat(String.valueOf(a.charAt(i)));
     }
    b=b.trim();

     return b;
   }
  public static void main(String[] args)
  {
    String a="cool";
    two obj = new two();
    System.out.println(obj.reverse(a));
  }
}
