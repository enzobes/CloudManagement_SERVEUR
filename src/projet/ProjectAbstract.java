package projet;

import java.util.ArrayList;
import java.util.List;

import tache.TaskAbstract;
import team.TeamAbstract;
import utilisateur.UserAbstract;

public abstract class ProjectAbstract {
	private String projectName;
	private String projectDescription;
	//private List<UserAbstract> userOnProject; //On ajout les membres à l'équipe, on ne les affilies pas directement au projet
	private TeamAbstract teamOnProject;
	private List<TaskAbstract> taskOfProject;
	
	public ProjectAbstract(String name, String description, TeamAbstract team){
		this.projectName = name;
		this.projectDescription = description;
		this.teamOnProject = team;
		this.taskOfProject = new ArrayList<TaskAbstract>();
	}
	
	public ProjectAbstract(String name, String description){
		this.projectName = name;
		this.projectDescription = description;
		this.taskOfProject = new ArrayList<TaskAbstract>();
	}
	
	public ProjectAbstract(String name){
		this.projectName = name;
		this.taskOfProject = new ArrayList<TaskAbstract>();
	}
	
	/*Action on projectName*/
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/*Action on projectDescription*/
	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	
	
	/*Action on teamOnProject*/
	public void setTeamOnProject(TeamAbstract team){
		this.teamOnProject = team;
	}
	
	public void createTeam(String teamName, UserAbstract teamBoss){
		this.teamOnProject = new Team(teamName, teamBoss);
	}
	
	
	
}
