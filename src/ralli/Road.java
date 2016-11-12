package ralli;
public class Road{
	public static void main (String[] args){
		Car car = new Car();
		car.fill(100);
		car.showGas();
		
		Car mers = car;
		mers.drive(10);
		mers.showGas();
		}

	
	
}


