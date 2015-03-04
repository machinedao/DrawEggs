package org.machinegamez.zz;

/*
 * 基本类型和对应的包装类可以相互装换：
 * 由基本类型向对应的包装类转换称为装箱，例如把 int 包装成 Integer 类的对象；
 * 包装类向对应的基本类型转换称为拆箱，例如把 Integer 类的对象重新简化为 int。
 */
public class BoxingUnboxingAutoboxing {

	public static void main(String[] args) {
		int m = 100;
		Integer obj = new Integer(m);	// 手动装箱
		int n = obj.intValue();	// 手动拆箱
		
		System.out.println("n = " + n);
		
		Integer obj1 = new Integer(100);
		System.out.println("obj 等价于 obj1 ? " + obj.equals(obj1));	// true
		
		/*
		 * 将字符串转换为整数
		 * Integer 类有一个静态的 paseInt() 方法，可以将字符串转换为整数，语法为：
		 * Integer.parseInt(String s, int radix);
		 * s 为要转换的字符串，radix 为进制，可选，默认为十进制。
		 */
		String str[] = {"123","123abc","abc"};
		for (String str1 : str){
			try {
				int x = Integer.parseInt(str1);
				System.out.println(str1 + " 可以被转换为整数 " + x);
			}
			catch(Exception e) {
				System.out.println(str1 + " 无法转换为整数 ");
			}
		}
		
		/*
		 * 将整数转换为字符串
		 * Integer.toString(int arg0)
		 */
		int y = 200;
		String s = Integer.toString(y);
		System.out.println("s = " + s);
		
		/*
		 * 自动拆箱和装箱
		 */
		int i = 300;
		Integer j = i;	// 自动装箱
		int k = j;	// 自动拆箱
		System.out.println("k = " + k);
		
		Integer obj2 = 300;
		System.out.println(" j 等价于 obj2 ? " + obj2.equals(j));	// true
	}
}
