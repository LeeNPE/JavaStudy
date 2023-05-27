package restudy7;
public class AutoGun extends Gun {
	private int autoSpeed;
	AutoGun() {}
	AutoGun(int autoSpeed, int speed, String bullet){// 형식 : (연사속도, 탄속, 탄종)
		super(speed, bullet);
		this.autoSpeed = autoSpeed;
	}
	int getAutoSpeed() { return autoSpeed; }
	void setAutoSpeed(int auto_) {
		this.autoSpeed = auto_;
	}

}
