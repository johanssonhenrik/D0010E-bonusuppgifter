package bonusuppgift3;

public class Helicopter {
	private String callSign = "";
	private long rtX = 0L, rtY = 0L;
	private double distanceFlown = 0.0d;
	private boolean positionsljus;

	public Helicopter(String name) {
		callSign = name;
		positionsljus = false;
	}

	public void flyTo(long x, long y) {
		double dx = Math.abs(x - rtX);
		double dy = Math.abs(y - rtY);
		distanceFlown += 
			Math.sqrt(dx * dx + dy * dy);
		rtX = x;
		rtY = y;
	}

	public String callSign() {
		return callSign;
	}
	
	public long getX() {
		return rtX;
	}

	public long getY() {
		return rtY;
	}

	public double distanceFlown() {
		return distanceFlown;
	}
	public void turnOn(){
		positionsljus = true;
	}
	public void turnOff(){
		positionsljus = false;
	}
	public boolean lightIsOn(){
		return positionsljus;
	}
	public static void main(String[] args){
		Helicopter aChopper = new Helicopter("Chugga!");
		
		aChopper.flyTo(42,32);
		aChopper.turnOn();
		System.out.println("The helicopter "+aChopper.callSign()+" is at the location (x="+aChopper.getX()+",y="+aChopper.getY()+") and needs air support. Pronto!");
		System.out.println(aChopper.callSign()+" has currently flown a distance of, "+aChopper.distanceFlown()+ " and got the positionsljus set to "+aChopper.lightIsOn()+".");
	}
}