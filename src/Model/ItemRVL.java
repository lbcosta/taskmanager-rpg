package Model;

public class ItemRVL {
    private String nome;
    private String descrição;
    private int price;
    private int bonusForça;
    private int bonusInteligencia;
    private int bonusAgilidade;
    private int bonusConstituição;

    public ItemRVL(String nome, String descrição, int price, int bonusForça, int bonusInteligencia, int bonusAgilidade, int bonusConstituição) {
        this.nome = nome;
        this.descrição = descrição;
        this.price = price;
        this.bonusForça = bonusForça;
        this.bonusInteligencia = bonusInteligencia;
        this.bonusAgilidade = bonusAgilidade;
        this.bonusConstituição = bonusConstituição;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBonusForça() {
        return bonusForça;
    }

    public void setBonusForça(int bonusForça) {
        this.bonusForça = bonusForça;
    }

    public int getBonusInteligencia() {
        return bonusInteligencia;
    }

    public void setBonusInteligencia(int bonusInteligencia) {
        this.bonusInteligencia = bonusInteligencia;
    }

    public int getBonusAgilidade() {
        return bonusAgilidade;
    }

    public void setBonusAgilidade(int bonusAgilidade) {
        this.bonusAgilidade = bonusAgilidade;
    }

    public int getBonusConstituição() {
        return bonusConstituição;
    }

    public void setBonusConstituição(int bonusConstituição) {
        this.bonusConstituição = bonusConstituição;
    }
}
