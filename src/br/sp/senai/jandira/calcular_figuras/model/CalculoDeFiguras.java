package br.sp.senai.jandira.calcular_figuras.model;

import java.util.Scanner;

public class CalculoDeFiguras {
	
	public static void calcularQuadrado() {
		
		Scanner leitor = new Scanner(System.in);
		
		Quadrado quadrado = new Quadrado();
		System.out.print("Digite um lado do quadrado: ");
		double quadradoLado = leitor.nextDouble();
		quadrado.setLado(quadradoLado);
		quadrado.exibirResultado();
		
		leitor.close();
	}
	
}
