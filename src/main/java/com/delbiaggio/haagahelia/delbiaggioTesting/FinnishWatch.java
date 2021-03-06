package com.delbiaggio.haagahelia.delbiaggioTesting;

/**
 * @author NicolasDelbiaggio
 * @version 18.10.2016
 *
 */
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class FinnishWatch implements Watch {

	private TimeSource source;
	private SimpleDateFormat timeFormatter = new SimpleDateFormat("H:m:s");
	private SimpleDateFormat dateFormatter = new SimpleDateFormat("d.M.Y");
	private SimpleDateFormat dayFormatter = new SimpleDateFormat("EEEE");
	private SimpleDateFormat dayNumberFormat = new SimpleDateFormat("u");
	private TimeZone easternEuropeanTime = TimeZone.getTimeZone("Europe/Helsinki");

	public FinnishWatch(TimeSource source) {
		this.source = source;
	}

	public String getSource() {
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
	
	/**
	 * Gets the value  ( "Etc/x" ) based on input
	 * uses the string to get correct Timezone.
	 * Places the dayFormatter with the desired Timezone.
	 * @param y
	 */
	
	public void setTimeZoneToTimeZoneX(EnumarrationTimeZones zone) {
		TimeZone zoneX = TimeZone.getTimeZone(zone.getzone());
		timeFormatter.setTimeZone(zoneX);
		
	}
	
	/**
	 * Uses the internal method setTimeZoneToTimeZoneX to make the timezone to desired one.
	 * Uses timeformatter to get the current time with the timezone.
	 * places the timezone back to it's orignial value ( here easternEuropeanTime)
	 * @param x
	 */	
	@Override
	public String getTimeInTimeZoneX(EnumarrationTimeZones zone) {
		this.setTimeZoneToTimeZoneX(zone);
		String timeX = this.getTime();
		timeFormatter.setTimeZone(easternEuropeanTime);
		return timeX;		
	}
	

	@Override
	public String getDay() {
		return dayFormatter.format(source.getTimeMoment());
	}

	@Override
	public int getNumberDayWeek() {
		return Integer.parseInt(dayNumberFormat.format(source.getTimeMoment()));
	}

	public String getDay(Languages l) {
		switch (this.getNumberDayWeek()) {
		case 1:
			return getDayForACountry(EnumarationDays.lundi, l);
		case 2:
			return getDayForACountry(EnumarationDays.mardi, l);
		case 3:
			return getDayForACountry(EnumarationDays.mercredi, l);
		case 4:
			return getDayForACountry(EnumarationDays.jeudi, l);
		case 5:
			return getDayForACountry(EnumarationDays.vendredi, l);
		case 6:
			return getDayForACountry(EnumarationDays.samedi, l);
		case 7:
			return getDayForACountry(EnumarationDays.dimanche, l);
		default:
			return "Error FinnishWatch.getFinnishDay";
		}
		// return
		// EnumarationDays.valueOf(this.getDay().toLowerCase()).getFinnish();
	}

	private String getDayForACountry(EnumarationDays e, Languages l) {
		switch (l.getLanguage()) {
		case "english":
			return e.getEnglish();
		case "finnish":
			return e.getFinnish();
		case "german":
			return e.getGerman();
		default:
			return "Error FinnishWatch.getDayForACountry";
		}
	}

}
