package pacoteVetoresMatrizes4;

import java.util.Scanner;

public class exercicioArrays4 
{

	public static void main(String[] args) 
	{
		/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
		menu de opções:
		(1) somar as duas matrizes
		(2) subtrair a primeira matriz da segunda
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
		da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
		própria matriz*/
		
		int[][] matriz = new int[2][2];
		int[][] matriz1 = new int[2][2];
		int[][] somaMatriz = new int[2][2];
		int[][] subtracaoMatriz = new int[2][2];
		
		int linha, coluna = 0, opcao;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0; linha < 2; linha ++)
		{
			for(coluna = 0; coluna < 2; coluna ++)
			{
				System.out.printf("Insira o valor da 1° matriz de posição [%d] [%d]: ",linha + 1, coluna + 1);
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		System.out.printf("\n");
		
		for(linha = 0; linha < 2; linha ++)
		{
			for(coluna = 0; coluna < 2; coluna ++)
			{
				System.out.printf("Insira o valor da 2° matriz de posição [%d] [%d]: ",linha + 1, coluna + 1);
				matriz1[linha][coluna] = leia.nextInt();
			}
		}
		System.out.printf("\n\n Escolha uma das opçôes abaixo");
		System.out.printf("\n 1) somar as duas matrizes");
		System.out.printf("\n 2) subtrair a primeira matriz da segunda");
		System.out.printf("\n 3) adicionar uma constante as duas matrizes");
		System.out.printf("\n 4) imprimir as matrizes");
		System.out.printf("\n\nQual opção deseja? : ");
		opcao = leia.nextInt();
		
		while(opcao <= 0 || opcao > 4)
		{
			System.out.printf("\nOpção invalida");
			System.out.printf("\n\n Escolha uma das opçôes abaixo");
			System.out.printf("\n 1) somar as duas matrizes");
			System.out.printf("\n 2) subtrair a primeira matriz da segunda");
			System.out.printf("\n 3) adicionar uma constante as duas matrizes");
			System.out.printf("\n 4) imprimir as matrizes");
			System.out.printf("\n\nQual opção deseja? : ");
			opcao = leia.nextInt();
			
		}
			
		
		if(opcao == 1)
		{
			System.out.printf("\n A soma das duas matrizes :");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				
				for(coluna = 0; coluna < 2; coluna ++)
				{
					somaMatriz[linha][coluna] = matriz[linha][coluna] + matriz1[linha][coluna];
					System.out.printf("\t %d \t",somaMatriz[linha][coluna]);
				}
			}
		}
		else if(opcao == 2)
		{
			System.out.printf("\n A subtração das duas matrizes :");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				
				for(coluna = 0; coluna < 2; coluna ++)
				{
					subtracaoMatriz[linha][coluna] = matriz[linha][coluna] - matriz1[linha][coluna];
					System.out.printf("\t %d \t",subtracaoMatriz[linha][coluna]);
				}
			}
		}
		else if(opcao == 3)
		{
			System.out.printf("\n\nConstante 1° matriz ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					if(linha == coluna)
					{
						System.out.printf("\t %d \t",matriz[linha][coluna]);
					}
				}
			}
			System.out.printf("\n\nConstante 2° matriz ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					if(linha == coluna)
					{
						System.out.printf("\t %d \t",matriz1[linha][coluna]);
					}
				}
			}
		}
		else
		{
			System.out.printf("\n\nImprimir 1° matriz ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					System.out.printf("\t %d \t",matriz[linha][coluna]);
				}
			}
			System.out.printf("\n\nImprimir 2° matriz ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					System.out.printf("\t %d \t",matriz1[linha][coluna]);
				}
			}
		}		
	}

}
