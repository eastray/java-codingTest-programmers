package jadenCase;

import java.util.Arrays;

public class JadenCase {

	public String jadenCase(String str) {

		String[] strArray = str.split("\\s");
		String result = Character.toUpperCase(strArray[0].charAt(0)) + strArray[0].substring(1, strArray[0].length());

		if (strArray.length == 1)
			return result;

		return result + " " + jadenCase(str.substring(strArray[0].length() + 1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JadenCase jc = new JadenCase();

		System.out.println(jc.jadenCase("yes i can do"));
		System.out.println(jc.jadenCase("a b c d e f"));
		System.out.println(jc.jadenCase("3people unfollowed me for the last week"));
		System.out.println(jc.jadenCase(
				"More than a decade after its introduction, REST has become one of the most important technologies for Web applications. Its importance is likely to continue growing quickly as all technologies move towards an API orientation."));
		System.out.println(jc.jadenCase(
				"While REST stands for Representational State Transfer, which is an architectural style for networked hypermedia applications, it is primarily used to build Web services that are lightweight, maintainable, and scalable. A service based on REST is called a RESTful service. REST is not dependent on any protocol, but almost every RESTful service uses HTTP as its underlying protocol. In this article, I examine the creation of RESTful services with HTTP."));

	}

}
