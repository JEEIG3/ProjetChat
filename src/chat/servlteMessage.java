package chat;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import testcnx.asdd;



@WebServlet("/servlteMessage")
public class servlteMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String ms;
	static String msg;
	public servlteMessage() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		//PrintWriter out = response.getWriter();
		
		String expediteur = request.getParameter("expediteur");
		String destinataire = request.getParameter("destinataire");
		String message = request.getParameter("message");
		
		String date= asdd.date();
		
		String test= destinataire+""; 
		  
		if(test.equals("groupe")) {
		  try {
			asdd.groups(expediteur, message,date);
		} catch (ClassNotFoundException e2) {
		
			e2.printStackTrace();}  }
		
		
		
		
		else {
		try {
			asdd.insert(expediteur, destinataire, message,date);
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();}}
		
		
		
	}
	
}