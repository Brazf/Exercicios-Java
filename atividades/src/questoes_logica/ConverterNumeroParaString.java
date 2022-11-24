package questoes_logica;

public class ConverterNumeroParaString {

	public static void main(String[] args) {
		
		Integer numInteger = 1;
		String numStr = numInteger.toString();
		
		int numInt = 2;
		String numStr2 = Integer.toString(numInt);
		
		// USANDO WRAPPER
		System.out.println("USANDO WRAPPER");
		System.out.println(numStr.getClass().getSimpleName());

		// USANDO TIPO PRIMITIVO
		System.out.println("USANDO TIPO PRIMITIVO");
		System.out.println(numStr2.getClass().getSimpleName());
		
	}
}
