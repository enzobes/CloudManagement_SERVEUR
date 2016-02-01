package team;

import java.util.ArrayList;
import java.util.List;

import utilisateur.UserAbstract;

public abstract class TeamAbstract {
	private String teamName;
	private UserAbstract teamBoss;
	private List<UserAbstract> users;
	
	public TeamAbstract(String teamName, UserAbstract user){
		this.teamName = teamName;
		teamBoss = user;
		users = new ArrayList<UserAbstract>();
		users.add(user);
	}
	
	public void addUser(UserAbstract user){
		if(users.contains(user)){
			return ;
		}
		users.add(user);
	}
	
	public void removeUser(UserAbstract user){
		if(!users.contains(user)){
			return ;
		}
		users.remove(user);
	}
}
