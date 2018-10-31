/*
Assume you have a method isSubstring which checks
if one word is a substring of another  Given
two strings, s1 and s2, write code to
check if s2 is a rotation of s1 using only one call to isSubstring 
(i e , “waterbottle” is a rotation of “erbottlewat”)
*/
import java.util.Scanner;
import java.util.Collections;
public class seven
{
  boolean check(String a,String b)
  {
    a=a.concat(a);
    boolean m=a.contains(b);
    if(m)
     {
       return true;
     }
    return false;
  }
  public static void main(String []args)
  {
    String a="surya";
    String b="don";
  if(a.length()==0 || b.length()==0)
  {
    System.out.println("one of string is empty");
    return;
  }
    seven obj = new seven();
    boolean c=obj.check(a,b);

    if(c)
    System.out.print("yes string is rotaion");
    else
    {
      System.out.println("not rotation");
    }
  }
}
