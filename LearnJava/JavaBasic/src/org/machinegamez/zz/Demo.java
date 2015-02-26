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
		
	}
}
