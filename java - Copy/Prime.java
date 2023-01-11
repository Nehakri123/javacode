import java.util.*;
import java.util.Scanner;
public class Prime{
public static void main(String[] args)
{
int n,cout=0;
System.out.println("Enter the prime number");
Scanner r=new Scanner(System.in);
n=r.nextInt();
for(int i=1; i<=n; i++)
{
if(n%i==0)
{
cout++;
}
}
if(cout==2)
System.out.print("prime number");
else
System.out.print("Not prime number");
}
}
