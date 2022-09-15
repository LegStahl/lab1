public class round {
	private int x;

	private int y;
	
	private int rad;

	public void setX(int a){
		x = a;
	}

	public int getX(){
		return x;
	}

	public void setY(int a){
		y = a;
	}

	public int getY(){
		return y;
	}
	
	public int getRad(){
		return rad;
	}
	
	public void setRad(int a){
		if(a < 0){
			rad = -a;
		}
		else{
			rad = a;
		}
	}

	public boolean check(int a, int b){
		

		if(rad==1){
			return false;
		}
		
		if(((a < x + rad) && ( a > x - rad)) && ((b < y + rad) && ( b > y - rad))){
			return true;
		}
		else{	
			return false;	
		}

	}
	
	public void zoom(int a){
		rad = rad * a;
	}
}