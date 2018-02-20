package domain;
import java.util.*;
public class ComplexAction extends Action {
	//Fields
	private ArrayList<String> checklist;
	private ArrayList<String> reminders;
	
	//Methods
	public ComplexAction(String name, String note, String difficulty, String tag, ArrayList<String> checklist,
			ArrayList<String> reminders) {
		super(name, note, difficulty, tag);
		this.checklist = checklist;
		this.reminders = reminders;
	}
	
	//Getters & Setters
	public ArrayList<String> getChecklist() {
		return checklist;
	}
	public void setChecklist(ArrayList<String> checklist) {
		this.checklist = checklist;
	}
	public ArrayList<String> getReminders() {
		return reminders;
	}
	public void setReminders(ArrayList<String> reminders) {
		this.reminders = reminders;
	}
	public String stringCheckList() {
		String itemString = new String();
		for(String item : this.checklist) {
			itemString.concat(item + ";");
		}
		return itemString;
	}
	public String stringReminders() {
		String reminderString = new String();
		for(String reminder : this.reminders) {
			reminderString.concat(reminder + ";");
		}
		return reminderString;
	}
	
	public String arrayToString(ArrayList<String> inputArray) {
		String outputString = new String();
		for(String element : inputArray) {
			outputString += element + ";";
		}
		return outputString;
	}
	
	
	
}
