package chapter07.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[300/4] ;
		for(int i = 0, j = 4; i < a.length;i++, j+=4) {
			a[i]=j;
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		int[] b = new int [300/5];
		for (int i = 0, j = 5; i <b.length; i++, j+=5) {
			b[i]=j;
			
			System.out.print(b[i]+" ");
		}
		System.out.println();
		arraySum(a,b);
	}

	public static void arraySum (int[]a,int[]b) {
		int[]c = new int [75];
		for(int i = 0; i <a.length; i++) {
			for(int j = 0; j < b.length;j++) {
			if(i>54) {
				c[i]=a[i]+0;
			}
			if(i==j) {
				c[i]=a[i]+b[j];
			}
			
			}
			
		}
		System.out.println(Arrays.toString(c));
	}
	
}
