package utilisateur;

public abstract class UserProfile {
	
	
	private String firstName;
	private String lastName;
	private String userName;
	private int sexe;
	private String mailAdress;
	private String password;
	
	protected UserProfile (String firstName, String lastName, String userName, int sexe, String mailAdress, String password){
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.sexe = sexe;
		this.mailAdress = mailAdress;
		this.password = password;
	}
	
	
	/*
	 * Il faut coder tout ça en faisant des requêtes à la base de donnée
	 */
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getUsername(){
		return this.userName;
	}
	
	public void setUserName (String newUserName) {
		this.userName = newUserName;
	}
	
	public int getSexe(){
		return this.sexe;
	}
	
	public String getMailAdress(){
		return mailAdress;
	}
	
	public void setPassword(String password){
		this.password = password;
	}

}
