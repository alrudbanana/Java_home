package Chapter.ex01;



abstract class Calc {	//사칙 연산을 계산 하는 계산기 클래스 
	abstract int add (int a, int b); //더하기 연산 
	abstract int diff (int a, int b); //빼기 연산
	abstract int mul (int a, int b); //곱하기 연산
	abstract double div (int a, int b); //나누기 연산
	
}

class Calc_imply extends Calc{
	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	@Override
	int diff(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}
	@Override
	double div(int a, int b) {
		// TODO Auto-generated method stub
		return (double)a / (double)b;
	}
	@Override
	int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}
}
	public class ex01 {
	public static void main(String[] args) {
	
		
		System.out.println("더하기 곱하기 값 출력");
		
		Calc c = new Calc_imply();
		int a = 5;
		int b = 4;
		c.add(a, b);
		c.diff(a, b);
		c.div(a, b);
		c.mul(a, b);
		
		System.out.println(c.add(a, b));
		System.out.println(c.diff(a, b));
		System.out.println(c.div(a, b));
		System.out.println(c.mul(a, b));
			
		
		
		
	}
	}
