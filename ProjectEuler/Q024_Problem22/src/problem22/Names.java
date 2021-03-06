package problem22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Names {
	
	public void sumNames(String str){
		String[] strArr = str.split(",");
		
		Arrays.sort(strArr);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(String ele : strArr){
			int sum = 0; 
			char[] charEle = ele.toCharArray();
			
			for(int i = 0; i < ele.length(); i++)
				sum += charEle[i] - 64;
			
			list.add(sum);
		}
		
		BigInteger result = BigInteger.ZERO;
		
		for(int i = 0; i < list.size(); i++)
			result = result.add(BigInteger.valueOf(list.get(i)).multiply(BigInteger.valueOf(i+1)));
		
		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader reader = new FileReader(new File("/Users/dhkim/Workspaces/java/java-codingTest/ProjectEuler/Q024_Problem22/src/problem22/names.txt"));
		BufferedReader buffer = new BufferedReader(reader);
		
		String str = buffer.readLine();
		str = str.replaceAll("\"","");
		
		System.out.println(str);
		
		Names sn = new Names();
		
		sn.sumNames(str);
	}

}
