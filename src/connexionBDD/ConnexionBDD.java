package connexionBDD;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class ConnexionBDD {
	private String userMailAdress;
	private String password;
	String url="A voir"; //� compl�ter
	
	Connection connexion;
	PreparedStatement statement;
	
	public ConnexionBDD() throws SQLException, ClassNotFoundException {
		//On d�clare le driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//On ouvre une connexion avec le sgbd
		connexion = (Connection) DriverManager.getConnection(url, userMailAdress, password); //� completer
		
		//Envoie la requ�te
		statement = connexion.prepareStatement();
	}
}
