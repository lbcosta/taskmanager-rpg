package application;
import dao.*;
import domain.*;
import java.util.*;


public class app {
	public static void main(String[] args) {
		//O usuario jamais deverá poder alterar o nome do avatar depois de criado.
		
		//Adicionando umm Avatar
		Item item1 = new Item("Espada","Strenght",10);
		Item item2 = new Item("Escudo", "Constitution",10);
		ArrayList<Item> items = new ArrayList<Item>();
		
		items.add(item1);
		items.add(item2);
		
		Avatar avatar = new Avatar("Fulanin", 1, 100, 0, new Status(), 10, items);
		
		AvatarDAOTxt dao = new AvatarDAOTxt();
		
		dao.createAvatar(avatar);
		
		items.add(new Item("Cajado", "Intelligence", 40));
		Avatar avatar2 = new Avatar("Fulanin", 70, 100, 0, new Status(), 10, items);
		
		dao.uptadeAvatar(avatar2);
		
		//Adicionando uma action:
		
		ArrayList<String> cl = new ArrayList<String>();
		
		cl.add("Levar Dinheiro");
		cl.add("Ir ao banco");
		
		ArrayList<String> rm = new ArrayList<String>();
		
		rm.add("15:00");
		rm.add("16:00");
		
		Todo td1 = new Todo("Pagar conta", "Conta de energia atrasada", "Medium", "Contas", cl,rm,"20/02/2018 18:00");
		
		ActionDAOTxt aDao = new ActionDAOTxt();
		
		aDao.createAction(td1);
		
		Todo td2 = new Todo("Pegar documento", "Carteira de identidade", "Easy", "Docs", cl,rm,"21/02/2018 17:00");
		
		aDao.createAction(td2);
		
		

		
		
	}
	
}
