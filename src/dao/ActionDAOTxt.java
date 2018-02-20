package dao;
import java.io.*;
import java.util.ArrayList;

import domain.Action;
import domain.Daily;
import domain.Habit;
import domain.Todo;

public class ActionDAOTxt implements ActionDAO {
	public static ArrayList<Action> actions = new ArrayList<Action>();
	//Action type will be checked with instanceof
	
	@Override
	public void createAction(Action action) {
		actions.add(action);
		writeAction();
	}

	@Override
	public Action readAction(int id) {
		for(Action aux : actions) {
			if(aux.getId() == id) {
				return aux;
			}
		}
		return null;
	}

	@Override
	public boolean uptadeAction(Action action) {
		Action aux = readAction(action.getId());
		if(aux != null) {
			actions.set(actions.indexOf(aux), action); //Substitui o elemento que bate com o Id pelo dado para update... Será???
			writeAction();
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean deleteAction(int id) {
		Action aux = readAction(id);
		if(aux != null) {
			actions.remove(aux);
			writeAction();
		}
		return false;
	}

	@Override
	public ArrayList<Action> filterAction(String tag) {
		ArrayList<Action> aux = new ArrayList<Action>();
		for(Action action : actions) {
			if(action.getTag().contains(tag)){
				aux.add(action);
			}
		}
		return aux;
	}
	
	public void writeAction() {
		//Como tratar escrever todos os atritubos dos filhos da Action tratando ela de maneira geral (como Action)?
		File f = new File("actions.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			for(Action aux : actions) {
				if(aux.getClass() == Habit.class) {
					Habit h = (Habit) aux;
					bw.write(Integer.toString(h.getId()) + ";" + h.getName() + ";" + h.getNote() + ";" + 
											  h.getDifficulty() + ";" + h.getTag() + ";" + 
											  Boolean.toString(h.isInfluence()));	
				}
				if(aux.getClass() == Daily.class ) {
					Daily d = (Daily) aux;
					bw.write(Integer.toString(d.getId()) + ";" + d.getName() + ";" + d.getNote() + ";" + 
							  d.getDifficulty() + ";" + d.getTag() + ";" + 
							  d.arrayToString(d.getChecklist()) + d.arrayToString(d.getReminders()) + 
							  "Frequencia");
				}
				if(aux.getClass() == Todo.class ) {
					Todo t = (Todo) aux;
					bw.write(Integer.toString(t.getId()) + ";" + t.getName() + ";" + t.getNote() + ";" + 
							  t.getDifficulty() + ";" + t.getTag() + ";" + 
							  t.arrayToString(t.getChecklist()) + t.arrayToString(t.getReminders()) + 
							  t.getDueDate());
				}
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
