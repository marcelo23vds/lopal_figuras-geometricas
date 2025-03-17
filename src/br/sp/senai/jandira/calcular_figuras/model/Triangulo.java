package br.sp.senai.jandira.calcular_figuras.model;

public class Triangulo {
	
	private double base; 
	private double ladoEsquerdo;
	private double ladoDireito;
	
	public void setBase (double base) {
		this.base = base;
	}
	
	public double getBase () {
		return base;
	}
	
	public void setLadoEsquerdo(double ladoEsquerdo) {
		this.ladoEsquerdo = ladoEsquerdo;
	}
	
	public double getLadoEsquerdo() {
		return ladoEsquerdo;
	}
	
	public void setLadoDireito(double ladoDireito) {
		this.ladoDireito = ladoDireito;
	}
	
	public double getLadoDireito() {
		return ladoDireito;
	}
	
//	public void verificarTriangulo() {
//		if(base < (ladoEsquerdo + ladoDireito) && ladoEsquerdo < (base + ladoDireito) && ladoDireito < (base + ladoEsquerdo)) {
//			if (base == ladoEsquerdo || base == ladoDireito || ladoEsquerdo == ladoDireito) {
//				System.out.println("Triangulo ISÓSCELES");
//
//			} else if (base != ladoEsquerdo && ladoEsquerdo != ladoDireito) {
//				System.out.println("Triangulo ESCALENO");
//
//			} else if (base == ladoEsquerdo && ladoEsquerdo == ladoDireito) {
//				System.out.println("Triangulo EQUILATERO");
//			}
//		} else {
//			System.out.println("Os valores digitados não formam um triângulo!");
//		}
//	}
	
	public double calcularAreaTriangulo() {
		double area = (base * ladoEsquerdo) / 2;
		return area;
	}
	
	public void exibirResultado() {
		System.out.println("--------------");
		System.out.println("Área do Triangulo: " + calcularAreaTriangulo());
		System.out.println("--------------");
	}
	
}
