package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem= new DortIslem();
		int Toplamı = dortIslem.Topla(3, 4);
		System.out.println("Toplamı: "+ Toplamı);
		
		int Farkı = dortIslem.Cıkar(3, 4);
		System.out.println("Farkı:" +Farkı );
		
		int Carpımı = dortIslem.Carp(3, 4);
		System.out.println("Çarpımı: "+Carpımı);
		
		float Bolumu = dortIslem.Bolme(8, 3);
		System.out.println("Bölümü: "+Bolumu);
		

	}

}
