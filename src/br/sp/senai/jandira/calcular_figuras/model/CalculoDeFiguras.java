package br.sp.senai.jandira.calcular_figuras.model;

import java.util.Scanner;

public class CalculoDeFiguras {
	
	Scanner leitor = new Scanner(System.in);
	
	public static void calcularQuadrado() {
		
		Scanner leitor = new Scanner(System.in);
		
		Quadrado quadrado = new Quadrado();
		System.out.print("Digite um lado do quadrado: ");
		double quadradoLado = leitor.nextDouble();
		quadrado.setLado(quadradoLado);
		quadrado.exibirResultado();
		
		leitor.close();
	}
	
	public static void calcularRetangulo() {
		
		Scanner leitor = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.print("Digite a base do retangulo: ");
		double retanguloBase = leitor.nextDouble();
		System.out.print("Digite a altura do retangulo: ");
		double retanguloAltura = leitor.nextDouble();
		retangulo.setBase(retanguloBase);
		retangulo.setAltura(retanguloAltura);
		retangulo.exibirResultado();
		
		leitor.close();
	}
	
	public static void calcularTrapezio() {
		
		Scanner leitor = new Scanner(System.in);
		
		Trapezio trapezio = new Trapezio();
		System.out.print("Digite a base menor do Trapezio: ");
		double trapezioBaseMenor = leitor.nextDouble();
		System.out.print("Digite a base maior do Trapezio: ");
		double trapezioBaseMaior = leitor.nextDouble();
		System.out.print("Digite a altura do Trapezio: ");
		double trapezioAltura = leitor.nextDouble();
		trapezio.setBaseMenor(trapezioBaseMenor);
		trapezio.setBaseMaior(trapezioBaseMaior);
		trapezio.setAltura(trapezioAltura);
		trapezio.exibirResultado();
		
		leitor.close();
	}
	
	public static void calcularTriangulo() {
		
		Scanner leitor = new Scanner(System.in);
		
		Triangulo triangulo = new Triangulo();
		System.out.print("Digite a base do triangulo: ");
		double trianguloBase = leitor.nextDouble();
		System.out.print("Digite o lado esquerdo do triangulo: ");
		double trianguloLadoEsquerdo = leitor.nextDouble();
		System.out.print("Digite o lado direito do triangulo: ");
		double trianguloLadoDireito = leitor.nextDouble();
		triangulo.setBase(trianguloBase);
		triangulo.setLadoEsquerdo(trianguloLadoEsquerdo);
		triangulo.setLadoDireito(trianguloLadoDireito);
		triangulo.exibirResultado();
		
		leitor.close();
	}
	
	public static void calcularCircunferencia() {
		
		Scanner leitor = new Scanner(System.in);
		
		Circunferencia circulo = new Circunferencia();
		System.out.print("Digite o raio da circunferencia: ");
		double circunferenciaRaio = leitor.nextDouble();
		circulo.setRaio(circunferenciaRaio);
		circulo.exibirResultado();
		
		leitor.close();
	}
	
}
