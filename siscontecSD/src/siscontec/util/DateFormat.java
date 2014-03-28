package siscontec.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	public static String getFechaHora(String date){
		String result = "";
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//Date today = new Date();
		try {
			Date fechaFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
			result = formatter.format(fechaFormat);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
		return result;
	}
	
	public static String getFechaHoraSave(String fecha, String hora){
		String result = "";
		String newhora = "00:00";
		
		if (hora.lastIndexOf("p")>0){
			int nrohoras = Integer.parseInt(hora.substring(0,hora.indexOf(":")));
			int newnrohoras = (nrohoras>=12?0:nrohoras + 12);
			String min = hora.substring(hora.indexOf(":")+1,hora.lastIndexOf(" "));
			newhora = (newnrohoras==0?"00":newnrohoras)+":"+min;
		} else if (hora.lastIndexOf("a")>0) {
			newhora = hora.substring(0,hora.indexOf("a")-1);
		} else {
			newhora = hora;
		}
		newhora += ":00";
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//Date today = new Date();
		try {
			Date fechaFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(fecha+" "+newhora);
			result = formatter.format(fechaFormat);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
		return result;
	}
	
	public static String getCurrentDateTime(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
}
