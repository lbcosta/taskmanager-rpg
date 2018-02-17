package dao;
import java.util.List;
import domain.Habit;

public interface HabitDAO {
	//CRUD - CREATE READ UPDATE DELETE
	public void createHabit(Habit habit);
	public List<Habit> filterByInfluence(boolean influence);
	public List<Habit> filterByTag(String tag);
	public void uptadeHabit(String habitName);
	public void deleteHabit(String habitName);
}
