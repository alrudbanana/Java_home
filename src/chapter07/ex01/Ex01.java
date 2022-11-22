package chapter07.ex01;

public class Ex01 {
	public static int sum (int a, int b, int c) {
		return a + b + c;
	}
	
	public static double sum2 ( double a1 , double a2 ,double a3) {
		return a1 + a2 + a3;
	}
	
	public String product(String name , String proNo, String price) { 
		//인스턴스 메소드 : Static 이 붙지있지 않는 메소드 , 객체화해서 호출이 가능 
		return name + proNo + price;
	}
	
public static void main(String[] args) {
	int sSum = sum(10,20,30); //호출해서 sSum 변수에 담고 변수출력 
	System.out.println(sSum);
	
	double sSum2 = sum2 (10.23 , 15.23 , 64.75);
	System.out.println(sSum2);
	
	
	//객체화 
	Ex01 t1 = new Ex01() ; //객체화 안하면 오류 발생 
	String product2 = t1.product("도브" , "50개" , "5000원");
	System.out.println(product2);
			
	}
}



	
	

