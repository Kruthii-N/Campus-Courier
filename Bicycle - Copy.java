package transport;

public abstract class Bicycle extends Vehicle {

	public Bicycle(String id) {
		super(id);
	
		// TODO Auto-generated constructor stub
		System.out.println("Bicycle() constructer called");
	
	}
	@Override
	public void deliver(String item, String place ) {
		System.out.println("Delivering " + item+ " to " +place + " by Bicycle.");
	}

}
