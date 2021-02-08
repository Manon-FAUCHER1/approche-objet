/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author manon
 *
 */
public class TestCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1
		Calendar calendrier = Calendar.getInstance();
		calendrier.set(2016, 4, 19, 23, 59, 30);
		
		Date date = calendrier.getTime();
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
		String chaineFormat = format.format(date);
		
		System.out.println(chaineFormat);
		
		
		// 2
		calendrier = Calendar.getInstance();
		
		date = calendrier.getTime();
		
		SimpleDateFormat formt2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		System.out.println(formt2.format(date));;

		
		// 3 
		SimpleDateFormat formt3 = new SimpleDateFormat("EEE d MMM yyy");
		System.out.println(formt3.format(date));
		
		formt3 = new SimpleDateFormat("EEE d MMM yyy", new Locale("ru", "RU"));
		System.out.println(formt3.format(date));
		
		formt3 = new SimpleDateFormat("EEE d MMM yyy", Locale.CHINESE);
		System.out.println(formt3.format(date));
		
		formt3 = new SimpleDateFormat("EEE d MMM yyy", Locale.GERMAN);
		System.out.println(formt3.format(date));
		
	}

}
