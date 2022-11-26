package javajungsuk;

class Card {
	String kind;
	int number;
	static int width = 100;
	static int hieght = 250;
	
}



public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("card width ="+Card.width);
		System.out.println("card height ="+Card.hieght);
		Card c1 = new Card();
		Card c2 = new Card();
		c1.kind = "Heart";
		c1.number = 4;
		
		c2.kind = "King";
		c2.number = 7;
		
		System.out.println("c1은"+ c1.kind + ","+c1.number+"이며, 크기는 (" + c1.width + "," + c1.hieght+")");
		System.out.println("c2은"+ c2.kind + ","+c2.number+"이며, 크기는 (" + c2.width + "," + c2.hieght+")");
		c1.width = 50;
		c1.hieght =80;
		
		
		
	}

}
