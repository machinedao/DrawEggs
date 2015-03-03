package org.machinegamez.zz;

public class ThisConstructor {
	public String name;
	public int age;
	
	/*
	 * this 作为方法名来初始化对象
	 * 也就是相当于调用本类的其它构造方法，它必须作为构造方法的第一句。
	 * 
	 * (this)在构造方法中调用另一个构造方法，调用动作必须置于最起始的位置。
	 * (this)不能在构造方法以外的任何方法内调用构造方法
	 * 在一个构造方法内只能调用一个构造方法
	 * 
	 */
	public ThisConstructor(){
		this("小明",10); // 必须作为构造方法的第一句
	}
	
	public ThisConstructor(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void Say() {
		System.out.println("我是" + name + "，今年" + age + "岁");
	}

	public static void main(String[] args) {
		ThisConstructor thisConstructor = new ThisConstructor();
		thisConstructor.Say();

	}

}
