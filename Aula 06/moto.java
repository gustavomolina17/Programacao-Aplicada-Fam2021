// Criação da Classe

public class moto {

    // Criação dos atributos

    int cilindradas;
    String combustível;
    boolean ligada;
    double velocidadeMaxima;
    double velocidadeAtual;
    double velocidadeAtualizada;

    // Criação dos métodos (ações)

    void ligar() {
        ligada = true;
        System.out.println("A moto está ligada.");
    }

    void desligar() {
        ligada = false;
        System.out.println("A moto está desligada.");
    }

    void buzinar() {
        System.out.println("BIBI!!!");
    }

}
