package App.Model;
import java.util.*;
import java.text.*;
public class DateTime {
	public String Time;
	public int Year;
	public int Month;
	public int Day;
	public int Hour;
	public int Minute;
	public int Second;
	public int MilSec;
    public DateTime(){ 
    	Calendar cal=   Calendar.getInstance();
    	Date d= cal.getTime();
    	Year=cal.get(Calendar.YEAR);
    	Month=cal.get(Calendar.MONTH);
    	Day=cal.get(Calendar.DATE);	
    	Hour=cal.get(Calendar.HOUR);
    	Minute=cal.get(Calendar.MINUTE);
    	Second=cal.get(Calendar.SECOND);
    	MilSec=cal.get(Calendar.MILLISECOND);
    	Time=Year+"-"+Month+"-"+Day+" "+Hour+":"+Minute+":"+Second+" "+MilSec;
	}
    public String GetNowTimeString(){
    	Calendar cal=Calendar.getInstance();
    	SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss fff");
    	return format.format(cal.getTime());
    	
    }
}
