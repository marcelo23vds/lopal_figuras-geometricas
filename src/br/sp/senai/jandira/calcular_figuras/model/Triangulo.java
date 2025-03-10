package br.sp.senai.jandira.calcular_figuras.model;

public class Triangulo {
	
	private double base; 
	private double altura;
	
	public void setBase (double base) {
		this.base = base;
	}
	
	public double getBase () {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double calcularAreaTriangulo() {
		double area = (base * altura) / 2;
		return area;
	}
	
	public void exibirResultado() {
		System.out.println("--------------");
		System.out.println("Área do Triangulo: " + calcularAreaTriangulo());
		System.out.println("--------------");
	}
	
}
