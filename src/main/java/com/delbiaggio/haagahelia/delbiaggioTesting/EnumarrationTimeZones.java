package com.delbiaggio.haagahelia.delbiaggioTesting;

public enum EnumarrationTimeZones {
	/**
	 * Enumeration to get the time zones for having the watch in different zones.
	 */
	Wzero("Etc/GMT+0"),
	WPone("Etc/GMT-1"),
	WPtwo("Etc/GMT-2"),
	WPthree("Etc/GMT-3"),
	WPfour("Etc/GMT-4"),
	WPfive("Etc/GMT-5"),
	WPsix("Etc/GMT-6"),
	WPseven("Etc/GMT-7"),
	WPeigth("Etc/GMT-8"),
	WPnine("Etc/GMT-9"),
	WPten("Etc/GMT-10"),
	WPeleven("Etc/GMT-11"),
	WPtwelve("Etc/GMT-12"),
	WMone("Etc/GMT+1"),
	WMtwo("Etc/GMT+2"),
	WMthree("Etc/GMT+3"),
	WMfour("Etc/GMT+4"),
	WMfive("Etc/GMT+5"),
	WMsix("Etc/GMT+6"),
	WMseven("Etc/GMT+7"),
	WMeigth("Etc/GMT+8"),
	WMnine("Etc/GMT+9"),
	WMten("Etc/GMT+10"),
	WMeleven("Etc/GMT+11"),
	WMtwelve("Etc/GMT+12"),	
	Szero("Etc/GMT-1"),
	SPone("Etc/GMT-2"),
	SPtwo("Etc/GMT-3"),
	SPthree("Etc/GMT-4"),
	SPfour("Etc/GMT-5"),
	SPfive("Etc/GMT-6"),
	SPsix("Etc/GMT-7"),
	SPseven("Etc/GMT-8"),
	SPeigth("Etc/GMT-9"),
	SPnine("Etc/GMT-10"),
	SPten("Etc/GMT-11"),
	SPeleven("Etc/GMT-12"),
	SPtSelve("Etc/GMT-13"),
	SMone("Etc/GMT+0"),
	SMtSo("Etc/GMT+1"),
	SMthree("Etc/GMT+2"),
	SMfour("Etc/GMT+3"),
	SMfive("Etc/GMT+4"),
	SMsix("Etc/GMT+5"),
	SMseven("Etc/GMT+6"),
	SMeigth("Etc/GMT+7"),
	SMnine("Etc/GMT+8"),
	SMten("Etc/GMT+9"),
	SMeleven("Etc/GMT+10"),
	SMtSelve("Etc/GMT+11");
	
	String zone;
	
	EnumarrationTimeZones(String l){
		this.zone = l;
	}
	
	public String getzone(){
		return this.zone;
	}
}
