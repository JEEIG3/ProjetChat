package testcnx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author public
 */
public class Testcnx {

	public static Connection conn;
	static String url = "jdbc:mysql://localhost/jee";
	static String utilisateur = "root";
	static String motDePasse = "";
	static PreparedStatement prt;
	static Statement st = null;
	static ResultSet rs = null;

	static String login;
	static String psw;

	public static Connection conn() throws ClassNotFoundException{
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url, utilisateur, motDePasse);

			System.out.println("connected");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
			System.out.println(e);

		}
        return null;
	}
}
