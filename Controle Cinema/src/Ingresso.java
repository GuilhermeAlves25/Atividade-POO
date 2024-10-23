
public class Ingresso {
    private Cliente cliente;
    private String tipo;
    private SaladeCinema sala;

    public Ingresso(String tipo, SaladeCinema sala,Cliente cliente) {
        this.tipo = tipo;
        this.sala = sala;
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public SaladeCinema getSala() {
        return sala;
    }

    public void setSala(SaladeCinema sala) {
        this.sala = sala;
    }
}
