package Model;

public class ChecklistItem {
    private boolean feito;
    private String nome;

    public ChecklistItem(boolean feito, String nome) {
        this.feito = feito;
        this.nome = nome;
    }

    public boolean isFeito() {
        return feito;
    }

    public void setFeito(boolean feito) {
        this.feito = feito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
