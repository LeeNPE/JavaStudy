package restudy7;

class Gun {
	Gun() {}
	
	private int speed;//탄속  
	private String bullet;// 탄종
	
	Gun(int speed, String bullet){
		this.speed = speed;
		this.bullet = bullet;
	}
	
	int getSpeed() { return speed; }
	String getBullet() { return bullet; }
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void setBullet(String bullet) {
		this.bullet = bullet;
	}
}
