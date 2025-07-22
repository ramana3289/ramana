class Week2h 
{
public static void main(String[] args) {
int n=4, firstTerm=0, secondTerm=1;
System.out.println("Fibonacci series till "+n+" terms:");
for(int i=1; i<=n; ++i) {
 System.out.print(firstTerm +",");
 int nextTerm = firstTerm + secondTerm;
firstTerm = secondTerm;
secondTerm = nextTerm;
}
}
}