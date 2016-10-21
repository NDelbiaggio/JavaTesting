package com.delbiaggio.haagahelia.delbiaggioTesting;

public enum Languages {
    /**
     * Simple enumeration to use the different kind of translations
     */
	English("english"),
	German("german"),
	Finnish("finnish");
	
	String language;
	
	Languages(String l){
		this.language = l;
	}
	
	public String getLanguage(){
		return this.language;
	}
}
