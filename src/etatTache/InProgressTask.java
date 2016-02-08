package etatTache;

import exception.StateException;
import tache.TaskAbstract;

public class InProgressTask implements ITaskState {

	@Override
	public void begin(TaskAbstract task) throws StateException {
		throw new StateException("AllreadyInProgress");
	}

	@Override
	public void finish(TaskAbstract task) {
		task.setState(new FinishedTask());	
	}
	
}
