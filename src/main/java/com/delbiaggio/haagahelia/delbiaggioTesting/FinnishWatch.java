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
	private SimpleDateFormat dayFormatter = new SimpleDateFormat("EEEE");;
	private TimeZone easternEuropeanTime;
	
	public FinnishWatch(TimeSource source){
		this.source = source;
	}

	public String getSource (){
		return source.getClass().toString();
	}
	
	@Override
	public String getTime() {		
		return timeFormatter.format(source.getTimeMoment());
	}

	@Override
	public String getDate() {				
		return dateFormatter.format(source.getTimeMoment());
	}

	@Override
	public String getDay() {				
		return dayFormatter.format(source.getTimeMoment());
	}
	
	public String getFinnishDay(){		
		switch(this.getDay().toLowerCase()){
			case "lundi":
				return "Maanantai";
			case "mardi":
				return "Tiistai";
			case "mercredi":
				return "Keskiviikko";
			case "jeudi":
				return "Torstai";
			case "vendredi":
				return "Perjantai";
			case "samedi":
				return "Lauantai";
			case "dimanche":
				return "Sunnuntai";
				default: return "Error";
		}
	}
	

}
