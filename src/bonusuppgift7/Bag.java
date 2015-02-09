package bonusuppgift7;

import bonusuppgift6.Pair;

public class Bag <E> implements Weighable {
	boolean empty;		//Bag empty?
	int weight;			//Weight of the bag.
	E content;			//Content of the bag.
	
	public static void main(String[] args) {
		
//		Pair<String,Integer> bagOne = new Pair<String, Integer>("iphone",25);
//		System.out.println(bagOne.fst());
//		System.out.println(bagOne.snd());
//		System.out.println(bagOne);
		
//		Bag bagTwo = new Bag();
//		System.out.println("empty:"+bagTwo.empty);
//		System.out.println("weight:"+bagTwo.weight);
//		bagTwo.fillBagWith(bagTwo.content, 3);
//		System.out.println(bagTwo.emptyBag());
//		System.out.println(bagTwo.weight());
	}
	public Bag(){
		this.empty = true;
		//this.content = (E) "test";
	}
	public void fillBagWith(E content, int weight){
		this.empty = false;
		this.content = content;
		this.weight = weight;
	}
	public Pair<E,Integer> emptyBag(){
		if(empty == false){
			return new Pair<E, Integer>(this.content,this.weight);
		}else{
			return new Pair<E,Integer>(null,0);
		}
	}
	public int weight(){
		return this.empty == true ? 0 : this.weight;
	}
}

//package bonusuppgift7;
//
//interface Weighable {
//	public static int weight(){		//Classes that implement this interface must have this method.
//		return 0;
//	}
//}
