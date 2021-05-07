
public class ValidatePhone {

	public static void main(String[] args) {
		System.out.println(validatePhoneNum("1234567890"));
	}
	
	private static boolean validatePhoneNum(String phoneNo) {
		if (phoneNo.matches("\\d{10}")) 
			return true;
		else
			return false;
	}
}
