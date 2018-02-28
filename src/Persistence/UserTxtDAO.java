package Persistence;

import Model.UserRVL;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UserTxtDAO implements UserDAO {
    private static final String filePath = "C:\\Users\\rodri\\IdeaProjects\\TaskManagerLeo\\src\\Users\\";
//    private static List<UserRVL> UsersAux = new ArrayList<UserRVL>();

    @Override
    public void inserir(UserRVL user) {
        //Perguntar sobre como resolver o problema de relacionamento, IDs etc
        //Perguntar como deixar o path relativo, para o programa funcionar em qualquer PC
        //Perguntar para o professor sobre retornar boolean para saber se o objeto foi inserido ou não.
        try {
            String nomeFile = filePath + user.getId() + ".txt";
            ObjectOutputStream objectStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(nomeFile)));
            objectStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remover(UserRVL user) {
        File caminho = new File(filePath);
        File[] filesdoDiretorio = caminho.listFiles();
        for (int r = 0; r < filesdoDiretorio.length; r++) {
            if (filesdoDiretorio[r].getName().equals(user.getId() + ".txt")) {
                filesdoDiretorio[r].delete();
            }
        }
    }

    @Override
    public void alterar(UserRVL user) {
        File caminho = new File(filePath);
        File[] filesdoDiretorio = caminho.listFiles();

    }

    @Override
    public UserRVL procurarPorID(int id) {
        UserRVL auxiliar = null;
        ObjectInputStream objectInputStream = null;

        File caminho = new File(filePath);
        File[] filesdoDiretorio = caminho.listFiles();
        for (int r = 0; r < filesdoDiretorio.length; r++) {
            if (filesdoDiretorio[r].getName().equals(id + ".txt")) {
                try {
                    objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get(filesdoDiretorio[r].getPath())));
                    auxiliar = (UserRVL) objectInputStream.readObject();
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return auxiliar;
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
//                bw.write(c.getCpf() + ";" + c.getNome() + ";" + c.getEmail() + ";" + c.getIdade() + ";" + c.isHabilitado());
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
//                UsersAux.add(new UserRVL(dados[0], dados[1], dados[2], Integer.parseInt(dados[3]), Boolean.parseBoolean(dados[4])));
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
