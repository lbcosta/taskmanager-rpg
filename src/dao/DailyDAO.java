package dao;
import java.util.List;
import domain.Daily;

public interface DailyDAO {
	//CRUD - CREATE READ UPDATE DELETE
	public void createDaily(Daily daily);
	public List<Daily> filterByTag(String tag);
	public void uptadeDaily(String dailyName);
	public void deleteDaily(String dailyName);
}
