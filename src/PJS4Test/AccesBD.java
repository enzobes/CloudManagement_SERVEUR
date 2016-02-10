package PJS4Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesBD {
	private String login = "root";
	private String password = "";
	private String url = "jdbc:mysql://82.239.180.17:3306/CloudManagement"; 
	Connection connexion;
	Statement st;  //Statement st
	Connection connection;
	public AccesBD() throws ClassNotFoundException, SQLException{
		
		// 1. Enregistrer(charger en m�moire) le driver JDBC d'Oracle 
		Class.forName("org.mariadb.jdbc.Driver");
		//2. Ouvrir une connexion avec le SGBD 
		//Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "username", "password");
		connexion = DriverManager.getConnection(url, login, password);
		//4. Envoyer la requete SQL au SGBD pour ex�cution 
		//st = connexion.createStatement(); 
		st = connexion.createStatement();	
		}
	
	public void afficherUser(String user) throws ClassNotFoundException, SQLException{
		//Executer la requete 
		ResultSet resultat = st.executeQuery("SELECT PrenomUtilisateur, NomUtilisateur, AdresseEmail FROM utilisateur;");

		//3. Cr�e la requette de consultation de tous les avions 
		
		 //contient les resultats de la requ�te sql
		//5. Afficher les r�sultats 
		while(resultat.next()){
			String nomUtilisateur = resultat.getString("NomUtilisateur");
			String prenomUtilisateur = resultat.getString("PrenomUtilisateur");
			String adresseEmail  = resultat.getString("AdresseEmail");
			System.out.println("Prenom : " + prenomUtilisateur + " - Nom : " + nomUtilisateur + " - Email: " + adresseEmail);
			
		}
		
		
		resultat.close();
	}
	
	public void finalize () throws SQLException{
		//Destructeur de la classe
		//6. Fermer les connexions ouvertes
		st.close();
		connection.close();
	}
}
/*
DriverManager 	Charger et configurer le driver de la base de donn�es.
Connection 	R�aliser la connexion et l'authentification � la base de donn�es.
Statement (et PreparedStatement) 	Contenir la requ�te SQL et la transmettre � la base de donn�es.
ResultSet 	Parcourir les informations retourn�es par la base de donn�es dans le cas d'une s�lection de donn�es
http://www.jmdoudoux.fr/java/dej/chap-jdbc.htm
*/