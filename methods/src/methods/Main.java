package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 28;

		boolean varMı = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMı = true;
				break;

			}
		}
		String mesaj="Sayı Mevcuttur:" +aranacak;
		
		if (varMı) {
			mesajVer(mesaj);
		} else {
			System.out.println("Sayı Mevcut Değildir:" +aranacak);
		}

	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}

}
