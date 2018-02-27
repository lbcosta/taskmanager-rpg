package Model;

import java.util.ArrayList;

public class TaskRVL {
    //Propriedades
    private int id;
    private String nome;
    private byte dificuldade;
    private ArrayList<String> tags;
    private ArrayList<String> observações;

    //Construtor primário
    public TaskRVL() {

    }

    //Construtor secundário


    public TaskRVL(int id, String nome, byte dificuldade, ArrayList<String> tags, ArrayList<String> observações) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.tags = tags;
        this.observações = observações;
    }

    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(byte dificuldade) {
        this.dificuldade = dificuldade;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public ArrayList<String> getObservações() {
        return observações;
    }

    public void setObservações(ArrayList<String> observações) {
        this.observações = observações;
    }
}
