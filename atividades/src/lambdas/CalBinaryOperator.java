package lambdas;

import java.util.function.BinaryOperator;

public class CalBinaryOperator {
	
	public static void main(String[] args) {
		

		BinaryOperator<Integer> somarBi = (a,b) -> a+b;
		
		System.out.println(somarBi.apply(15, 25));
	
	}
}
