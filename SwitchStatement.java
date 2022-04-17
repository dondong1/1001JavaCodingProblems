package testing;

public class SwitchStatement {
	private static int getValueBefore12(String mode) {
		int result;
			switch(mode) {
			case "a":
			case "b":
				result = 1;
				break;
			case "c":
				result = 2;
				break;
			case "d":
			case "e":
			case "f":
				result = 3;
				break ;
			default:
				result = -1;
			
			};
			
			return result;
	}
	// Java 12, multiple comma-separated labels
	private static int getValueMultipleLables(String mode) {
		int result;
		switch (mode) {
		case "a", "b":
			result = 1;
			break;
	
		case "c":
			result = 2;
			break;
		case "d", "e", "f":
			result = 3;
		break;
		default:
			result = -1;
	
		};
	return result;
	}
	
	//Java 13, value breaks are superseded by "yield" statements
	//java 12, switch expression returning value via break
	
	//Java 12, switch expression returning value via lable rules (arrow)
	private static int getValueViaArraow(String mode) {
		int result = switch(mode ) {
		case "a", "b" -> 1;
		case "c" -> 2;
		case "d", "e", "f" -> 3; 
		default -> -1;
		};
		return result;
	}
	
	//java 13, switch expression returning value via yield
private static int getValueViaYield(String mode) {
		int result = switch (mode) {
		case "a", "b":
			yield  1;
		case "c":
			yield 2;
		case "d", "e", "f":
			yield 3;
		default:
			yield -1;
	
		};
	return result;
	}
	public static void main(String[] args) {
		String mode;
		System.out.println(getValueViaYield(mode= "a"));
	}

}
