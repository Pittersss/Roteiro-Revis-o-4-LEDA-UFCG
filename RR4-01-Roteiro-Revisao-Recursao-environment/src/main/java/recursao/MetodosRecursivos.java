package recursao;

public class MetodosRecursivos {

	public int calcularSomaArray(int[] array, int fim)
	{
		int result = 0;
		// TODO ESCREVA AQUI O CÓDIGO (USANDO RECURSAO) PARA CALCULAR A SOMA
		// DOS EMENTOS DE UM ARRAY
		if (fim == 0)
		{
			return array[fim];
		}
		else
		{
			result += array[fim] + calcularSomaArray(array, fim - 1);
		}


		return result;
	}
	public long calcularFatorial(int n) {
		long result = 1;
		// TODO ESCREVA AQUI O CÓDIGO (USANDO RECURSAO) PARA CALCULAR E IMPRIMIR
		// O FATORIAL DO PARAMETRO
		// DE ACORDO COM O QUE FOI MOSTRADO NO EXERCCICIO. OBSERVE QUE SENDO O
		// METODO
		// RECURSIVO, O FATORIAL DOS NUMEROS ANTERIORES TAMBEM VAO SER IMPRESSOS

		if (n == 0 || n == 1)
		{
			return 1;
		}
		else
		{
			result += n * calcularFatorial(n-1);
		}
		
		return result;
	}

	public int calcularFibonacci(int n) {
		int result = 1;
		// TODO ESCREVA AQUI O CÓDIGO (USANDO RECURSAO) PARA CALCULAR E IMPRIMIR
		// O N-ESIMO TERMO
		// DA SEQUENCIA DE FIBONACCI, QUE TEM A SEGUINTE LEI DE FORMACAO: O
		// PRIMEIRO E SEGUNDO NUMEROS
		// DA SEQUENCIA SÃO 1. A PARTIR DO TERCEIRO TERMO, CADA TERMO DA
		// SEQUENCIA É DADO
		// PELA SOMA DOS OUTROS DOIS ANTERIORES. OBSERVE QUE SENDO O METODO
		// RECURSIVO, O FIBONACCI DOS NUMEROS ANTERIORES TAMBEM VAO SER
		// IMPRESSOS
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else{
			result = calcularFibonacci(n-1) + calcularFibonacci(n-2);
		}
		return result;
	}

	public int countNotNull(Object[] array, int fim) {
		int result = 0;
		// TODO IMPLEMENTE AQUI O CODIGO QUE CONTA (USANDO RECURSAO) A
		// QUANTIDADE DE ELEMENTOS NAO NULOS
		// DE UM ARRAY DE OBJETOS RECEBIDO COMO PARAMETRO
		if (fim == 0)
		{
			if (array[fim] != null)
				return 1;
			return 0;
		}
		else
		{
			if (array[fim] != null)
				result += 1 + countNotNull(array, fim - 1);
			else
				result += countNotNull(array, fim-1);
		}

		return result;
		
	}

	public long potenciaDe2(int expoente) {
		int result = 1;
		// TODO IMPLEMENTE (USANDO RECURSAO) O CODIGO PARA PRODUZIR A N-ESIMA
		// POTENCIA
		// DE 2

		switch (expoente) {
			case 0:
				return 1;
			case 1:
				return 2;
			default:
				 result =  (int) (2 * potenciaDe2(expoente-1));
				break;
		}

		return result;
	}

	public double progressaoAritmetica(double termoInicial, double razao, int n) {
		double result = 0;
		// TODO IMPLEMENTE SEU CODIGO (USANDO RECURSAO) DE ENCONTRAR O n-ESIMO
		// TERMO
		// DA PROGRESSAO ARITMETICA, DADO O TERMO INICIAL E A RAZAO
		// VOCE NAO PODE USAR A FORMULA QUE CALCULA O N-ESIMO TERMO. DEVE USAR RECURSAO
		if (n == 1)
		{
			return termoInicial;
		}
		else
		{
			result = razao + progressaoAritmetica(termoInicial, razao, n-1);
		}

		return result;
	}

	public double progressaoGeometrica(double termoInicial, double razao, int n) {
		double result = 1;
		// TODO IMPLEMENTE SEU CODIGO (USANDO RECURSAO) DE ENCONTRAR O n-ESIMO
		// TERMO
		// DA PROGRESSAO GEOMETRICA, DADO O TERMO INICIAL E A RAZAO
		// VOCE NAO PODE USAR A FORMULA QUE CALCULA O N-ESIMO TERMO. DEVE USAR RECURSAO
		
		if (n == 1)
		{
			return termoInicial;
		}
		else
		{
			result = razao * progressaoGeometrica(termoInicial, razao, n - 1);
		}
		return result;
	}
	
	
}
