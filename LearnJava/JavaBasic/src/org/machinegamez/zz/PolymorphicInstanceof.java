package org.machinegamez.zz;

/*
 * 多态性带来了一个问题，就是如何判断一个变量所实际引用的对象的类型 。 
 * C++使用runtime-type information(RTTI)，Java 使用 instanceof 操作符。
 * 
 * instanceof 运算符用来判断一个变量所引用的对象的实际类型，
 * 注意是它引用的对象的类型，不是变量的类型。
 */
public class PolymorphicInstanceof {
	public static void main(String[] args){
		People obj = new People();
		if(obj instanceof Object)
			System.out.println("object");
		if(obj instanceof People)
			System.out.println("people");
		if(obj instanceof Teacher)
			System.out.println("teacher");
		if(obj instanceof President)
			System.out.println("president");
		System.out.println("==============="); // 分割线
		obj = new Teacher();
		if(obj instanceof Object)
			System.out.println("object");
		if(obj instanceof People)
			System.out.println("people");
		if(obj instanceof Teacher)
			System.out.println("teacher");
		if(obj instanceof President)
			System.out.println("president");
	}
}

class People{}
class Teacher extends People{}
class President extends Teacher{}
