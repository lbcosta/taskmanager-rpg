package domain;
import java.util.ArrayList;
public class Daily extends ComplexAction {
	//Fields
	private Frequency frequency;
	
	//Methods
	public Daily(String name, String note, String difficulty, String tag, ArrayList<String> checklist, ArrayList<String> reminders,
			Frequency frequencia) {
		super(name, note, difficulty, tag, checklist, reminders);
		this.frequency = frequencia;
	}
	
	//Getters & Setters
	public Frequency getFrequencia() {
		return frequency;
	}

	public void setFrequencia(Frequency frequencia) {
		this.frequency = frequencia;
	}
}
