package chapter17.ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aList = new ArrayList();
		
		aList.add(3);
		aList.add(3);
		aList.add(5);
		System.out.println(aList);
		
		//특정 방 번호에 값을 넣는다. 
		aList.add(1,6);
		System.out.println(aList);
		
		//다른 리스트 객체를 불러와 다른 컬렉션의 모든 내용을 합해서 출력 
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.addAll(aList);
		System.out.println(aList2);
		
		//방을 지정해서 다른 객체를 를 넣을때 
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(4);
		aList3.add(5);
		System.out.println(aList3);
		aList3.addAll(1,aList);
		System.out.println(aList3);
		
		//기존의 방의 값을 수정 : set
		aList.set(1, 5);
		System.out.println(aList);
		
		//remove : 특정 방 번호의 값을 삭제 
		aList.remove(1);
		
		//*방에 들어간 값으로 삭제 
		aList.remove(new Integer(3));
		System.out.println(aList);
		
		System.out.println(aList.isEmpty());
		System.out.println(aList.size());
		
		//List를 array로 변환 
		Object[] obj = aList3.toArray();
	}

}
