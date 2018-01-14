package testcnx;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;

public class asdd {
	static PreparedStatement prt;
	static Statement st = null;
	static int rs;

	public static void adduser(user Users) throws SQLException, ClassNotFoundException, ServletException, IOException {

		String sql = "INSERT INTO `utilisateur` (`firstname`, `lastname`, `email`, `psw`) VALUES (?,?,?,?)";
		if (Users.getLastname().equals("") || Users.getFirstname().equals("") || Users.getEmail().equals("")
				|| Users.getPsw().equals("")) {

		} else
			try {

				Testcnx.conn();
				prt = Testcnx.conn.prepareStatement(sql);
				prt.setString(1, Users.getFirstname());
				prt.setString(2, Users.getLastname());
				prt.setString(3, Users.getEmail());
				prt.setString(4, Users.getPsw());
				rs = prt.executeUpdate();
				Testcnx.conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

	}
	
	
	 public static void insert(String expediteur,String destinataire,String message,String date) throws ClassNotFoundException {
  	   
  	   String sql="INSERT INTO `message` ( `expediteur`,  `destinataire`,`message`,dats) VALUES (?,?,?,?);";
  	   
  	   try {
 			Testcnx.conn();
 			prt = Testcnx.conn.prepareStatement(sql);
 			prt.setString(1, expediteur);
 			prt.setString(2,destinataire);
 			prt.setString(3, message);
 			prt.setString(4, date);
 			rs = prt.executeUpdate();
 			Testcnx.conn.close();
 			} catch (SQLException e) {
 				
 				e.printStackTrace();} 
  	
 			
     }
	 
	 
	 public static String  select(String  destinataire) throws SQLException {
  	   ResultSet rss;
  	   String message="";
  	   
  	   String sql="select expediteur,message,dats from message where destinataire='"+destinataire+"'";
  	  
        	 try {
     			
     			Testcnx.conn();
     			
     			prt =Testcnx.conn.prepareStatement(sql);
              rss = prt.executeQuery();
                while (rss.next()) {
                String  ex = rss.getString("expediteur");
                String   ms = rss.getString("message"); 
                String  date= rss.getString("dats"); 
                 message +=date+": "+ex+":"+" '"+ms+"'"+"<p>";
               
                	
                }
                
        	 }catch (ClassNotFoundException e) {
 				
 				e.printStackTrace();
 			}
        	 Testcnx.conn.close();
        	 return message;
     }
       
      
	 public static String  select2() throws SQLException {
  	   ResultSet rss;
  	   String message="";
  	   
  	   String sql="select expediteur,message,dats from groups";
  	  
        	 try {
     			
     			Testcnx.conn();
     			
     			prt =Testcnx.conn.prepareStatement(sql);
              rss = prt.executeQuery();
                while (rss.next()) {
                String  ex = rss.getString("expediteur");
                String   ms = rss.getString("message");
                String   date = rss.getString("dats"); 
                 message +=date+":"+"group:"+ex+":"+"  '"+ms+"'"+"<p>";
               
                	
                }
                
        	 }catch (ClassNotFoundException e) {
 				
 				e.printStackTrace();
 			}
        	 Testcnx.conn.close();
        	 return message;
     }
     


	 public static String  select3(String emails) throws SQLException {
  	   ResultSet rss;
  	   String message="";
  	   
  	   String sql="SELECT email,psw FROM `utilisateur` WHERE email='"+emails+"'";
  	  
        	 try {
     			
     			Testcnx.conn();
     			
     			prt =Testcnx.conn.prepareStatement(sql);
              rss = prt.executeQuery();
                while (rss.next()) {
                String email = rss.getString("email");
                String   psw = rss.getString("psw");                      	 
                 message +=email+":"+psw;
                }
                
        	 }catch (ClassNotFoundException e) {
 				
 				e.printStackTrace();
 			}
        	 Testcnx.conn.close();
        	 return message;
     }
	 
	 
	 public static String  date() {
    	 Date maintenant1 = new Date(System.currentTimeMillis());
  		 Calendar cal =new GregorianCalendar();
  		 int seconde= cal.get(Calendar.SECOND);
  		 int munite= cal.get(Calendar.MINUTE);
  		 int heur= cal.get(Calendar.HOUR);
  		 String dats=""+maintenant1+"/"+heur+":"+munite+":"+seconde;
        	   
  		    return dats;
         }
	 
	 
	 public static void groups(String expediteur,String message,String date) throws ClassNotFoundException {
  	   
  	   String sql="INSERT INTO groups (expediteur,message,dats) VALUES (?,?,?);";
  	   
  	   try {
 			Testcnx.conn();
 			prt = Testcnx.conn.prepareStatement(sql);
 			prt.setString(1, expediteur);
 			prt.setString(2, message);
 			prt.setString(3, date);
 			rs = prt.executeUpdate();
 			Testcnx.conn.close();
 			} catch (SQLException e) {
 				
 				e.printStackTrace();
 				} 
 			
     }
  	   
  	   


}
