import java.io.*;
import java.util.Scanner;
public class M
{
int age=2;
int weight=90;
String color ="light";
void eat()
{
System.out.println("I'm eating");
}
void sleep()
{
System.out.println("I'm sleeping");
}
public static void main(String[] args)
{
Person p =new Person();
System.out.println(p.age);
System.out.println(p.weight);
System.out.println(p.color);
p.eat(); 
p.sleep();
}
}