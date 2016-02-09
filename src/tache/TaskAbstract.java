package tache;

import java.util.ArrayList;
import java.util.List;

import utilisateur.UserAbstract;
import etatTache.ITaskState;
import etatTache.NotStartTask;
import exception.StateException;

public abstract class TaskAbstract {
	private String taskName;
	private String taskDescription;
	private List<UserAbstract> userOnTask;
	private ITaskState state;
	
	
	public TaskAbstract(String taskName, String taskDescription){
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		userOnTask = new ArrayList<UserAbstract>();
		this.create();
	}
	
	public TaskAbstract(String taskName){
		this.taskName = taskName;
		userOnTask = new ArrayList<UserAbstract>();
		this.create();
	}
	
	/*Changes on userOnTask */
	public void addUserOnTask(UserAbstract u){
		this.userOnTask.add(u);
	}
	
	public void removeUserOnTask(UserAbstract u){
		if(this.userOnTask.contains(u))
			this.userOnTask.remove(u);
	}
	
	/*changes on the task's name*/
	public void setName(String name){
		this.taskName = name;
	}
	
	public String getName(){
		return this.taskName;
	}
	
	/*changes on task's description*/
	public void setDescription(String description){
		this.taskDescription = description;
	}
	
	public String getDescription(){
		return this.taskDescription;
	}
	
	/*changes on the task's state*/
	public void create() {
		state = new NotStartTask();
	}

	public void begin() throws StateException {
		this.state.begin(this);
	}

	public void finish() throws StateException {
		this.state.finish(this);
	}
	
	public void setState(ITaskState state){
		this.state = state;
	}
	
}
