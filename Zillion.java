/*
 * Audrey Le Meur
 * Lab #4
 * Lab Section #7
 */

public class Zillion {
	
	private int[] num;
	
	public Zillion(int size){
		num = new int[size];
	}
	
	
	public void increment(){
		num[num.length-1] += 1;
		for (int i = num.length - 1; i > 0; i--){
			if(num[i] == 10){
				num[i] = 0;
				num[i-1] += 1;
			}
		}
		if(num[0]>9) num[0] = 0;
	}
	
	public String toString(){
		String out = "";
		for (int i:num){
			out = out + i;
		}
		return out;
	}
}
