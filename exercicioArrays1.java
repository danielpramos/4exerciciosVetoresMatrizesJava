package pacoteVetoresMatrizes4;

import java.util.Scanner;

public class exercicioArrays1 
{

	public static void main(String[] args) 
	{
		/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
		inteiros. O programa deve executar os seguintes passos:
		(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
		A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
		(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
		(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

		
		int[] A = new int[6];
		
		int somaP = 0, cont;
		
		Scanner leia = new Scanner(System.in);
		
		for(cont = 0; cont < 6; cont ++) //vetores pra add: 1, 0, 5, -2, -5, 7.
		{
			System.out.printf("Digite o valor do vetor %d : ",cont + 1);
			A[cont] = leia.nextInt();
			//somaP = A[0] + A[1] + A[2];
			
		}
		
		
		somaP = A[0] + A[1] + A[5];
		
		System.out.printf("\nA soma dos vetores A[0], A[1], A[5] � %d ", somaP);
		System.out.printf("\n\nDigite o valor do novo do vetor 4: ");
		A[4] = leia.nextInt(); // Adicionar valor 100
		System.out.printf("\nVetores em linha  ");
		
		
		for(cont = 0; cont < 6; cont ++)
		{
			System.out.printf("\nVetor %d = \t  [ %d ] \t ",cont + 1 ,A[cont]);
		}

	}

}
