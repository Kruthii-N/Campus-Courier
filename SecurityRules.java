package transport;

public final class SecurityRules {
	private SecurityRules() { }
	
	public static boolean canFly(String place ) {
		if (place.equalsIgnoreCase("ExamCell")) {
		return false;
		
	}
 	return true;
}
	}


