package br.sp.senai.jandira.calcular_figuras.model;

import java.util.Scanner;

public class Menu {
	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("----------------------------------");
		System.out.println("CALCULADORA DE FIGURAS GEOMETRICAS");
		System.out.println("----------------------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETANGULO");
		System.out.println("3 - TRAPÉZIO");
		System.out.println("4 - TRIÂNGULO");
		System.out.println("5 - CIRCUNFERÊNCIA");
		System.out.println("----------------------------------");
		System.out.print("Escolha uma opção de 1 a 5: ");
		
		int opcao = leitor.nextInt();
		
		switch (opcao) {
		case 1:
			CalculoDeFiguras.calcularQuadrado();
			break;
		case 2:
			CalculoDeFiguras.calcularRetangulo();
			break;
		case 3:
			CalculoDeFiguras.calcularTrapezio();
			break;
		case 4:
			CalculoDeFiguras.calcularTriangulo();
			break;
		case 5:
			CalculoDeFiguras.calcularCircunferencia();
			break;
		default:
			System.out.println("Nenhuma opção selecionada / opção inválida!");
		}
		
		leitor.close();
	}
}
