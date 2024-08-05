package in.Dheeraj;

public class Car {
	void drive() {
		//Creating one class object and using that object in another class is called as composition.
		//This is not the best practice to use one class into other as it increases dependency.
		Engine e = new Engine();
		int status = e.start();
		
		if(status>=1) {
			System.out.println("Journey Started...");
		}

		else {
			System.out.println("Engine having some problem...");
		}
	}
}
