package chapter07.ex02;

public class Ex01 {

	public static void main(String[] args) {
		int[] a = new int [100/3];
		
	for(int i=0,j=3; i<a.length;i++, j+=3) {
		a[i]=j;
	}
	print(a,5);	
	}
	public static void print(int[]a, int b) {
		
		for(int i = 0; i < a.length;i++) {
			System.out.print(a[i] * b + " ");
		}
	}
}
