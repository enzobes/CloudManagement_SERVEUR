package etatTache;

import exception.StateException;
import tache.TaskAbstract;

public class FinishedTask implements ITaskState {


	@Override
	public void begin(TaskAbstract task) {
		task.setState(new InProgressTask());		
	}

	@Override
	public void finish(TaskAbstract task) throws StateException {
		throw new StateException("AllReadyFinished");
	}
	
}
