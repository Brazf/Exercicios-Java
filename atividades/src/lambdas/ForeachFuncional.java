package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForeachFuncional {
	
	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("Fábio", "Ana", "Claudia", "Romário");
		
		System.out.println("ForEach clássico");
		for (String i : lista) {
			System.out.println(i);
		}
		
		System.out.println();	
		
		System.out.println("ForEach Lambda #1");
		lista.forEach( (i) -> System.out.println(i));
		
		System.out.println();
		
		System.out.println("ForEach Methods #1");
		lista.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("ForEach Lambda #2");
		lista.forEach(i -> exibir(i));
		
		System.out.println();
		
		System.out.println("ForEach Methods #2");
		lista.forEach(ForeachFuncional::exibir);
		
	}
	
	static void exibir(String nome) {
		System.out.println("Meu nome é:"+ nome);
	}
}
