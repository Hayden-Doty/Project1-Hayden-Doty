import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.print.DocFlavor.STRING;

public class DateTimeOne
{
		
	private static final int NUMBER_OF_SECONDS_TO_SLEEP = 3;

	public void dateTimeNow() 
	{
		//Date/time object for date/time
		DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
		LocalDateTime showDateTime = LocalDateTime.now();
		String formattedDateTimeFinal = showDateTime.format(formattedDateTime);
	    System.out.println("Current Date/Time: " + formattedDateTimeFinal);	    
	}
	
	public int getValueOfSecond() {
		int second = LocalDateTime.now().getSecond();
		return second;
	}
	
	public void sleepForThreeSec() {
		LocalDateTime elapsed = LocalDateTime.now().plusSeconds(NUMBER_OF_SECONDS_TO_SLEEP);
		while (true) {
			if (LocalDateTime.now().compareTo(elapsed) >= 0) {
				break;
			} 
		}
	}
}