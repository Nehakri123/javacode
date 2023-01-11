import java.util.*;
import java.util.Scanner;
public class MAN
{
public static void main(String[]args)
{

int a,b,c,ch;
System.out.println("Enter  any two number");
Scanner s=new Scanner(System.i);
a=s.nextInt();
b=s.nextInt();
System.out.println("Enter your choice:");
ch=s.nextInt();
Switch(ch);
{
case1:
c=a+b;
System.out.println("Addition"+c);
break;
case2:
c =a-b;
System.out.println("subtraction"+c);
break;
case3:
c =a*b;
System.out.println("multiplication"+c);
break;
case4:
c=a/b;
System.out.println("division"+c);
break;
default:
System.out.println
}

}
}

