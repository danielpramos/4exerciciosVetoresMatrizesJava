package pacoteVetoresMatrizes4;

import java.util.Scanner;

public class exercicioArrays2 
{

	public static void main(String[] args) 
	{
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
			� Os n�meros pares digitados;
			� A soma dos n�meros pares digitados;
			� Os n�meros �mpares digitados;
			� A quantidade de n�meros �mpares digitados.*/
		
		int[] array = new int[6];
		
		int somaPar = 0,quantPar = 0, quantImpar  = 0,somaImpar = 0, cont;
		
		Scanner leia = new Scanner(System.in);
		
		for(cont = 0; cont < 6; cont ++)
		{
			System.out.printf("Digite o %d� valor do vetor: ",cont + 1);
			array[cont] = leia.nextInt();
			
		}
		System.out.printf("\n==============================================================");
		for(cont = 0; cont < 6; cont ++)
		{
			if(array[cont] % 2 == 0)
			{
				System.out.printf("\nFoi digitado par no vetor [%d] com valor de %d", cont + 1, array[cont]);
				somaPar += array[cont];	
				quantPar ++ ;
			}
			else
			{
				System.out.printf("\nFoi digitado impar no vetor [%d] com valor de %d", cont + 1, array[cont]);
				somaImpar += array[cont];
				quantImpar ++ ;
			}
			
		}
		System.out.printf("\n==============================================================");
		
		System.out.printf("\n\n==============================================================");
		System.out.printf("\nForam digitados %d vezes um valor par. ", quantPar);
		System.out.printf("\nForam digitados %d vezes um valor impar. ", quantImpar);
		System.out.printf("\n==============================================================");
		System.out.printf("\n\n==============================================================");
		System.out.printf("\nA soma dos pares digitados � %d ", somaPar);
		System.out.printf("\nA soma dos impares digitados �  %d ", somaImpar);
		System.out.printf("\n==============================================================");

	}

}
