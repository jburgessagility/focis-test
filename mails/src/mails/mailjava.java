package mails;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import moes.TIMER;

		public class mailjava {
		   public Message sendmailnoattach (Session session, String from, String to){
		      try {
			   // Create a default MimeMessage object.
			   Message message = new MimeMessage(session);
			
			   // Set From: header field of the header.
			   message.setFrom(new InternetAddress(from));
			
			   // Set To: header field of the header.
			   message.setRecipients(Message.RecipientType.TO,
		               InternetAddress.parse(to));
//			   message.addRecipients(Message.RecipientType.BCC, InternetAddress.parse("JLang@agility.com"));
//			   message.addRecipients(Message.RecipientType.BCC, InternetAddress.parse("JBurgess@agility.com"));
			
			   // Set Subject: header field
			   message.setSubject("Testing Subject");
			
//			   // Now set the actual message
			   message.setText("Back to TETRIS");

		         return message;

		      } catch (MessagingException e) {
		         throw new RuntimeException(e);
		      }
		   }
		   
		   
		   
		   public Message sendmailattach(Session session, String from, String to,String filename ){
			   try {
				   // Create a default MimeMessage object.
				   Message message = new MimeMessage(session);
				
				   // Set From: header field of the header.
				   message.setFrom(new InternetAddress(from));
				
				   // Set To: header field of the header.
				   message.setRecipients(Message.RecipientType.TO,
			               InternetAddress.parse(to));
				   message.addRecipients(Message.RecipientType.BCC, InternetAddress.parse("JLang@agility.com"));
				   message.addRecipients(Message.RecipientType.BCC, InternetAddress.parse("JBurgess@agility.com"));
				
				
				   // Set Subject: header field
				   message.setSubject("Testing Subject");
				
//				   // Now set the actual message
//				   message.setText("Hello, this is sample for to check send " +
//					"email using JavaMailAPI ");
				   
				   
				   	// Create the message part
			         BodyPart messageBodyPart = new MimeBodyPart();

			         // Now set the actual message
			         messageBodyPart.setText("TETRIS");

			         // Create a multipar message
			         Multipart multipart = new MimeMultipart();

			         // Set text message part
			         multipart.addBodyPart(messageBodyPart);

			         // Part two is attachment
			         messageBodyPart = new MimeBodyPart();
			         
			         DataSource source = new FileDataSource(filename);
			         messageBodyPart.setDataHandler(new DataHandler(source));
			         messageBodyPart.setFileName(filename);
			         multipart.addBodyPart(messageBodyPart);

			         // Send the complete message parts
			         message.setContent(multipart);
			         return message;

			      } catch (MessagingException e) {
			         throw new RuntimeException(e);
			      }
		   }  
		   
		   
		public static Session start(){
			final String username = "agilitybasel@gmail.com";//change accordingly
		    final String password = "qayxswed";//change accordingly

		      // Assuming you are sending email through relay.jangosmtp.net
//		      String host = "relay.jangosmtp.net";
		      String host = "smtp.gmail.com";
//		      String host = "webmailkw.agilitylogistics";

	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "587");

	      // Get the Session object.
	      return Session.getInstance(props,
	         new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	               return new PasswordAuthentication(username, password);
		   }});
		}
		
		
		
		
		}

