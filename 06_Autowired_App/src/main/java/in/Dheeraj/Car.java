package in.Dheeraj;

public class Car {
	
	private DieselEngine dieselEngine;
	
	public void setDieselEngine(DieselEngine dieselEngine) {
		this.dieselEngine = dieselEngine;
	}
	
	
	public void drive() {
		int status = dieselEngine.start();
		if(status >=1) {
			System.out.println("Journey Started...");
		}
		else {
			System.out.println("Journey Failed");
		}
		
	}
}
