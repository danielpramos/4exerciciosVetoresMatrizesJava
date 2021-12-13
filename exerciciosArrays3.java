package pacoteVetoresMatrizes4;

import java.util.Scanner;

public class exerciciosArrays3 
{

	public static void main(String[] args) 
	{
		// 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		 
		int[][] matriz = new int[3][3];
		
		int linha, coluna, maior10 = 0, menor10 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0; linha < 3; linha ++)
		{
			for(coluna = 0; coluna <3; coluna ++)
			{
				System.out.printf("Insira o valor da matriz de posição [%d] [%d]: ",linha + 1, coluna + 1);
				matriz[linha][coluna] = leia.nextInt();
				
				if(matriz[linha][coluna] > 10)
				{
					maior10 ++;
				}
				else
				{
					menor10 ++;
				}
			}
		}
		System.out.printf("\n==============================================================");
		System.out.printf("\nForam digitados %d vezes um valor maior que 10. ",maior10);
		System.out.printf("\nForam digitados %d vezes um valor menor que 10. ",menor10);
		System.out.printf("\n==============================================================");
	}

}
