package org.lang;

public class LanguageInfo {

	public void tamilLanguage() {
		System.out.println("Language 1:Tamil");
	}

	public void englishLanguage() {
		System.out.println("Language 2:English");
	}

	public void hindiLanguage() {
		System.out.println("Language 3:Hindi");
	}

	public static void main(String[] args) {

		LanguageInfo lang = new LanguageInfo();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.hindiLanguage();
		
		
	}
}
