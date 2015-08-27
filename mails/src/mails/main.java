package mails;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;

import moes.TIMER;

public class main {
	
	   public static void main(String[] args) throws MessagingException {
	   Message message;
	   Date date = new Date();
	   DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	   String day = dateFormat.format(date);
//	   <-------CLIENT----->
//	   String filename = System.getProperty("user.home")+moes.moes.savedir+System.getProperty("user.name")+moes.moes.getMAC()+day+".csv";
//	   <-------SERVER----->
	   String filename = System.getProperty("user.home")+moes.moes.savedir2+day+"//Rplots.pdf";
	   
	   
	   mailjava a=new mailjava();
	   Session session= a.start();
//	   String to = "agilitybasel@gmail.com";
	   String to = "gametopia37@gmail.com";
	   String from = "agilitybasel@gmail.com";
	   
	   
	   
	   String host = "pop.gmail.com";// change accordingly
	   String mailStoreType = "pop3";
	   String username = "agilitybasel@gmail.com";// change accordingly
	   String password = "qayxswed";// change accordingly
	   
////	   <----------------CHECK MAILS----------------->
//	   checkmail as=new checkmail();
//	   try {
//		as.checker(host, mailStoreType, username, password, day);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
////	   <----------- END CHECK MAILS------------>

//	   <----------- SNED MAILS------------>
//	   message = a.sendmailnoattach(session, from, to);
	   message = a.sendmailattach(session, from, to,filename);
	   Transport.send(message);
//	   File directory = new File(System.getProperty("user.home")+moes.moes.savedir+System.getProperty("user.name")+moes.moes.getMAC()+day+".csv");
//		 
//    	//make sure directory exists
//    	if(!directory.exists()){
//           System.out.println("Directory does not exist.");
//           System.exit(0);
// 
//        }else{
//           try{
//               delete.delete(directory);
//           }catch(IOException e){
//               e.printStackTrace();
//               System.exit(0);
//           } }
//	   <----------- END SEND MAILS------------>
	   

	   System.out.println("terminated without mistake");


	   }}
