package dao;

import java.util.ArrayList;
import domain.Action;

public interface ActionDAO {	
	//CRUD - CREATE READ UPDATE DELETE
	public void createAction(Action action);
	public Action readAction(int id);
	public boolean uptadeAction(Action action);
	public boolean deleteAction(int id);
	public ArrayList<Action> filterAction(String tag);

}
