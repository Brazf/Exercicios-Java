package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = (product) -> System.out.println(product.nome);
		
		Produto p1 = new Produto("Smartphone", 1500.00, 0.10);
		imprimir.accept(p1);
		Produto p2 = new Produto("Notebook", 2700.00, 0.30);
		Produto p3= new Produto("Bicicleta", 1200.00, 0.45);
		Produto p4= new Produto("Relógio", 600.00, 0.12);
		Produto p5= new Produto("Tênis", 250.00, 0.35);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(System.out::println);
		produtos.forEach(nome -> System.out.println(nome.nome));
	}
}
