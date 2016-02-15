package connexionBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnexionBDD {
	private String userMailAdress;
	private String password;
	String url="jdbc:mysql://82.239.180.17:3306/CloudManagement"; //à compléter
	
	Connection connexion;
	PreparedStatement statement;
	
	public ConnexionBDD() throws SQLException, ClassNotFoundException {
		//On déclare le driver
		Class.forName("com.mariadb.jdbc.Driver");
		
		//On ouvre une connexion avec le sgbd
		connexion = (Connection) DriverManager.getConnection(url, userMailAdress, password); //à completer
		
		//Envoie la requête
		statement = connexion.prepareStatement();
	}
}
