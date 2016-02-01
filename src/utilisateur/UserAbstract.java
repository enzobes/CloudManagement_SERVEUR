package utilisateur;

import java.util.ArrayList;
import java.util.List;

import projet.ProjectAbstract;

public abstract class UserAbstract extends UserProfile{
	private List<ProjectAbstract> userProjectList;

	protected UserAbstract(String firstName, String lastName, String userName, int sexe, String mailAdress, String password) {
		super(firstName, lastName, userName, sexe, mailAdress, password);
		// TODO Auto-generated constructor stub
		userProjectList = new ArrayList<ProjectAbstract>();
	}
	
	
	
}
