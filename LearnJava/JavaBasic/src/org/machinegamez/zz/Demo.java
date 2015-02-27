package org.machinegamez.zz;

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
		
	}
}
