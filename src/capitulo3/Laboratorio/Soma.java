package capitulo3.Laboratorio;

public class Soma {
	// Atributos
	static int valor1;
	static int valor2;
	static int resultado;

	public static void main(String[] args) {
		valor1 = 10; // Atributo valor1 recebe literal 10;
		valor2 = 30; // Atributo valor2 recebe literal 30;
		resultado = valor1 + valor2; // Atributo resultado recebe a soma de
										// valor1 e valor2;
		
		System.out.println("Soma de " + valor1 + " + " + valor2 + " = "
				+ resultado); // Imprime na tela mensagem contanando o
								// resultado;
	}

}
