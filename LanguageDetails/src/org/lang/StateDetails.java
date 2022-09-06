package org.lang;

public class StateDetails extends LanguageInfo {

	public void southIndia() {
System.out.println("State : South");

	}
	public void northIndia() {
System.out.println("State: North");


	}
	
	
	public static void main(String[] args) {
		
		StateDetails s = new StateDetails();
		s.southIndia();
		s.northIndia();
		s.tamilLanguage();
		s.englishLanguage();
		s.hindiLanguage();
		
		
	}
	
}
