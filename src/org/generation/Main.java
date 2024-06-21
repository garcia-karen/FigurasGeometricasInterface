package org.generation;
public class Main {
	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Bermudas", 20, 10,15);
		Triangulo t = new Triangulo("TrianguloTE", 250, 175, 145);
		Cuadrado john = new Cuadrado("John",5);
		Rectangulo rect = new Rectangulo("Rect",15, 15);
		Rombo rum = new Rombo("Rum", 10,5,10);
		Romboide rom= new Romboide("Rom", 10,5);
		Trapecio trap= new Trapecio("Trap", 3, 2, 5,5);
		
		imprimirCalculog(bermudas);
		imprimirCalculog(t);
		imprimirCalculog(john);
		imprimirCalculog(rect);
		imprimirCalculog(rum);
		imprimirCalculog(rom);
		imprimirCalculog(trap);
	}//main
	
	public static void imprimirCalculog(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+===========================");
		System.out.println("| El área de [" + f.getNombre()+ "] es: " + f.calcularArea());
		System.out.println("| El perimetro de [" + f.getNombre() + "] es : "+ f.calcularPerimetro());
		System.out.println("+==========================");
	}

}//class Main

