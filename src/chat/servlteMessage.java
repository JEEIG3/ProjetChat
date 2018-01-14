package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

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
		
		
		
	}
	
}