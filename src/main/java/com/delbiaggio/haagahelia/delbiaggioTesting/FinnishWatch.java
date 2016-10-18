package com.delbiaggio.haagahelia.delbiaggioTesting;
/**
 * @author NicolasDelbiaggio
 * @version 18.10.2016
 *
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FinnishWatch implements Watch{

	private TimeSource source;
	private SimpleDateFormat timeFormatter = new SimpleDateFormat("H:m:s");
	private SimpleDateFormat dateFormatter = new SimpleDateFormat("d.M.Y");
	private TimeZone easternEuropeanTime;
	
	public FinnishWatch(TimeSource source){
		this.source = source;
	}

	@Override
	public String getTime() {		
		return timeFormatter.format(source.getTimeMoment());
	}

	@Override
	public String getDate() {				
		return dateFormatter.format(source.getTimeMoment());
	}

}
