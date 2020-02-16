class BinaryVsLinear  
{  
  private static int linearSearch(int key, int [] keys)  
  {  
	int count = 0;
    for(int i: keys){
    	count++;
    	if(key == keys[i]){
    		break;
    	}
    }
    return count;
  }  
  
  private static int binarySearch(int key, int [] keys)  
  {  
    int l = 0;
    int m;
    int r = keys.length - 1;
    int count = 0;
    while(true){
    	m = (r+l) / 2;
    	if(key < keys[m]){
    		count++;
    		r = m - 1;
    	}else if(key > keys[m]){
    		count += 2;
    		l = m + 1;
    	}else{
    		count++;
    		break;
    	}
    }
    return count;
  }  
  
  public static void main(String [] args)  
  {  
    for (int length = 1; length <= 30; length += 1)  
    {  
      int[] array = new int[length];  
      for (int index = 0; index < length; index += 1)  
      {  
        array[index] = index;  
      }  
  
      double linearTotal = 0.0;  
      double binaryTotal = 0.0;  
      for (int element = 0; element < length; element += 1)  
      {  
        linearTotal += linearSearch(element, array);  
        binaryTotal += binarySearch(element, array);  
      }  
  
      double linearAverage = linearTotal / length;  
      double binaryAverage = binaryTotal / length;  
      System.out.println(length + " " + linearAverage + " " + binaryAverage);  
    }  
  }  
}