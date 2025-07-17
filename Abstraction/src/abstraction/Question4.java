
package abstraction;

class InvalidCountryException extends Exception{
	public InvalidCountryException(String msg) {
		super(msg);
	}
}

public class Question4 {
	
	public void registerUser(String userName,String userCountry) throws InvalidCountryException {
		if(!userCountry.equalsIgnoreCase("India")) {
			throw new InvalidCountryException("User Outside India cannot be registered");
		}else {
			System.out.println("User registration done successfully");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question4 ur=new Question4();
		try {
			ur.registerUser("Sameer","india");
		}
		catch(InvalidCountryException e){
			System.out.println("InvalidCountryException: "+e.getMessage());
		}

		try {
			ur.registerUser("sam","us");
		}
		catch(InvalidCountryException e){
			System.out.println("InvalidCountryException: "+e.getMessage());
		}
	}

}
