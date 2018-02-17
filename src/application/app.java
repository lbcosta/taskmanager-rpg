package application;
import dao.*;
import domain.*;
import java.util.*;
import domain.Item;
import domain.Status;

public class app {
	public static void main(String[] args) {
		//O usuario jamais deverá poder alterar o nome do avatar depois de criado.
		//Todos: - Montar um shopping onde ficam armazenados os items.
		
		//Testes:
		Status status = new Status();
		Item item1 = new Item("Espada","Strenght",10);
		Item item2 = new Item("Escudo", "Constitution",10);
		ArrayList<Item> items = new ArrayList<Item>();
		
		items.add(item1);
		items.add(item2);
		
		Avatar avatar = new Avatar("Fulanin", 1, 100, 0, status, 10, items);
		
		AvatarDAOTxt dao = new AvatarDAOTxt();
		
		dao.createAvatar(avatar);
		
		items.add(new Item("Cajado", "Intelligence", 40));
		Avatar avatar2 = new Avatar("Fulanin", 70, 100, 0, status, 10, items);
		
		dao.uptadeAvatar(avatar2);
		
		
	}
	
}
