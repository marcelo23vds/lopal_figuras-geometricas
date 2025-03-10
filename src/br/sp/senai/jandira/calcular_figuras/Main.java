package br.sp.senai.jandira.calcular_figuras;

import br.sp.senai.jandira.calcular_figuras.model.Circunferencia;
import br.sp.senai.jandira.calcular_figuras.model.Quadrado;
import br.sp.senai.jandira.calcular_figuras.model.Retangulo;
import br.sp.senai.jandira.calcular_figuras.model.Trapezio;
import br.sp.senai.jandira.calcular_figuras.model.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Triangulo tri1 = new Triangulo();
		tri1.setAltura(8);
		tri1.setBase(5);
		tri1.exibirResultado();
		
		Quadrado quad1 = new Quadrado();
		quad1.setLado(3);
		quad1.exibirResultado();
		
		Retangulo ret1 = new Retangulo();
		ret1.setBase(5);
		ret1.setAltura(2);
		ret1.exibirResultado();
		
		Trapezio trap1 = new Trapezio();
		trap1.setBaseMenor(5);
		trap1.setBaseMaior(12);
		trap1.setAltura(8);
		trap1.exibirResultado();
		
		Circunferencia circ1 = new Circunferencia();
		circ1.setRaio(5);
		circ1.exibirResultado();
	}
}
