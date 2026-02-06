package fabiocarlino.u5l4.entities;

public abstract class Prodotto {
    private String nome;
    private int calorie;
    private double prezzo;

    public Prodotto(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public int getCalories() {
        return calorie;
    }

    public void setCalories(int calorie) {
        this.calorie = calorie;
    }

    public double getPrice() {
        return prezzo;
    }

    public void setPrice(double prezzo) {
        this.prezzo = prezzo;
    }
}
