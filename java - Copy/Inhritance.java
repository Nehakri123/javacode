import java.util.*;
import java.util.Scanner;


class Parent{
	void method1(){
		System.out.println("This is parent class");
	}

}
class Child extends Parent{
	void method2(){
		System.out.println("This is child class");
}

}



public class Inhritance
{
public static void main (String[] args)
{
Child c = new Child();
c.method1();
c.method2();

}
}