package tache;

import etatTache.ITaskState;
import etatTache.NotStartTask;
import exception.StateException;

public abstract class TaskAbstract {
	public ITaskState state;
	
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
