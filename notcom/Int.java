public class Int{
	private int number;

	public void set(int a){
		number = a;
	}

	public int get(){
		return number;
	}

	public int increment(){
		number++;
		return number;
	}
	
	public int decrement(){
		number--;
		return number;
	}

	public int add(Int a){
		number += a.get();
		return number;
	}

	public int substract(Int a){
		number -= a.get();
		return number;
	}
	public String toString(){
		return "" + number;
	}
}

	
	


