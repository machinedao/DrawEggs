package org.machinegamez.zz;

/*
 * static 内部类相当于其外部类的 static 成员，它的对象与外部类对象间不存在依赖关系，因此可直接创建。
 * 不需要使用 outObjectName.new 的方式来创建
 * 
 */
public class TryInnerStatic {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		inner.dostuff();	// 输出 1
	}
}

class Outer	{
	private static int size;
	static class Inner {
		public void dostuff(){
			size++;	// 局部变量 size
			System.out.println("size = " + size);
		}
	}
}
