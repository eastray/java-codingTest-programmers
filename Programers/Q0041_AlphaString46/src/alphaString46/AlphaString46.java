package alphaString46;

public class AlphaString46 {

	public boolean alphaString46(String str) {
		
		if (str.length() == 4 || str.length() == 6) {
			
			for (char ele : str.toLowerCase().toCharArray())
				if ((int) ele < 48 || (int) ele > 57)
					return false;
			
		} else
			return false;

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlphaString46 as = new AlphaString46();

		System.out.println(as.alphaString46("a123"));
		System.out.println(as.alphaString46("1234"));
		System.out.println(as.alphaString46("123456"));

	}
}
