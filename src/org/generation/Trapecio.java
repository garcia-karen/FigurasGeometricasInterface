package org.generation;

public class Trapecio implements FiguraGeometrica{
	private String nombre;
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado;
	public Trapecio(String nombre, double baseMayor, double baseMenor, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
		this.lado = lado;
	}
	
	public double calcularArea() {
		return ((altura*(baseMayor+baseMenor))/2);
	}//calcularArea
	
	public double calcularPerimetro() {
		return (lado+lado+lado+lado);
	}//calcularPerimetro

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getBaseMayor() {
		return baseMayor;
	}

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura="
				+ altura + ", lado=" + lado + "]";
	}
	
	
}
