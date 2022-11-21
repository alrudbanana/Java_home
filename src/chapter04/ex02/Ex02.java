package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1월부터 12월까지 월을 입력하면 해당 일수를 출력합니다");
		int month = sc.nextInt();
		
		switch (month) {
		case 1: 
		case 3:
		case 5:  
		case 7: 
		case 9:
		case 11:
			System.out.println(month + "월 은/는" + " 31일 입니다.");
		break;
		
		case 2:
			System.out.println(month+ "월 은/는"+"28일 입니다.");
		break;
		
		case 4: case 6: case 8: case 10: case 12:
			System.out.println(month + "월 은/는" + "30일 입니다." );
			default :
				System.out.println("잘 못 입력하셨습니다.");
			
		}
		sc.close();
	}

}
