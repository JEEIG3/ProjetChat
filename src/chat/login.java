package chat;


import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import testcnx.asdd;
import testcnx.user;



@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static PreparedStatement prt;
	static Statement st = null;
	static ResultSet rs = null;
	static PrintWriter out;
	static RequestDispatcher req;
	static String test; 
	 
	public login() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		out = response.getWriter();
		 
		String email=request.getParameter("email2");
		String psw=request.getParameter("psw2");
	    String t1=""+email;
	    String t2=""+psw;
	    
	  	       
	    user User = new user();
	    if(t1.equals("") || t2.equals("")) {
			User.setFirstname(request.getParameter("firstname"));
			User.setLastname(request.getParameter("lastname"));
			User.setEmail(request.getParameter("email"));
			User.setPsw(request.getParameter("psw")); 
 		    
			req=request.getRequestDispatcher("servlteMessage");
 		    req.forward(request, response);
			 try {
					asdd.adduser(User);
				} catch (ClassNotFoundException | SQLException e) {
					
					e.printStackTrace();
				}
		    }
				  
	    
	    
	    else {
	    	   try {
			 
	    		   test= asdd.select3(email);
			
	    	   } catch (SQLException e) {
				e.printStackTrace();
			}
	    	   if(test.equals(t1+":"+t2)) {
	    		  req=request.getRequestDispatcher("servlteMessage");
		 		  req.forward(request, response);   
	    	   }else
	    		   out.println("voutre mout de pase ou email incorrect");
	    	       out.println("hello"+email);
	    	       out.println(t1+":"+t2);
	       
	    	  
	       }
	    
	    
	   
	    
	  	       
	  
				
				
	
}
	
}
