package lambdas;

import java.util.function.Predicate;

public class PredicateTeste {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = (produc) -> (produc.preco*produc.desconto)<=1700;  
	
		Produto product1 = new Produto("Notebook", 3500.00, 0.50);
		
		System.out.println(isCaro.test(product1));
	
	
	}
}
