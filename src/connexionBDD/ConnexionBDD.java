package connexionBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnexionBDD {
	private String userMailAdress;
	private String password;
	String url="jdbc:mysql://82.239.180.17:3306/CloudManagement"; //� compl�ter
	
	Connection connexion;
	PreparedStatement statement;
	
	public ConnexionBDD() throws SQLException, ClassNotFoundException {
		//On d�clare le driver
		Class.forName("com.mariadb.jdbc.Driver");
		
		//On ouvre une connexion avec le sgbd
		connexion = (Connection) DriverManager.getConnection(url, userMailAdress, password); //� completer
		
		//Envoie la requ�te
		statement = connexion.prepareStatement();
	}
}
