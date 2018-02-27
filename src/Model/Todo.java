package Model;

import java.util.ArrayList;

public class Todo extends ComplexTask {
	//Fields
		private String dueDate;
		
		//Methods
		public Todo(String name, String note, String difficulty, String tag, ArrayList<String> checklist, ArrayList<String> reminders,
				String dueDate) {
			super(name, note, difficulty, tag, checklist, reminders);
			this.dueDate = dueDate;
		}

		//Getters & Setters
		public String getDueDate() {
			return dueDate;
		}

		public void setDueDate(String dueDate) {
			this.dueDate = dueDate;
		}
}
