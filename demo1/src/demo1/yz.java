package demo1;
import java.util.*;
import java.io.*;
import java.lang.*;
class people
{
	int age;
	people(int i)
	{
		this.age = i;
	}
	void query_age()
	{
		System.out.println(age);
	}
}
interface fun
{
	public void set_grade(int k); //必须是public类型
}
class student extends people implements fun
{
	student(int i) {
		super(i);  //父类的构造方法
	}
	public void set_grade(int k)
	{
	//	fun.grade = k;
	}
}
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("hello world");
	}
}
public class yz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//util包
		//int i = in.nextInt();
		//System.out.println(i);
//		student yz = new student(20);
//		yz.set_grade(100);
		int i = 1, j = 2;
		Integer k = 100;   //int对应的包裹类/包装类
		Character c = 's'; //char 对应包裹类
		String s = "safddsaf";
//		System.out.println(s);
//		System.out.println(i + " " + j);
		MyThread t1 = new MyThread("线程1");
		MyThread t2 = new MyThread("线程2");
		t1.start();
		t2.start();
	}
}
