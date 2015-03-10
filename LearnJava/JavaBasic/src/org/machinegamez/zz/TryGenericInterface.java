package org.machinegamez.zz;

public class TryGenericInterface {

	public static void main(String[] args) {
		Info<String> obj = new InfoImp<String>("www.google.com");
		System.out.println("Length of String: " + obj.getVar().length());

	}

}

interface Info<T> {
	public T getVar();
}

class InfoImp<T> implements Info<T> {
	private T var;
	// 定义泛型构造方法
	public InfoImp(T var){
		this.setVar(var);
	}
	public void setVar(T var){
		this.var = var;
	}
	public T getVar() {
		return this.var;
	}
}
