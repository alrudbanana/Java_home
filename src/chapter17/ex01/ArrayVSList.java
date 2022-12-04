package chapter17.ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrayVSList {

	public static void main(String[] args) {
		List<String> aList = new ArrayList<>(); //꺽새 꼭 안붙여도 가능 
		//1. List 에 값 넣기 
		aList.add("가");
		aList.add("나");
		//방의 크기를 알려줌
		System.out.println(aList.size());
		//방의 값을 출력하기 
		System.out.println(aList);
		System.out.println(aList.toString());
		
		//컬렉션 값의 삭제 
		aList.remove("가");
		System.out.println(aList);

	}

}
