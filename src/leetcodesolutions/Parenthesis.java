package leetcodesolutions;

public class Parenthesis {

	public static boolean isValid(String s) {
		String returned = "";
		
		while (s.length() > 0) {
			switch (s.charAt(0)) {
			case ')':
			case ']':
			case '}':
				return false;
			case '[':
				returned = findClosingParen(s.substring(1));
				if (returned.charAt(0) != ']')
					return false;
				break;
			case '{':
				returned = findClosingParen(s.substring(1));
				if (returned.charAt(0) != '}')
					return false;
				break;
			case '(':
				returned = findClosingParen(s.substring(1));
				if (returned.charAt(0) != ')')
					return false;
				break;
			default:
				return false;
				
			}
			s = returned.substring(1);
		}
		
		return true;
	}
	
	public static String findClosingParen(String s) {
		String returned = "";
		
		while (s.length() > 0) {
			switch (s.charAt(0)) {
			case ')':
			case ']':
			case '}':
				return s;
			case '[':
				returned = findClosingParen(s.substring(1));
				if (returned.charAt(0) != ']')
					return "falso";
				break;
			case '{':
				returned = findClosingParen(s.substring(1));
				if (returned.charAt(0) != '}')
					return "false";
				break;
			case '(':
				returned = findClosingParen(s.substring(1));
				if (returned.charAt(0) != ')')
					return "false";
				break;
			default:
				return "false";
			}
			s = returned.substring(1);
		}
		return "false";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isValid("()"));
	}

}
