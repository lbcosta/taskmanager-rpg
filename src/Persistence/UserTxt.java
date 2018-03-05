package Persistence;

import Model.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UserTxt implements UserDAO {
    private static final String filePath = System.getProperty("user.dir") + "\\srcs\\Users\\";
//    private static List<User> UsersAux = new ArrayList<User>();

    @Override
    public void insert(User user) {
        try {
            String nameFile = filePath + user.getId() + ".txt";
            ObjectOutputStream objectStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(nameFile)));
            objectStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(User user) {
        File path = new File(filePath);
        File[] filesdoDiretorio = path.listFiles();
        for (int r = 0; r < filesdoDiretorio.length; r++) {
            if (filesdoDiretorio[r].getName().equals(user.getId() + ".txt")) {
                filesdoDiretorio[r].delete();
            }
        }
    }

    @Override
    public void change(User user) {
        File path = new File(filePath);
        File[] directoryFiles = path.listFiles();

    }

    @Override
    public User searchForId(int id) {
        User auxiliary = null;
        ObjectInputStream objectInputStream = null;

        File path = new File(filePath);
        File[] directoryFiles = path.listFiles();
        for (int r = 0; r < directoryFiles.length; r++) {
            if (directoryFiles[r].getName().equals(id + ".txt")) {
                try {
                    objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get(directoryFiles[r].getPath())));
                    auxiliary = (User) objectInputStream.readObject();
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return auxiliary;
            }
        }
        return null;
    }

//    private void escreverArquivo() {
//        File f = new File(ARQUIVO);
//        FileWriter fw = null;
//        BufferedWriter bw = null;
//
//        try {
//            fw = new FileWriter(f);
//            bw = new BufferedWriter(fw);
//
//            for (Cliente c : clientesAux) {
//                bw.write(c.getCpf() + ";" + c.getName() + ";" + c.getEmail() + ";" + c.getIdade() + ";" + c.isHabilitado());
//                bw.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bw.close();
//                fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    //Lendo o arquivo de texto e populando o ArrayList
//    static {
//        File f = new File(file);
//        FileReader fr = null;
//        BufferedReader br = null;
//
//        try {
//            fr = new FileReader(f);
//            br = new BufferedReader(fr);
//
//            String linha = null;
//
//            while ((linha = br.readLine()) != null) {
//                String[] dados = linha.split(";");
//
//                UsersAux.add(new User(dados[0], dados[1], dados[2], Integer.parseInt(dados[3]), Boolean.parseBoolean(dados[4])));
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                br.close();
//                fr.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
}
