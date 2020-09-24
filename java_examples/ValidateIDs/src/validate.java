
public class validate {

	public static void main(String[] args) {

		String SSN = "11111111";
		String code = "12345";
		if(validSNN(SSN)) {
			System.out.println(SSN+" is Valid SSN");
		}else {
			System.out.println(SSN+" is not Valid SSN");
		}
		if(validAreaCode(code)) {
			System.out.println(code+" is Valid Area Code");
		}else {
			System.out.println(code+" is not Valid Area Code");
		}
		
	}
	public static boolean validSNN(String ssn) {
		if(ssn.matches("(\\d{8})"))
		return true;
			
	else {
	return false;
	}
}
	
	public static boolean validAreaCode(String code) {
		if(code.matches("(\\d{5})"))
		return true;
			
	else {
	return false;
	}
}
	}
