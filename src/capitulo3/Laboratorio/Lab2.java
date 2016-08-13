package capitulo3.Laboratorio;

/*
 * Usando Operando Ternario:
 * Sintaxe:
 * <variavelOuContante> = <testeLogico> ? <valorSeVerdadeiro> : <valorSeFalso>;
 */

public class Lab2 {
	static int valor = 28;
	static String resultado;

public static void main(String[] args) {
	 resultado = valor % 2 == 0 ? "PAR" : "IMPAR";
	System.out.println("O valor " + valor + "é um número " + resultado);
}

}
