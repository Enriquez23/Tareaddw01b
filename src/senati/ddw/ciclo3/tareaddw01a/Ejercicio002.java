package senati.ddw.ciclo3.tareaddw01a;

public class Ejercicio002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=5;
		byte y=2;
		byte inter=0;
		
		System.out.println("Valor inicial de x : " + x);
		System.out.println("Valor inicial de y : " + y);
		
		inter=x;
		x=y;
		y=inter;
		
		System.out.println("Valor final de x : " + x);
		System.out.println("Valor final de y : " + inter);
	}

}
