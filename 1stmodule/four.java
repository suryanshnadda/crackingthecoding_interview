  // replace all spaces in string with . 
import java.util.Scanner;
public class four
{
  String perform(String a)
  {
    a=a.replaceAll("\\s",".");
    return a;
  }
  public static void main(String[] args)
  {
    String a="www suryansh nadda";
    four obj = new four();
    String b=obj.perform(a);

    System.out.println(b);

  }
}
