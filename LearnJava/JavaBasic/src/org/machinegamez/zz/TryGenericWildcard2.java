package org.machinegamez.zz;

/*
 * 数字坐标与字符串坐标又有区别：数字可以表示x轴或y轴的坐标，字符串可以表示地球经纬度。
 * 现在又要求定义两个方法分别处理不同的坐标，一个方法只能接受数字类型的坐标，
 * 另一个方法只能接受字符串类型的坐标，怎么办呢？
 * 这个问题的关键是要限制类型参数的范围
 * 
 * 另外，使用通配符(?)不但可以限制类型的上限，还可以限制下限。
 * 限制下限使用 super 关键字，例如 <? super Number> 表示只能接受 Number 及其父类
 */
public class TryGenericWildcard2 {

	public static void main(String[] args) {
		Point2<Integer, Integer> p1 = new Point2<Integer, Integer>();
		p1.setX(10);
		p1.setY(30);
		printNumPoint(p1);
		
		Point2<String, String> p2 = new Point2<String, String>();
		p2.setX("东经120度");
		p2.setY("北纬30度");
		printStrPoint(p2);

	}
	
	// 使用通配符限制泛型的范围
	public static void printNumPoint(Point2<? extends Number, ? extends Number> p){
		System.out.println("x: " + p.getX() + ", y: " + p.getY());
	}
	public static void printStrPoint(Point2<? extends String, ? extends String> p){
		System.out.println("GPS: " + p.getX() + ", " + p.getY());
	}

}

class Point2<T1, T2> {
	T1 x;
	T2 y;
	public T1 getX(){
		return x;
	}
	public void setX(T1 x){
		this.x = x;
	}
	public T2 getY(){
		return y;
	}
	public void setY(T2 y){
		this.y = y;
	}
}

