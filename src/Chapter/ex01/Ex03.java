package Chapter.ex01;
interface B{
	int a = 3;
	void abc();
}

class Bb implements B{
	@Override
	public void abc() {
		System.out.println("abc의 메소드 오버라이딩");
		
	}
}
public class Ex03 {

	public static void main(String[] args) {
		B bb = new Bb();
		bb.abc();
		System.out.println(B.a);

	}

}
