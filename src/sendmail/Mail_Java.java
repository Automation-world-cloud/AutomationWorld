package sendmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Mail_Java {
	
	public static void main(String[] args)throws EmailException{
		
	
	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("anush505@gmail.com", "@sai1234$"));
	email.setSSLOnConnect(true);
	email.setFrom("anush505@gmail.com");
	email.setSubject("TestMail");
	email.setMsg("This is a test mail ... :-)");
	email.addTo("anushreddy1991@gmail.com");
	email.send();
	}
}
