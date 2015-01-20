package bonusuppgift2;

public class Temp {
	
	public static void main(String[] args) {
		int i;
		for(i=40; i>=-40; i=i-5){
			System.out.print(i+"°F is ");
			System.out.println(f2c(i)+"°C");
		};
	}
	
	public static double f2c(double f){
		double x;
		x = 5.0/9.0*(f-32);
		f = java.lang.Math.rint(x*10.0d)/10.0d;
		return f;
	}
}//Henrik Johansson ehioja-0 2015-01-19
