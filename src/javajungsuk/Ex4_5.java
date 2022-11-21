package javajungsuk;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ' , opt = '0';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요 >> ");
		score = sc.nextInt();
		
		System.out.printf("당신의 점수는 %d 입니다. %n", score);
		
	
			if(score >= 90 && score <= 100) {
				grade = 'A';
				if(score >= 98) {
					opt = '+';
				} else if (score >=94){
					opt = '-';
				}
			}else{
				if(score >=80) {
					grade = 'B';
					opt = '+';
				}
			}
		
				System.out.println("당신의 학점은" + grade + opt + " 입니다.");

	}

}
