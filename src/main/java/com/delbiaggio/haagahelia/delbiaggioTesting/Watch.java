package com.delbiaggio.haagahelia.delbiaggioTesting;
/**
 * @author NicolasDelbiaggio
 * @version 18.10.2016
 *
 */
public interface Watch {
	public String getTime();
	public String getDate();
	public String getDay();
	public String getDay(Languages l);
	public String getSource();
	public String getTimeInTimeZoneX(String x);
	public int getNumberDayWeek();
}
