package Controller;

import Model.User;
import Persistence.UserTxt;

public class Main {
    public static void main(String[] args) {

//        File a = new File("C:\\Users\\rodri\\IdeaProjects\\TaskManagerLeo\\src\\Users\\");
//        File[] files = a.listFiles();
//        System.out.println(files[0].getName());
        User Rodrigo = new User(null, null, "Rodrigo", null, 654, 11, 5, 4, 1);
        User Thaís = new User(null, null, "Thais", null, 654, 11, 5, 4, 2);
        User Leo = new User(null, null, "Leo", null, 654, 11, 5, 4, 3);

        UserTxt uhul = new UserTxt();
        uhul.insert(Rodrigo);
        uhul.insert(Leo);
        uhul.insert(Thaís);
    }
}
