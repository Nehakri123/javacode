import java.util.*;
import java.util.Scanner;


class Parent{
	void method(){
		System.out.println("This is parent class");
	}

}
class Child extends Parent{
	void method(){
		System.out.println("This is child class");
}

}



public class P
{
public static void main (String[] args)
{
Parent c = new Child();
c.method();

}
}