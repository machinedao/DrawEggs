package org.machinegamez.zz;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args){
		class Student{
			String name;
			int age;
			float score;
			
			void Say(){
				System.out.println(name + "的年龄是 " + age + ", 成绩是" + score);
			}
		}
		
		Student stu1 = new Student();
		stu1.name = "小明";
		stu1.age = 15;
		stu1.score = 92.5f;
		stu1.Say();
		
		int[] demoArray = new int[3];
		for(int i = 0; i<demoArray.length; i++){
			System.out.println(demoArray[i]);  // 输出三个 0
		}
		
		
		/*
		 * Java提供了”增强版“的for循环，专门用来遍历数组，语法为
		 * 
		 * for( arrayType varName: arrayName ){
    	 * // Some Code
		 * }
		 */
		int arrayDemo[] = {1, 2, 4, 7, 9, 192, 100};
		for(int x : arrayDemo){
			System.out.println(x + ", ");
		}
		
		/*
		 * 字符串操作
		 * length() 返回字符串的长度
		 * charAt() 方法的作用是按照索引值获得字符串中的指定字符。
		 * replace() 字符串替换 
		 * split() 以指定字符串作为分隔符，对当前字符串进行分割，分割的结果是一个数组
		 */
		String str = "123456789";
		System.out.println(str.length());
		System.out.println(str.charAt(0) + " " + str.charAt(5));
		String str1 = "谷歌 is google.com";
		String str2 = str1.replace("谷歌", "google"); // 前者替换成后者
		System.out.println(str1);
		System.out.println(str2); // google is google.com
		String str3 = "what_is_big_data";
		String[] strArr = str3.split("_");
		System.out.println(Arrays.toString(strArr)); // 直接打印输出数组 [what, is, big, data]

	}
}
