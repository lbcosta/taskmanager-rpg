package Model;

import java.io.Serializable;

public class StatusRVL implements Serializable{
    private int força;
    private int inteligência;
    private int constituição;
    private int agilidade;

    public StatusRVL(int força, int inteligência, int constituição, int agilidade) {
        this.força = força;
        this.inteligência = inteligência;
        this.constituição = constituição;
        this.agilidade = agilidade;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getInteligência() {
        return inteligência;
    }

    public void setInteligência(int inteligência) {
        this.inteligência = inteligência;
    }

    public int getConstituição() {
        return constituição;
    }

    public void setConstituição(int constituição) {
        this.constituição = constituição;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
}
