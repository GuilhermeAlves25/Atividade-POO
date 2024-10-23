public class SaladeCinema {
    private String numero;
    private int capacidade;
    private Filme filme;

    public SaladeCinema(String numero, int capacidade, Filme filme) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.filme = filme;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

}
