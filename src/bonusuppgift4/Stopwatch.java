package bonusuppgift4;

public class Stopwatch {

	private static boolean timerRunning;
	private static long timerTime;
	private static long timerStart;
	private static long timerStop;
	
//	public static void main(String[] args) {
//	double value = 0.99999999d;
//	long counter = 0;
//	
//	Stopwatch timerOne = new Stopwatch();
//	
//	System.out.println(timerOne.time());
//	while (Math.random() < value) {
//		counter = counter + 1;
//	}
//	System.out.println(timerOne.time());
//	
//	System.out.println("Antal loopvarv som krävdes innan Math.random() > "
//			+ value + ": " + counter);
//}
	
	public static void main(String[] args) {
		try {
			Stopwatch stopwatch = new Stopwatch();

			/* The indentation below is done only to clarify for the reader */
			/* It doesn't influence how the program executes */
			
			stopwatch.start();
					Thread.sleep(1000);
					System.out.println(stopwatch.time());
					Thread.sleep(400);
			System.out.println(stopwatch.time());

			stopwatch.stop();
					Thread.sleep(600);
					System.out.println(stopwatch.time());
					Thread.sleep(500);
			System.out.println(stopwatch.time());
			stopwatch.start();
					Thread.sleep(700);
					System.out.println(stopwatch.time());

			stopwatch.reset();
					Thread.sleep(500);	//+500
					System.out.println(stopwatch.time());
//------------------------------------------------------------------Print 0.
			stopwatch.start();
					Thread.sleep(500);	//+500
					//System.out.println(stopwatch.time()+" 1");
			stopwatch.stop();
					Thread.sleep(500);
					//System.out.println(stopwatch.time()+" 2");
			stopwatch.stop();
					Thread.sleep(500);
					//System.out.println(stopwatch.time()+" 3");
			stopwatch.start();
					Thread.sleep(500);	//+500
					//System.out.println(stopwatch.time()+" 4");
			stopwatch.start();
					Thread.sleep(500);	//+500
					//System.out.println(stopwatch.time()+" 5");
			stopwatch.stop();
					Thread.sleep(500);
					//System.out.println(stopwatch.time()+" 6");
			stopwatch.start();
					Thread.sleep(500);	//+500
					//System.out.println(stopwatch.time()+" 7");
										//2500
					
			System.out.println(stopwatch.time());
			System.out.println("END");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	Stopwatch(){
		timerRunning = false;
		timerTime = 0;
	}
	void start(){
		if(timerRunning && timerStart == 0){
			timerRunning = true;	//Do nothing.
		}else if(!timerRunning && timerStart == 0){	//Timer not running and this is the first time that it runs.
			timerRunning = true;
			timerStart = System.currentTimeMillis();
		}else if(!timerRunning && timerStart != 0){	//Timer not running but this isn't the first time it is being started.
			timerRunning = true;
			timerStart = System.currentTimeMillis();
		}else if(timerRunning && timerStart != 0){	//If timer is running and the timer have been running before. Do nothing.
			timerRunning = true;
		}
	}
	void stop(){
		if(!timerRunning && timerStart == 0){ //If the timer is not running and haven't been started before.
			timerRunning = false;	//Do nothing.
		}if(timerRunning && timerStart != 0){ // If the time is running and the time has been running before.
			timerRunning = false;
			timerStop = System.currentTimeMillis();
			timerTime = (System.currentTimeMillis() - timerStart) + timerTime;
					
		}else if(timerRunning){
			timerRunning = false;
			timerStop = System.currentTimeMillis();
			timerTime = System.currentTimeMillis() - timerStart;
		}
	}
	boolean isStarted(){
		if(timerRunning){
			return true;
		}else{
			return false;
		}
	}
	void reset(){
		timerStart = 0;
		timerStop = 0;
		timerTime = 0;
		timerRunning = false;
	}
	long time(){
		if(!timerRunning && timerStart == 0){	//If timer have never been started. Return 0. 
			return timerTime;// init value = 0.
		}
		if(!timerRunning && timerStart != 0){	//If the timer is not running but it got an earlier time.
			return timerTime;
		}
		if(timerRunning && timerStart == 0){
			return System.currentTimeMillis() - timerStart;
		}
		if(timerRunning && timerStart != 0){
			return System.currentTimeMillis() - timerStart + timerTime;
		}
	return 1;
	}
}
