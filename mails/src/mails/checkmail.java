package mails;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;

import com.sun.xml.internal.ws.util.StringUtils;
public class checkmail {
	
	public static void checker(String host, String storeType, String user, String password, String day) throws MessagingException, IOException{
		  List<File> attachments = new ArrayList<File>();
		 try {
			 Properties props = System.getProperties();
			 props.setProperty("mail.store.protocol", "imaps");
			 Session session = Session.getDefaultInstance(props, null);
			 Store store = session.getStore("imaps");
			 store.connect("imap.gmail.com", "agilitybasel@gmail.com", "qayxswed");
			 System.out.println(store);
			 Folder[] f = store.getDefaultFolder().list();
			 for(Folder fd:f)
			     System.out.println(">> "+fd.getName());
			 Folder a = store.getFolder("INBOX");
			 Flags read = new Flags(Flags.Flag.SEEN);
//			 folder.setFlags(messages, deleted, true);
//			 folder.expunge(); // or folder.close(true);
			 
		     FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
		     FlagTerm done = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
		     a.open(Folder.READ_WRITE);
		    
//		     <------------ONLY UNREAD ONES--------------->
             Message messages[] = a.search(ft);
//           <------------ONLY UNREAD ONES END--------------->
//			 Message[] messages = a.getMessages();
             
		      System.out.println("messages.length---" + messages.length);
		      for (int i = 0; i <messages.length; i++) {
		         Message message = messages[i];
		         
		         
		         System.out.println("---------------------------------");
		         System.out.println("Email Number " + (i + 1));
		         System.out.println("Subject: " + message.getSubject());
//		         System.out.println("From: " + message.getFrom()[0]);
		         System.out.println("Text: " + message.getContent());
//		         message.get
		         message.setFlags(read, true);
		         
		         
		         
		         
		         try{
		         Multipart multipart = (Multipart) message.getContent();
		          // System.out.println(multipart.getCount());

		          for (int t = 0; t < multipart.getCount(); t++) {
		              BodyPart bodyPart = multipart.getBodyPart(t);
		              if(!Part.ATTACHMENT.equalsIgnoreCase(bodyPart.getDisposition()))
		                  continue; 
		              InputStream is = bodyPart.getInputStream();
		              if(new File(System.getProperty("user.home")+"\\Desktop\\attachi\\"+day+"\\").mkdir());
		              File sf = new File(System.getProperty("user.home")+"\\Desktop\\attachi\\"+day+"\\" +(bodyPart.getFileName().split("\\\\")[bodyPart.getFileName().split("\\\\").length-1]));
		              FileOutputStream fos = new FileOutputStream(sf);
		              byte[] buf = new byte[1000000];
		              int bytesRead;
		              while((bytesRead = is.read(buf))!=-1) {
		                  fos.write(buf, 0, bytesRead);
		              }
		              fos.close();
		              }
		          
		         }catch(java.lang.ClassCastException w){System.out.println("none");}
		         
//		         a.close(false);

		      }
		      
		      
		          
		          
			 
			 
//		      //create properties field
//		      Properties properties = new Properties();
//
//		      properties.put("mail.pop3.host", host);
//		      properties.put("mail.pop3.port", "995");
//		      properties.put("mail.pop3.starttls.enable", "true");
//		      Session emailSession = Session.getDefaultInstance(properties);
//		  
//		      //create the POP3 store object and connect with the pop server
//		      Store store = emailSession.getStore("pop3s");
//
//		      store.connect(host, user, password);
//
//		      //create the folder object and open it
////		      Folder emailFolder = store.getFolder("INBOX");
//		      Folder emailFolder = store.;
//		      emailFolder.open(Folder.READ_ONLY);
//		      System.out.println("DOO "+emailFolder.list().length);
//		      FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
//              Message messages[] = emailFolder.search(ft);
//		      
//		      
//		      
////		      Session session = Session.getDefaultInstance(props, null);
////              Store store = session.getStore("imaps");
////              store.connect("imap.gmail.com", "mail", "pass");
////              System.out.println(store);
//
//		      
//
////		      // retrieve the messages from the folder in an array and print it
////		      Message[] messages = emailFolder.getMessages();
////		      System.out.println("messages.length---" + messages.length);
//
//		      for (int i = 0, n = messages.length; i < 5; i++) {
//		         Message message = messages[i];
//		         System.out.println("---------------------------------");
//		         System.out.println("Email Number " + (i + 1));
//		         System.out.println("Subject: " + message.getSubject());
//		         System.out.println("From: " + message.getFrom()[0]);
//		         System.out.println("Text: " + message.getContent().toString());
//
//		      }
//
//		      //close the store and folder objects
//		      emailFolder.close(false);
//		      store.close();
//
		      } catch (NoSuchProviderException e) {
		         e.printStackTrace();
//		      } catch (MessagingException e) {
//		         e.printStackTrace();
//		      } catch (Exception e) {
//		         e.printStackTrace();
//		      }
		   }}


		
	}
	
	
	
	

