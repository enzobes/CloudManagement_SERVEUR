package etatTache;

import exception.StateException;
import tache.TaskAbstract;

public interface ITaskState {
	public abstract void begin(TaskAbstract task) throws StateException;
	public abstract void finish(TaskAbstract task) throws StateException;
}
