package org.machinedao.zz;

public class Demo {
	public static void main(String[] args){
		class Student{
			String name;
			int age;
			float score;
			
			void Say(){
				System.out.println(name + "�������� " + age + ",�ɼ���" + score);
			}
		}
		
		Student stu1 = new Student();
		stu1.name = "С��";
		stu1.age = 15;
		stu1.score = 92.5f;
		stu1.Say();
		
	}

}
