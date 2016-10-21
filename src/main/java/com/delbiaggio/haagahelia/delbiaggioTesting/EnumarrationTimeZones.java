package com.delbiaggio.haagahelia.delbiaggioTesting;

public enum EnumarrationTimeZones {
	/**
	 * Enumeration to get the time zones for having the watch in different zones.
	 */
	
	
	zero("Etc/GMT+0"),
	one("Etc/GMT+1"),
	two("Etc/GMT+2"),
	three("Etc/GMT+3"),
	four("Etc/GMT+4"),
	five("Etc/GMT+5"),
	six("Etc/GMT+6"),
	seven("Etc/GMT+7"),
	eigth("Etc/GMT+8"),
	nine("Etc/GMT+9"),
	ten("Etc/GMT+10"),
	eleven("Etc/GMT+11"),
	twelve("Etc/GMT+12");
	
	String zone;
	
	EnumarrationTimeZones(String l){
		this.zone = l;
	}
	
	public String getzone(){
		return this.zone;
	}
}
