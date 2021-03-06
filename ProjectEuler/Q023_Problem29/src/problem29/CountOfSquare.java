package problem29;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CountOfSquare {
	
	public int countOfSquare(){
		
		List<BigInteger> list = new LinkedList<BigInteger>();
		
		for(int i = 2; i <= 100; i++){
			BigInteger bi = BigInteger.valueOf(i);
			
			for(int j = 2; j <= 100; j++){
				
				bi = bi.multiply(BigInteger.valueOf(i));
				
				if(!list.contains(bi))
					list.add(bi);
			}
		}
		
		return list.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountOfSquare cos = new CountOfSquare();
		
		System.out.println(cos.countOfSquare());
	}

}
