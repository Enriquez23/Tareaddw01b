package senati.ddw.ciclo3.tareaddw01a;

public class Ejercicio006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte dias=0;
		int km=0;
		float monto=0f;
		byte cdia=30;
		float ckm=0.40f;
		float aux=0f;
		
		dias=5;
		km=2200;
		
		if (km > 2000) {
			monto=dias * cdia;
			aux=(km - 2000) * ckm;
			monto=monto + aux;
		}else {
			monto=dias + cdia;
		}
		
		System.out.println("Total a pagar : " + monto);
	}

}
