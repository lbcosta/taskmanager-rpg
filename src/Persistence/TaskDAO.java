package Persistence;

import Model.Task;

import java.util.ArrayList;

public interface TaskDAO {
	//CRUD - CREATE READ UPDATE DELETE
	public void createAction(Task action);
	public Task readAction(int id);
	public boolean uptadeAction(Task action);
	public boolean deleteAction(int id);
	public ArrayList<Task> filterAction(String tag);

}
