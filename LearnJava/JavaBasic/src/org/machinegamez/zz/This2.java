package org.machinegamez.zz;

/*
 * this 作为参数传递
 * 需要在某些完全分离的类中调用一个方法，并将当前对象的一个引用作为参数传递时
 * 
 * 匿名对象就是没有名字的对象。
 * 如果对象只使用一次，就可以作为匿名对象，
 * 下述代码中 new B(this).print(); 等价于 ( new B(this) ).print();，
 * 先通过 new B(this) 创建一个没有名字的对象，再调用它的方法。
 * 
 * 最后注意 super 与 this 的区别：super 不是一个对象的引用，
 * 不能将 super 赋值给另一个对象变量，
 * 它只是一个指示编译器调用父类方法的特殊关键字。
 * 
 */
public class This2 {

	/*
	 * 输出
	 * here is A
	 * here is B
	 */
	public static void main(String[] args) {
		B b = new B(new A());
	}
}

class A {
	public A(){
		new B(this).print();	// 匿名对象
	}
	public void print(){
		System.out.println("here is A");
	}
}

class B {
	A a;
	public B(A a){
		this.a = a;
	}
	public void print(){
		a.print();
		System.out.println("here is B");
	}
}