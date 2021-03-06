package isPair;

public class IsPair {

	public boolean isPair(String str) {

		boolean result = true;

		if (str.length() == 0)
			return result;

		if (!str.startsWith("(") || !str.endsWith(")"))
			return !result;

		for (int i = 1; i <= str.length() - 1; i++) {

			if (str.charAt(i) == '(')
				return false;

			if (str.charAt(i) == ')')
				return isPair(str.substring(i + 1, str.length()));
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IsPair ip = new IsPair();

		System.out.println(ip.isPair("(asd)()"));
		System.out.println(ip.isPair("(abcd)(sdsd)(sdfds()"));
		System.out.println(ip.isPair("(abcd)(sdsd)(sdfds)()"));
		System.out.println(ip.isPair("(abcd)sdsd(sdfds)()"));
		System.out.println(ip.isPair("(abcd)sds())()()d(sdfds)()"));
		System.out.println(ip.isPair(")("));

	}

}
