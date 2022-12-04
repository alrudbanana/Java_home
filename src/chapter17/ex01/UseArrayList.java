package chapter17.ex01;

import java.util.ArrayList;

class Student {
	String name; 
	int stuID;
	
	Student (String name, int stuId){
		this.name = name;
		this.stuID = stuId;
	}


	//toString() 재정의 : 객체 자체를 출력할때 메모리 값으로 출력되므로 재정의 
	@Override
	public String toString() {
		return "Student [name=" + name + ", stuID=" + stuID + "]";
	}
	
	
}

//생성자를 사용해서 값을 인풋받기 

public class UseArrayList {

	public static void main(String[] args) {
		//ArrayList에 저장될 객체를 Student 객체
		ArrayList<Student> a1 = new ArrayList();
		
		//Student 객체를 생성 
		Student s1 = new Student("이순신", 2222);
		Student s2 = new Student("박찬희", 2012);
		
		//Student객체를 ArryaList에 저장 
		a1.add(s1);
		a1.add(s2);
		
		//컬렉션의 내용을 순환하면서 출력 
		for(int i = 0; i<a1.size() ; i++) {
			Student ss1 = a1.get(i); //ss1의 객체를 만들어 a1.get으로 
			System.out.println(ss1);
		}
	}

}
