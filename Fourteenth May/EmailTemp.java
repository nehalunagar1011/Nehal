import java.io.*;
import java.util.*;
import java.net.*;
import javax.mail.*;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailTemp {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://api.weatherstack.com/current?access_key="your_key_here"&query=New%20York&units=m");
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
	        
	        String output;
	        System.out.println("Output from Server .... \n");
	        while ((output = br.readLine()) != null) {
	        	System.out.println(output);
	        }
	        
	        String host="smtp.gmail.com";
	        final String user="abc@xyz.com";
	        final String password="**********";
	        String to="xyz@abc.com";
	        
	        Properties props = new Properties();  
			props.put("mail.smtp.auth", "true");  
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host",host);  
			props.put("mail.smtp.port", "2525");
			
			Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(user,password);
				}
			});
			
			try {
				MimeMessage message = new MimeMessage(session);  
			    message.setFrom(new InternetAddress(user));  
			    message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			    message.setSubject("google");  
			    message.setText(output);
			    
			    Transport.send(message);  
				  
			    System.out.println("message sent successfully...");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			conn.disconnect();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
