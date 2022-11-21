package chaprt03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("정수를 입력하세요");
		
		int num = sc.nextInt();
		System.out.println(num + "은/는" + (num%2==0 ? "짝수": "홀수"));
		
		sc.close();
		
	}

}
