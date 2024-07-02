import java.util.Scanner;

public class CeaseSifrelemeMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ceaser Tekniği ile şifrelenecek metni giriniz: ");
		String metinString = scanner.nextLine();
		System.out.print("Kaydırma anahtar sayısını giriniz: ");
		int key = scanner.nextInt();
		
		CeaserSifrelemeMethod soru1 = new CeaserSifrelemeMethod(metinString, key);
		String cevapString = soru1.sifrele(metinString, key);
		System.out.println(cevapString);
		
		
	}

}
