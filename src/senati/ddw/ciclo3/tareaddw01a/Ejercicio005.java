package senati.ddw.ciclo3.tareaddw01a;

public class Ejercicio005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sueldo=0;
		float d1=0f;
		float d2=0f;
		float d3=0f;
		float sb=0f;

		sueldo = 2500;

		d1 = (float) (sueldo * 0.10);
		d2 = (float) (sueldo * 0.05);
		d3 = (float) ((sueldo - d1 - d2) * 0.03);
		sb = sueldo - d1 - d2 - d3;

		System.out.println("Sueldo : " + sueldo);
		System.out.println("Descuento 1: " + d1);
		System.out.println("Descuento 2: " + d2);
		System.out.println("Descuento 3: " + d3);
		System.out.println("Sueldo neto: " + sb);
	}

}
