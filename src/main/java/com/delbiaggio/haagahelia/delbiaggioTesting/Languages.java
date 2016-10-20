package com.delbiaggio.haagahelia.delbiaggioTesting;

public enum Languages {
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
