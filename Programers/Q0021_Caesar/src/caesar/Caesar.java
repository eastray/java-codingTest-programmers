package caesar;

public class Caesar {

	private String caesar(String s, int n) {

		String result = "";
		n %= 26;
		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {

				int initTemp = (Character.isUpperCase(charArray[i])) ? 65 : 97;
				
				charArray[i] = (char) ((charArray[i] - initTemp + n) % 26 + initTemp);

			}

			result += charArray[i];

		}

		return result;
	}

	String caesar2(String s, int n) {
		String result = "";
		n %= 26;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
				
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}

			result += ch;
		}
		return result;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
		System.out.println("s는 'a B c D', n은 4인 경우: " + c.caesar("a B c D", 4));
		System.out.println("s는 'GJgEQpMnVPbahEoG  ozcS dMQOVwBYDMIEHQNGAJjhTLelPn ', n은 44인 경우: "
				+ c.caesar("GJgEQpMnVPbahEoG  ozcS dMQOVwBYDMIEHQNGAJjhTLelPn ", 44));
		System.out.println("s는 'G', n은 44인 경우: " + c.caesar("G", 44));
		System.out.println("s는 'IY JDjHaMnXhQNjnkviHdlQYeb WJnKOlfmetanuZUD OKEYIx', n은 33인 경우: "
				+ c.caesar("IY JDjHaMnXhQNjnkviHdlQYeb WJnKOlfmetanuZUD OKEYIx", 33));

		System.out.println();

		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar2("a B z", 4));
		System.out.println("s는 'a B c D', n은 4인 경우: " + c.caesar2("a B c D", 4));
		System.out.println("s는 'GJgEQpMnVPbahEoG  ozcS dMQOVwBYDMIEHQNGAJjhTLelPn ', n은 44인 경우: "
				+ c.caesar2("GJgEQpMnVPbahEoG  ozcS dMQOVwBYDMIEHQNGAJjhTLelPn ", 44));
		System.out.println("s는 'G', n은 44인 경우: " + c.caesar2("G", 44));
		System.out.println("s는 'IY JDjHaMnXhQNjnkviHdlQYeb WJnKOlfmetanuZUD OKEYIx', n은 33인 경우: "
				+ c.caesar2("IY JDjHaMnXhQNjnkviHdlQYeb WJnKOlfmetanuZUD OKEYIx", 33));

	}

}
