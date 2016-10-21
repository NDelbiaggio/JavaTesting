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

	
        /**
         * Uses the timeformatter to get the current time based on the timesource.
         * @return 
         */
	@Override
	public String getTime() {
		return timeFormatter.format(source.getTimeMoment());
	}
        /**
         * Uses the DateFormatter to get the current date based on the timesource.
         * @return 
         */
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
	
        /**
         * Uses the dayFormatter to get the current day based on the timesource.
         * @return 
         */
	@Override
	public String getDay() {
		return dayFormatter.format(source.getTimeMoment());
	}
        /**
         * pastes the integer from the dayNumberFormat based on the timesource.
         * @return 
         */
	@Override
	public int getNumberDayWeek() {
		return Integer.parseInt(dayNumberFormat.format(source.getTimeMoment()));
	}
        /**
         * Based on the language chosen, gets the translated version of the current day of the week based on .getNumberDayWeek().
         * @param l
         * @return 
         */
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
        /**
         * Get the day for the chosen country: based on the chosen day and the chosen language.
         * @param e
         * @param l
         * @return 
         */
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
        /**
         * Gets the name of the current class used for the timesource
         * @return 
         */
    @Override
    public String getSource() {
        return this.source.getClass().toString();
    }

}
