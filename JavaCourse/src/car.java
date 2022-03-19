
public class car {

	   int speed;
	   String staring;
	   String doors;
	   
	   
	/*public car(int speed, String staring, String doors) {
		super();
		this.speed = speed;
		this.staring = staring;
		this.doors = doors;
	}*/

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getStaring() {
		return staring;
	}

	public void setStaring(String staring) {
		this.staring = staring;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        car c1=new car();
        c1.setSpeed(80);
        c1.setStaring("cl");
        System.out.println(c1.getSpeed());
        System.out.println(c1.getStaring());
	}

}
