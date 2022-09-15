public class Main{
	public static void main(String [] args){
		Int a = new Int();
		a.increment();
		Int b = new Int();
		b.increment();
		for(int i = 0; i < 10; i++){
			a.add(a);
		}
		for(int i = 0; i < 24; i++){
			a.decrement();
		}
		
		System.out.println(a);
		a.add(a);
		System.out.println(a);
	}
}