package bonusuppgift5;

public class Vattenflaska {
	private String ägare;
	private int kapacitet;
	private int amountOfLiquid = 0;
	
	public static void main(String[] args){
		Vattenflaska bottleOne = new Vattenflaska("Roger",1000);
		System.out.println("[Status] "+bottleOne);								//toString method is used default setting.
		System.out.println("[Fyller] "+bottleOne.fillUp(33));
		//System.out.println(bottleOne.content());
		System.out.println("[Fyller] "+bottleOne.fillUp(980));
		System.out.println("[Status] "+bottleOne);
		System.out.println("[Tömmer] "+bottleOne.emptyOut(40));
		//System.out.println(bottleOne.capacity());
		//System.out.println(bottleOne.content());
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		
		Vattenflaska bottleTwo = new Vattenflaska("Emma",500);
		System.out.println("[Status] "+bottleTwo);
		System.out.println("[Fyller] "+bottleTwo.fillUp(234));
		System.out.println("[Tömmer] "+bottleTwo.emptyOut(-3));
		System.out.println("[Tömmer] "+bottleTwo.emptyOut(72));
		System.out.println("[Tömmer] "+bottleTwo.emptyOut(999));
	}
	public Vattenflaska(String owner, int capacity){
		kapacitet = capacity;
		ägare = owner;
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
			return "Fyller upp "+ägare+"s flaska med "+amountToFill+"ml.";
		};
		amountOfLiquid = kapacitet;
		return "Fyller på "+ägare+"s flaska med "+amountToFill+". Tyvärr rinner det över lite. Nu är flaskan full";
	}
	public String emptyOut(int amountToEmptyOut){
		if((amountOfLiquid - amountToEmptyOut)<0){	//Return value if you pour out more liquid than there is in the bottle.
			amountOfLiquid = 0;
			return "Tömmer ut "+ägare+"s flaska. "+amountOfLiquid+"ml finns kvar.";
		}if((amountOfLiquid - amountToEmptyOut)>0 && amountToEmptyOut>0){
			amountOfLiquid -= amountToEmptyOut;
			return "Tömmer ut "+amountToEmptyOut+"ml. "+ägare+"s flaska innehåller nu "+amountOfLiquid+"ml.";
		}
		else{
			return "Kan inte tömma ut ett negativ värde.";
		}
	}
	public String toString(){
		String printKapacitet = String.valueOf(kapacitet);
		String printAmountOfLiquid = String.valueOf(amountOfLiquid);
		return ägare+"s flaska kan inehålla max "+printKapacitet+"ml och innehåller nu "+printAmountOfLiquid+"ml.";
	}
	
}
