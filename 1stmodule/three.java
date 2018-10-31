// checking for anagram

import java.util.Scanner;
import java.util.Arrays;
public class three
{
  boolean test(String a,String b)
  {

    if(a.length()==0 || b.length()==0)
    {
      return false;
    }
    char aa[]=a.toCharArray();
    char bb[]=b.toCharArray();
    Arrays.sort(aa);
    Arrays.sort(bb);

    int count=0;
    for(int i=0;i<aa.length;i++)
    {
      if(aa[i]!=bb[i])
      {
        return false;
      }
    }
    return true;
}
public static void main(String[] args)
{
String a="don";
String b="";
  three obj = new three();
  if(obj.test(a,b))
  {
    System.out.println("Strings are anagram");
  }
  else
  {
    System.out.println("Strings are  not anagram");
  }
}

}
