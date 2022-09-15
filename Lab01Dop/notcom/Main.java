public class Main{
	public static void main(String [] args){
		round a = new round();
		a.setX(4);
		a.setY(0);
		a.setRad(4);
		a.zoom(2);
		if(a.check(5, -4)){
			System.out.println("Point is inside");
		}
		else{
			System.out.println("Point isn't inside");
		}
		

	}

}