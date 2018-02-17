package dao;
import java.io.*;
import java.util.ArrayList;
import domain.Avatar;
import domain.Item;
import domain.*;


public class AvatarDAOTxt implements AvatarDAO {
	private static final String fileName = "avatar.txt";
	private static ArrayList<Avatar> avatars = new ArrayList<Avatar>();

	@Override
	public void createAvatar(Avatar avatar) {
		avatars.add(avatar);
		writeAvatar();

	}

	@Override
	public void uptadeAvatar(Avatar avatar) {

		for (Avatar a : avatars) {
			if (a.getName() == avatar.getName()) {
				a.setLevel(avatar.getLevel());
				a.setHealth(avatar.getHealth());
				a.setExperience(avatar.getExperience());
				a.setStatus(avatar.getStatus());
				a.setGold(avatar.getGold());
				a.setItems(avatar.getItems());
			}
		}

		writeAvatar();
	}

	private void writeAvatar() {
		File f = new File(fileName);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);

			for (Avatar a : avatars) {
				bw.write(stringMe(a));
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void readAvatar() {
		File f = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);

			String line = br.readLine();
			String[] fields = line.split(";");
			initializeAvatar(fields);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public String stringMe(Avatar avatar) {
		ArrayList<String> items = new ArrayList<>();
		for (Item item : avatar.getItems()) {
			items.add(item.getName());
			items.add(item.getStatus());
			items.add(Integer.toString(item.getBuff()));
		}

		return avatar.getName() + ";" + Integer.toString(avatar.getLevel()) + ";" + Integer.toString(avatar.getHealth())
				+ ";" + Double.toString(avatar.getExperience()) + ";"
				+ Integer.toString(avatar.getStatus().getStrength()) + ";"
				+ Integer.toString(avatar.getStatus().getIntelligence()) + ";"
				+ Integer.toString(avatar.getStatus().getConstitution()) + ";"
				+ Integer.toString(avatar.getStatus().getPerception()) + ";" + Integer.toString(avatar.getGold()) + ";"
				+ String.join(";", items);
	}

	public void initializeAvatar(String[] fields) {
		Status tempStatus = new Status();
		tempStatus.setStrength(Integer.parseInt(fields[4]));
		tempStatus.setIntelligence(Integer.parseInt(fields[5]));
		tempStatus.setConstitution(Integer.parseInt(fields[6]));
		tempStatus.setPerception(Integer.parseInt(fields[7]));

		ArrayList<Item> tempItems = new ArrayList<>();

		for (int i = 9; i < fields.length; i += 3) {
			tempItems.add(new Item(fields[i], fields[i + 1], Integer.parseInt(fields[i + 2])));
		}

		Avatar avatar = new Avatar(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2]),
				Double.parseDouble(fields[3]), tempStatus, Integer.parseInt(fields[8]), tempItems);

		avatars.add(avatar);
	}
}
