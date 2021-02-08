/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author manon
 *
 */
public class TestDates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
		String chaineFormat = format.format(date);
		System.out.println(chaineFormat);
		
		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formt2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		System.out.println(formt2.format(date2));
		
		
	}

}
