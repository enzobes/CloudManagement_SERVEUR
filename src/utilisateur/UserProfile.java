package utilisateur;

public abstract class UserProfile {
	
	
	private String name;
	private String userName;
	private int sexe;
	private String mailAdress;
	private String password;
	
	protected UserProfile (String name, String userName, int sexe, String mailAdress, String password){
		this.name = name;
		this.userName = userName;
		this.sexe = sexe;
		this.mailAdress = mailAdress;
		this.password = password;
	}
	
	
	/*
	 * Il faut coder tout ça en faisant des requêtes à la base de donnée
	 */
	protected String getName(){
		return this.name;
	}
	
	protected String getUsername(){
		return this.userName;
	}
	
	protected void setUserName (String newUserName) {
		this.userName = newUserName;
	}
	
	protected int getSexe(){
		return this.sexe;
	}
	
	protected String getMailAdress(){
		return mailAdress;
	}
	
	protected void setPassword(String password){
		this.password = password;
	}

}
