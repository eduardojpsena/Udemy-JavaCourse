package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = dateFormat1.parse("25/06/2021");
		Date y2 = dateFormat2.parse("25/06/2021 16:15:07");
		
		System.out.println("y1: " + y1);
		System.out.println("y1 formatado" + dateFormat1.format(y1));
		
		System.out.println("y2: " + y2);
		System.out.println("y2 formatado" + dateFormat2.format(y2));
		
		System.out.println("--------------------------------------------");
		
		Date d = new Date();
		
		System.out.println("Data atual: " + d);
		System.out.println("Data atual formatada: " + dateFormat2.format(d));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		calendar.add(Calendar.HOUR_OF_DAY, 4);
		d = calendar.getTime();
		System.out.println("Data atual + 4 horas: " + dateFormat2.format(d));
		
		int minutes = calendar.get(Calendar.MINUTE);
		int month = 1 + calendar.get(Calendar.MONTH); //o mes dessa variavel começa com Janeiro = 0
		 
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
	}

}
