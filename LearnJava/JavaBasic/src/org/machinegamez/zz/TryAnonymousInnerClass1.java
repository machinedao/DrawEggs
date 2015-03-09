package org.machinegamez.zz;

/*
 * 不使用匿名内部类来实现抽象方法
 */

abstract class Person {
	public abstract void eat();
}

class Child extends Person {
	public void eat() {
		System.out.println("eat something");
	}
}

public class TryAnonymousInnerClass1 {
	public static void main(String[] args){
		Person person = new Child();
		person.eat();
	}
}
