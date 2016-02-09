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
