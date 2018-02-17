package domain;
import java.util.Date;
public class Daily extends ComplexAction {
	//Fields
	private Date dueDate;
	
	//Methods
	public Daily(String name, String note, String difficulty, String tag, String[] checklist, Date[] reminders,
			Date dueDate) {
		super(name, note, difficulty, tag, checklist, reminders);
		this.dueDate = dueDate;
	}

	//Getters & Setters
	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
}
