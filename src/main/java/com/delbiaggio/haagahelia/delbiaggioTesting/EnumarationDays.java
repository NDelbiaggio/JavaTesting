package com.delbiaggio.haagahelia.delbiaggioTesting;

public enum EnumarationDays {
    /**
     * translates the french (current system) to a set of languages in an enumeration.
     */
	lundi("Maanantai","Montag","Monday"),
	mardi("Tiistai","Dienstag","Tuesday"),
	mercredi("Keskiviikko","Mittwoch","Wednesday"),
	jeudi("Torstai","Donnerstag","Thursday"),
	vendredi("Perjantai","Freitag","Friday"),
	samedi("Lauantai","Samstag","Saturday"),
	dimanche("Sunnuntai","Sonntag","Sunday");
	
	private String finnish;
	private String german;
	private String english;
	
	EnumarationDays(String finnish, String german,String english){
		this.finnish = finnish;
		this.german = german;
		this.english = english;
	}
	
	public String getFinnish(){
		return this.finnish;
	}
	
	public String getGerman(){
		return this.german;
	}
	
	public String getEnglish(){
		return this.english;
	}

	

	
	
	
	
	
}
