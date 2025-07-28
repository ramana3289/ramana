import java.util.Scanner;
public class BinarysearchAscending
{
 public static void main(String[] args)
 {
  int num[]={2,5,9,12,17,37,86};
  int i,x,f,s,e,m;
  Scanner sc=new Scanner(System.in);
  System.out.print("Array:");
  for(i=0; i<num.length; i++)
  {
    System.out.print(num[i]+"");
  }
 System.out.print("\nEnter num to search");
 x=sc.nextInt();
 f=0;
 s=0;
 e=num.length-1;
 while(s<=e)
 {
  m=(s+e)/2;
  if(x==num[m])
  {
    System.out.print("number found at index"+m);
    f=1;
    break;
  }
  else if(x>num[m])
   {
     s=m+1;
   }
  else if(x>num[m])
   {
     s=m+1;
   }
  else if(x<num[m])
  {
   e=m-1;
  }
 }
if(f==0)
{
  System.out.print("number not found");
 }
}
}