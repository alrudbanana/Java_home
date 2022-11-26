package javajungsuk;

public class Car01 {
	//필드 선언
	private int speed;
	private boolean stop;
	
	
	
	
	
	//Getter와 Setter 
	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		
		if(speed <  0) {
			this.speed = 0;
		}else {
			this.speed = speed;
		}
		this.speed = speed;
	}


	public boolean isStop() {
		return stop;
	}


	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop) {
			this.speed = 0;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
