package bonusuppgift8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class String2intArray {
	
	public static void main(String[] args) {
		str2ia("1222,, 2,3");
		str2ia("6,3  , 0,    8 ,9 , 1  3  , 45,3");
		str2ia("123");
		str2ia("");
		
		str2ia(",    2");
		str2ia("Ett,Två");
		str2ia("2,,2");
		str2ia("1 , 2 ,");
	}
	public static int[] str2ia(String s){
		
		String[] StringArray = new String[s.length()];	//Array that per default is filled with null values. I use this array later for producing the intArray.
		int index = 0;
		//ArrayList<String> list = new ArrayList<String>();
		
		try{
			if(s.length()!=0){
				Scanner scan2 = new Scanner(s);
				scan2.useDelimiter(" *, *");
				String b = scan2.next();
				System.out.println(b);
				if(b == "," || b == " " || b == "" || b.isEmpty()){
					scan2.close();
					throw new IllegalArgumentException("Two commas after each other");
				}
				//System.out.println(b);
				while(scan2.hasNext()){
					System.out.println(b);
					if(b == "," || b == " " || b == "" || b.isEmpty()){
						scan2.close();
						throw new IllegalArgumentException("Two commas after each other");
					}
					b = scan2.next();
				}
				scan2.close();
				System.out.println(b);
				if(b == "," || b == " " || b == "" || b.isEmpty()){
					throw new IllegalArgumentException("Two commas after each other");
				}
				
				Scanner scan = new Scanner(s);
				scan.useDelimiter(" *");
				System.out.println("Input s:("+s+") Delimeter Pattern("+scan.delimiter()+")");

				int StringArrayIndex = 0;
				String a = scan.next();
				while(scan.hasNext()){
					if(a.equals(",")){
						a = scan.next();
					}else if(scan.hasNextBigInteger()){
						while(scan.hasNextBigInteger()){
							a += scan.next();
						}
						StringArray[StringArrayIndex] = a;
						StringArrayIndex++;
						if(scan.hasNext()){
							a = scan.next();
						}else{
							a = ",";
							break;
						}
					}else{
						StringArray[StringArrayIndex] = a;
						StringArrayIndex++;
						a = scan.next();
					}
				}
				
				if(!a.equals(",")){
					StringArray[StringArrayIndex] = a;
				}
				scan.close();
				
			}else{
				System.out.println("Input s:("+s+") Length: 0");
				System.out.println(Arrays.toString(StringArray));
				System.out.println(" ");
				int[] intArrayEmpty = new int[s.length()];
				return intArrayEmpty;
			}
			System.out.println(Arrays.toString(StringArray));
			
			
			int answerArrayLengthCounter = 0;
			for(int i=0;i<StringArray.length;i++){
				if(StringArray[i]!=null){
					answerArrayLengthCounter++;
				}
			}
			
			index = answerArrayLengthCounter;
			int[] intArray = new int[answerArrayLengthCounter];
			
			for(int i=0;i<intArray.length;i++){
				intArray[i] = Integer.parseInt(StringArray[i]);
			}
			System.out.println(Arrays.toString(intArray));
			System.out.println(" ");
			
		}catch(IllegalArgumentException e){
			System.out.println(e);
			System.out.println(" ");
		}
		
		int[] intAnswerArray = new int[index];
		return intAnswerArray;
	}
}
