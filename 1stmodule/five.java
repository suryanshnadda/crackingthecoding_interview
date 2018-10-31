import java.util.Scanner;
public class five
{

 String test(String a)
 {

    String b="";
    b=b.concat(String.valueOf(a.charAt(0)));
    for(int i=1;i<a.length();i++)
    {
      if(b.contains(String.valueOf(a.charAt(i))))
      {
        //
      }
      else
      {
        b=b.concat(String.valueOf(a.charAt(i)));
      }

    }
    return b;
 }
  public static void main(String []args)
  {
    five obj = new five();
    String a="cool";

    if(a.length()==0)
    {
      System.out.println("String is empty");
      return;
    }
    String b=obj.test(a);
    System.out.println(b);
  }
}
