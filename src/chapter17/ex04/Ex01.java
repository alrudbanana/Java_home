package chapter17.ex04;

import java.util.ArrayList;

class Car{
	String company;
	String carName;
	String color;
	int maxSpeed;
	
	public Car (String company, String carName, String color, int maxSpeed) {
		this.company = company;
		this.carName = carName;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", carName=" + carName + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}

	
public class Ex01 {

	public static void main(String[] args) {
		ArrayList<Car> arr1 = new ArrayList();
		arr1.add(new Car("현대자동차","쏘렌토","흰색",200));
		arr1.add(new Car("멕라렌","멕라렌","노란색",400));
		arr1.add(new Car("페파리","카이엔","흰색",500));
		
		for(int i =0; i <arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		
		for(Car k : arr1) {
			System.out.println(k);
		}
		
		System.out.println(arr1);

	}

}
