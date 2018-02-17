package domain;
import java.util.Date;
public class ComplexAction extends Action {
	//Fields
	private String[] checklist;
	private Date[] reminders;
	
	//Methods
	public ComplexAction(String name, String note, String difficulty, String tag, String[] checklist,
			Date[] reminders) {
		super(name, note, difficulty, tag);
		this.checklist = checklist;
		this.reminders = reminders;
	}
	
	//Getters & Setters
	public String[] getChecklist() {
		return checklist;
	}
	public void setChecklist(String[] checklist) {
		this.checklist = checklist;
	}
	public Date[] getReminders() {
		return reminders;
	}
	public void setReminders(Date[] reminders) {
		this.reminders = reminders;
	}
	
	
	
}
