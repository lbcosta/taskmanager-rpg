package dao;
import java.io.*;
import java.util.ArrayList;

import domain.Action;

public class ActionDAOTxt implements ActionDAO {
	public static ArrayList<Action> actions;
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
//		File f = new File("actions.txt");
//		FileWriter fw = null;
//		BufferedWriter bw = null;
//		
//		try {
//			fw = new FileWriter(f);
//			bw = new BufferedWriter(fw);
//			for(Action aux : actions) {
//				bw.write();
//			}
//		}
		
	}

}
