package PJS4Test;

import java.sql.SQLException;


public class AppliBD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesBD bd = new AccesBD();
		System.out.println("Utilisateurs ");
		bd.afficherUser("NomUtilisateur");

	}

}
