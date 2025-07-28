import java.lang.*;
public class Geeks
{
 public static void main(String[] args)
 {
  StringBuffer sbf=new StringBuffer("Geeksforgeeks");
  sbf.delete(6,8);
  System.out.println("After deletion String buffer is = "+sbf);
 }
}