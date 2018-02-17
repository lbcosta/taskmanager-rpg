package dao;
import java.util.List;
import domain.Todo;

public interface TodoDAO {
	//CRUD - CREATE READ UPDATE DELETE
	public void createTodo(Todo todo);
	public List<Todo> filterByTag(String tag);
	public void uptadeTodo(String todoName);
	public void deleteTodo(String todoName);
}
