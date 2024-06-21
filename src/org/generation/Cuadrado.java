package org.generation;

public class Cuadrado implements FiguraGeometrica{
	     private String nombre;
	     private double lado;
		public Cuadrado(String nombre, double lado) {
			super();
			this.nombre = nombre;
			this.lado = lado;
		}//contructor
		
		public double calcularArea() {
			return (Math.pow(lado,2));
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

		public double getLado() {
			return lado;
		}

		public void setLado(double lado) {
			this.lado = lado;
		}

		@Override
		public String toString() {
			return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
		}
		
		
		




}//Class Cuadrado


