import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class CurrentDate {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime date = LocalDateTime.now();  
		System.out.println(dtf.format(date));
	}
}
