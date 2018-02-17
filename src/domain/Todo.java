package domain;

import java.util.Date;

public class Todo extends ComplexAction {
	//Fields
	private Frequency frequencia;
	
	//Methods
	public Todo(String name, String note, String difficulty, String tag, String[] checklist, Date[] reminders,
			Frequency frequencia) {
		super(name, note, difficulty, tag, checklist, reminders);
		this.frequencia = frequencia;
	}
	
	//Getters & Setters
	public Frequency getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Frequency frequencia) {
		this.frequencia = frequencia;
	}
}
