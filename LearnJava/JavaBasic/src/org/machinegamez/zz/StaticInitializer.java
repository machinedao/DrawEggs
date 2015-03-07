package org.machinegamez.zz;

/*
 * 静态初始器（静态块）
 * 块是由大括号包围的一段代码。
 * 静态初始器(Static Initializer)是一个存在于类中、方法外面的静态块。
 * 静态初始器仅仅在类装载的时候（第一次使用类的时候）执行一次，往往用来初始化静态变量。
 */
public class StaticInitializer {
	public static int i;
	
	static{
		i = 10;
		System.out.println("Now in static block.");
	}
	
	public void Test(){
		System.out.println("test method: i = " + i);
	}
	
	public static void main(String[] args) {
		System.out.println("StaticInitializer.i = " + StaticInitializer.i);
		new StaticInitializer().Test();
	}
	/*
	 * 运行结果：
	 * Now in static block.
	 * StaticInitializer.i = 10
	 * test method: i = 10
	 */
}
