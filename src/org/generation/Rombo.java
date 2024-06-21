package org.generation;
public class Rombo implements FiguraGeometrica {
	private String nombre;
	private double lado;
    private double dMenor;
    private double dMayor;
	public Rombo(String nombre, double lado, double dMenor, double dMayor) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.dMenor = dMenor;
		this.dMayor = dMayor;
	}//constructor
	
	public double calcularArea() {
		return ((dMenor * dMayor)/2);
	}//calcularArea
	
	public double calcularPerimetro() {
		return (4*lado);
	}//calcularPerimetro

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getdMenor() {
		return dMenor;
	}

	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}

	public double getdMayor() {
		return dMayor;
	}

	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + ", dMenor=" + dMenor + ", dMayor=" + dMayor + "]";
	}
    
    

}//Class Rombo
