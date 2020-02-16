/*
 * Audrey Le Meur 
 * Lab #7
 * Section #7
 */

public class Map<Key, Value> {
	Key keys[];
	Value values[];
	int count;
	
	public Map(int length){
		if(length < 0) throw new IllegalArgumentException();
		else{
			keys = (Key[])new Object[length];
			values = (Value[])new Object[length];
			count = 0;
		}
	}

	public Value get(Key key){
		int address = where(key);
		if (address == -1) throw new IllegalArgumentException();
		return (Value)values[address];
	}

	private boolean isEqual(Key leftKey, Key rightKey){
		if (leftKey == null && rightKey == null)return true;
		else if (leftKey == null || rightKey == null)return false;
		//System.out.println("--" + rightKey.equals(leftKey));
		return rightKey.equals(leftKey);
	}

	public boolean isIn(Key key){
		int address = where(key);
		return (address != -1);
	}

	public void put(Key key, Value value){
		int address = where(key);
		if (address != -1){
			values[address] = value;
		}else if(count < values.length ){
			keys[count] = key;
			values[count] = value;
			count++;
		}else {
			throw new IllegalStateException();
		}
		//System.out.println(count);
	}


	private int where(Key key){
		int address = -1;
		for (int i = 0; i < count; i++){
			if(isEqual((Key)keys[i], key)){
				address = i;
				break;
			}
		}
		return address;
	}
}
