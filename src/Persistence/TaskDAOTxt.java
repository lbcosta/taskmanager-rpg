package Persistence;

import Model.Task;
import Model.Daily;
import Model.Habit;
import Model.Todo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TaskDAOTxt implements TaskDAO {
	public static ArrayList<Task> tasks = new ArrayList<Task>();
	//Task type will be checked with instanceof
	
	@Override
	public void createAction(Task task) {
		tasks.add(task);
		writeAction();
	}

	@Override
	public Task readAction(int id) {
		for(Task aux : tasks) {
			if(aux.getId() == id) {
				return aux;
			}
		}
		return null;
	}

	@Override
	public boolean uptadeAction(Task action) {
		Task aux = readAction(action.getId());
		if(aux != null) {
			tasks.set(tasks.indexOf(aux), action); //Substitui o elemento que bate com o Id pelo dado para update... Será???
			writeAction();
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean deleteAction(int id) {
		Task aux = readAction(id);
		if(aux != null) {
			tasks.remove(aux);
			writeAction();
		}
		return false;
	}

	@Override
	public ArrayList<Task> filterAction(String tag) {
		ArrayList<Task> aux = new ArrayList<Task>();
		for(Task action : tasks) {
			if(action.getTag().contains(tag)){
				aux.add(action);
			}
		}
		return aux;
	}
	
	public void writeAction() {
		//Como tratar escrever todos os atritubos dos filhos da Task tratando ela de maneira geral (como Task)?
		File f = new File("tasks.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			for(Task aux : tasks) {
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
