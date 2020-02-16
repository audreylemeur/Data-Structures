/*
 * Audrey Le Meur 
 * Lab #5
 * Section #7
 */
public class Sieve {
	
	boolean numbers[];
	
	Sieve(int max){
		
		if(max < 2){
			throw new IllegalArgumentException();
		}
		else{
			numbers = new boolean[max];
			numbers[0] = false;
			numbers[1] = false; 
			for(int i = 2; i < numbers.length; i++)numbers[i] = true;
		}

	}
	
	public void findPrimes(){
		for(int i = 2; i < numbers.length; i++){
			if (numbers[i]){
				for (int j = i; j < numbers.length; j += i){
					if(i != j)numbers[j] = false;
				}
			}
		}
	}
	
	public String toString(){
		String out = "";
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i]){
				out = out + i + " ";
			}
		}
		return out;
	}
}
	
