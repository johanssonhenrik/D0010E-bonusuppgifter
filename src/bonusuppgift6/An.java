package bonusuppgift6;

public class An {
	private static int K;
	private static int L;
	
	//K_n=(L_(n-1))/2 & L_n=K_(n-1)
	//K_1=(L_(1-1))/2 & L_1=K_(1-1)
	//		*				**
	
	//*Alltså Storleken på a1:s kortsida är lika med a0:s halva långsida.
	//** Storleken på a1:s lång sida är lika med a0:s kortsida.
	
	public static Pair<Integer,Integer> a(int n){
		if(n>0){
			K=k(n);
			L=l(n);
			return new Pair<Integer,Integer> (L,K);	//Returnera som par. (Nytt Pair med typ parametrar <Integer Integer>)
		}
		K=k(0);
		L=l(0);
		return new Pair<Integer,Integer> (L,K);	//Returnera som par.
	}
	public static int k(int n){
		//System.out.println("K="+K+" ");
		//System.out.println(n);
		if(n==0){return 841;}
		else{return (l(n-1)/2);}
	}
	public static int l(int n){
		//System.out.println("L="+L);
		//System.out.println(n);
		if(n==0){return 1189;}
		else{return k(n-1);}
	}
	public static void main(String[] args) {
		for(int i=0;i<20;i++){
			System.out.println("a"+i+"= "+a(i));
		}
	}
	
//	/**
//	 * @author hj
//	 */
//	public class Pair<A, B> {
//		private A first;
//		private B second;
//
//		public Pair(A first, B second) {
//			this.first = first;
//			this.second = second;
//		}
//
//		public A fst() {
//			return first;
//		}
//
//		public B snd() {
//			return second;
//		}
//
//		public Pair<B, A> mirror() {
//			return new Pair<B, A>(snd(), fst());
//		}
//
//		public String toString() {
//			return "(" + fst() + "," + snd() + ")";
//		}
//	}
}
