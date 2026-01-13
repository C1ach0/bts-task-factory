package fr.rosydev.task;

import fr.rosydev.task.Task;

public interface TaskDAO {
	Task saveTask(Task task);
	
	Task findTaskById(Integer id);
}
