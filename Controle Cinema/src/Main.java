//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Filme filme1 = new Filme("A Aventura", "Ação", 120.0);
        SaladeCinema sala1 = new SaladeCinema("1", 100, filme1);
        Cliente cliente1 = new Cliente("123.456.789-00", "João", "Rua A, 123");
        Ingresso ingresso1 = new Ingresso("Normal", sala1, cliente1);

        System.out.println("Cliente: " + ingresso1.getCliente().getNome() +
                " comprou um ingresso do tipo " + ingresso1.getTipo() +
                " para o filme " + sala1.getFilme().getNome() +
                " na sala " + sala1.getNumero());


    }
}