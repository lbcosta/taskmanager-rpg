package Controller;

import Model.UserRVL;
import Persistence.UserTxtDAO;

import java.io.File;

public class Main {
    public static void main(String[] args) {

//        File a = new File("C:\\Users\\rodri\\IdeaProjects\\TaskManagerLeo\\src\\Users\\");
//        File[] files = a.listFiles();
//        System.out.println(files[0].getName());
        UserRVL Rodrigo = new UserRVL(null, null, "Rodrigo", null, 654, 11, 5, 4, 1);
        UserRVL Thaís = new UserRVL(null, null, "Thais", null, 654, 11, 5, 4, 2);
        UserRVL Leo = new UserRVL(null, null, "Leo", null, 654, 11, 5, 4, 3);

        UserTxtDAO uhul = new UserTxtDAO();
        uhul.inserir(Rodrigo);
        uhul.inserir(Leo);
        uhul.inserir(Thaís);

        
    }
}
