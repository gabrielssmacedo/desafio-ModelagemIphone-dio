package entities.interfaces;

public interface AparelhoTelefonico {

    void ligar(String numero);
    void desligar();
    void atender();
    void selecionarContato(String numero);
    void checarCorreioVoz();

}
