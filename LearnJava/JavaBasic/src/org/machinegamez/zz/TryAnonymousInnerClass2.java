package org.machinegamez.zz;

/*
 * 匿名内部类是局部内部类的一种特殊形式，也就是没有变量名指向这个类的实例，
 * 而且具体的类实现会写在这个内部类里面。
 * 
 * 匿名类必须继承一个父类或实现一个接口。
 * 
 */

abstract class Person2 {
	public abstract void eat();
}

public class TryAnonymousInnerClass2 {
	public static void main(String[] args) {
		// 继承 Person2 类
		new Person2() {
			@Override
			public void eat() {
				System.out.println("eat something");
			}
		}.eat();  // 匿名类继承了 Person2 类并在大括号中实现了抽象类的方法
	}
}
