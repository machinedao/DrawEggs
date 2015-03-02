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
		
		/*
		 * StringBuffer 默认分配16字节长度的缓冲区，当字符串超过该大小时，
		 * 会自动增加缓冲区长度，而不是生成新的对象。
		 * 
		 * StringBuffer不像String，只能通过 new 来创建对象，不支持简写方式
		 * 
		 * StringBuffer类中的方法主要偏重于对于字符串的操作，例如追加、插入和删除等，
		 * 这个也是StringBuffer类和String类的主要区别。
		 * 实际开发中，如果需要对一个字符串进行频繁的修改，建议使用 StringBuffer。
		 * 
		 * 字符串的”+“操作实际上也是先创建一个StringBuffer对象，
		 * 然后调用append()方法将字符串片段拼接起来，最后调用toString()方法转换为字符串。
		 * 
		 */
		StringBuffer strb1 = new StringBuffer();
		StringBuffer strb2 = new StringBuffer(512); // 分配512个字节长度的缓冲区
		StringBuffer strb3 = new StringBuffer("www.google.com"); // 在缓冲区中存放了字符串，并在后面预留了16个字节长度的空缓冲区
		
		strb3.append(true);
		System.out.println(strb3); // 输出 www.google.comtrue
		
		// deleteCharAt() 方法用来删除指定位置的字符，并将剩余的字符形成新的字符串。
		StringBuffer strb4 = new StringBuffer("abcde");
		strb4.deleteCharAt(3); // 删除索引为3的字符，即 d
		
		StringBuffer strb5 = new StringBuffer("abcde");
		strb5.delete(1, 3); // 删除索引值为 1~3 之间的字符，包括索引值1，但不包括3
		
		// insert() 用来在指定位置插入字符串，可以认为是append()的升级版
		StringBuffer strb6 = new StringBuffer("abcde");
		strb6.insert(3,"xyz");	// "abcdxyze" 
		
		// setCharAt() 方法用来修改指定位置的字符
		StringBuffer strb7 = new StringBuffer("abcde");
		strb7.setCharAt(3, 'z'); // "abcze"  索引值为3的字符修改为 z

	}
}
