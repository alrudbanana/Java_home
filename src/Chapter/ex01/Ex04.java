package Chapter.ex01;
///배열에 넣어서 오버라이딩된 메소드  출력

//instanceof를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 cry(), run()
//instanceof를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면 eat(), run()
//instanceof를 사용해서 객체 내부에 Eagle타입이 존재하면 eat(), run(),cry()
//Cat, tiger < == cry, run()
//Dog, Lion <== run() , eat()
//Eagle <== cry,run, eat()

interface Ani{}

interface Animal1 extends Ani{
	void cry();
}
interface Animal2 extends Ani{
	void run();
}
interface Animal3 extends Ani{
	void eat();
}

class Cat implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("야옹");
		
	}

	@Override
	public void run() {
		System.out.println("고양이는 달린다.");
		
	}
}

class Tiger implements Animal2,Animal1{
	@Override
	public void cry() {
		System.out.println("으르렁");
		
	}
	@Override
	public void run() {
		System.out.println("호랑이는 달린다.");
		
	}
}
	
class Dog implements Animal2,Animal3{
	@Override
	public void eat() {
		System.out.println("냠냠");
		
	}
	@Override
	public void run() {
		System.out.println("개는 달린다");
		
	}
}
	
class Lion implements Animal3,Animal2{
	@Override
	public void eat() {
			System.out.println("고기 ");
		
	}
	@Override
	public void run() {
		System.out.println("달려");
		
	}
}



public class Ex04 {

	public static void main(String[] args) {
		Ani a1 = new Cat();
		Ani a2 = new Dog();
		Ani a3 = new Tiger();
		Ani a4 = new Lion();
		
		Ani[] arr = new Ani[] {a1,a2,a3,a4};
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i]instanceof Cat || arr[i]instanceof Dog) {
				((Animal1)arr[i]).cry();
				((Animal2)arr[i]).run();
			}else {
				System.out.println("fail");
			}break;
		}
		

	}

}
