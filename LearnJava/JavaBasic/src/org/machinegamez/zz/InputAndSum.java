package org.machinegamez.zz;
import java.util.*;

/*
 * 写一段代码，要求输入任意5个整数，输出它们的和。
 */

public class InputAndSum {
	public static void main(String[] args){
		int[] intArray = new int[5];
		long total = 0;
		int len = intArray.length;
		
		System.out.print("请输入 " + len + " 个整数，以空格为隔：");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < len; i++){
			intArray[i] = sc.nextInt();
		}
		
		for(int i = 0; i < len; i++){
			total += intArray[i];
		}
		
		System.out.println("所有元素的和为：" + total);
	}
}
