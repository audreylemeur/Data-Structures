/*
 * Audrey Le Meur
 * Lab #8
 * Section 7
 */
class RunnyStack<Base>  
{  
	Run top;
	int runs;
	int depth;
	
	private class Run {
		Base base;
		int length;
		Run next;
		private Run(Base b,int l,Run n){
			base = b;
			length = l;
			next = n;
		}
	}

	
	public RunnyStack(){
	  top = null;
  	}
	
	
	public int depth(){
		return depth;
	}
	
	private boolean isEqual(Base one, Base two){
		if((one == null || two == null) && one == two) return true;
		else if(one.equals(two))return true;
		else return false;
	}
	
	public boolean isEmpty(){
		return top == null;		
	}
	
	public Base peek(){
		if(isEmpty()){
			throw new IllegalStateException();
		}else{
			return top.base;
		}
	}
	
	public void pop(){
		if(isEmpty()){
			throw new IllegalStateException();
		}else{
			top.length -= 1;
			if (top.length <= 0){
				top = top.next;
				runs -= 1;
			}
		}
		depth -= 1;
	}
	
	public void push(Base base){
		if(isEmpty()){
			top = new Run(base, 1, null);
			runs += 1;
		}else if(isEqual(base, top.base)){
			top.length += 1;
		}else{
			top = new Run(base,1,top);
			runs += 1;
		}
		depth += 1;
	}
	
	
	public int runs(){
		return runs;	
	}
	
}