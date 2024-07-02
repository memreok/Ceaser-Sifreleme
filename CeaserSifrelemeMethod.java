
public class CeaserSifrelemeMethod {

	public CeaserSifrelemeMethod(String metinString, int key) {
		sifrele(metinString, key);
	}
	
	public String sifrele(String metinString, int key) {
		// tanımlamalar
			String alphabetString = "abcçdefgğhıijklmnoöprsştuüvyz";
			String answerString = "";
				
			// şifrelenecek metin içinde gezme
			for (int i = 0; i < metinString.length(); i++) {
				char gecici = metinString.charAt(i); // metinden sırayla harf alıyoruz
				// boşluk mu
				if (gecici == ' ') {
					answerString+= " ";
					continue;
				}
				// alfabede gezeceğiz
				for (int j = 0; j < alphabetString.length(); j++) {
					char gecicialp = alphabetString.charAt(j); // alfabeden harf alıyoruz
					if (gecici == gecicialp) { // alfabedeki yerini bulduk mu
						// indexoutofbonds
						if ((j + key ) >= alphabetString.length() ) {
							int sayac = 0;
							for (int k = j; k <= alphabetString.length() ; k++) {
								sayac ++;
								if (k == (alphabetString.length() - 1) ) {
									j = 0;
									answerString += alphabetString.charAt(j + (key - sayac) );
									break;
								}
							}
							break;
							
						}else {
							answerString += alphabetString.charAt(j + key)  ;	
						}
					}
				}
				
			}
				
				
				
		return answerString;
	}
	
	
}
