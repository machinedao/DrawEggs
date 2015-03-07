package org.machinegamez.zz;

public class StaticVar {
	static int i = 10;
	int j;
	
	public StaticVar() {
		this.j = 20;
	}
	
	public static void  main(String[] args) {
		System.out.println("类变量 i = " + StaticVar.i);
		StaticVar obj = new StaticVar();
		System.out.println("实例变量 j = " + obj.j);
	}

}
