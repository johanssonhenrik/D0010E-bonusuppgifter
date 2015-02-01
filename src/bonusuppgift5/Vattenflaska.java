package bonusuppgift5;

public class Vattenflaska {
	private String �gare;
	private int kapacitet;
	private int amountOfLiquid = 0;
	
	public static void main(String[] args){
		Vattenflaska bottleOne = new Vattenflaska("Roger",1000);
		System.out.println("[Status] "+bottleOne);								//toString method is used default setting.
		System.out.println("[Fyller] "+bottleOne.fillUp(33));
		//System.out.println(bottleOne.content());
		System.out.println("[Fyller] "+bottleOne.fillUp(980));
		System.out.println("[Status] "+bottleOne);
		System.out.println("[T�mmer] "+bottleOne.emptyOut(40));
		//System.out.println(bottleOne.capacity());
		//System.out.println(bottleOne.content());
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		
		Vattenflaska bottleTwo = new Vattenflaska("Emma",500);
		System.out.println("[Status] "+bottleTwo);
		System.out.println("[Fyller] "+bottleTwo.fillUp(234));
		System.out.println("[T�mmer] "+bottleTwo.emptyOut(-3));
		System.out.println("[T�mmer] "+bottleTwo.emptyOut(72));
		System.out.println("[T�mmer] "+bottleTwo.emptyOut(999));
	}
	public Vattenflaska(String owner, int capacity){
		kapacitet = capacity;
		�gare = owner;
	}
	
	public int capacity(){
		return kapacitet;
	}
	public int content(){
		return amountOfLiquid;
	}
	public String fillUp(int amountToFill){
		if((amountOfLiquid + amountToFill)<kapacitet){
			amountOfLiquid += amountToFill;
			return "Fyller upp "+�gare+"s flaska med "+amountToFill+"ml.";
		};
		amountOfLiquid = kapacitet;
		return "Fyller p� "+�gare+"s flaska med "+amountToFill+". Tyv�rr rinner det �ver lite. Nu �r flaskan full";
	}
	public String emptyOut(int amountToEmptyOut){
		if((amountOfLiquid - amountToEmptyOut)<0){	//Return value if you pour out more liquid than there is in the bottle.
			amountOfLiquid = 0;
			return "T�mmer ut "+�gare+"s flaska. "+amountOfLiquid+"ml finns kvar.";
		}if((amountOfLiquid - amountToEmptyOut)>0 && amountToEmptyOut>0){
			amountOfLiquid -= amountToEmptyOut;
			return "T�mmer ut "+amountToEmptyOut+"ml. "+�gare+"s flaska inneh�ller nu "+amountOfLiquid+"ml.";
		}
		else{
			return "Kan inte t�mma ut ett negativ v�rde.";
		}
	}
	public String toString(){
		String printKapacitet = String.valueOf(kapacitet);
		String printAmountOfLiquid = String.valueOf(amountOfLiquid);
		return �gare+"s flaska kan ineh�lla max "+printKapacitet+"ml och inneh�ller nu "+printAmountOfLiquid+"ml.";
	}
	
}
