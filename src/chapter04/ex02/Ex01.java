package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("정수를 입력하세요. - > 메달의 색을 알 수 있습니다");
		num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("금메달 입니다.");
			break;
			
		case 2:
			System.out.println("은메달 입니다.");
			break;
		case 3 : 
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
		
		sc.close();

	}

}
