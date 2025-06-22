package entities;

import entities.interfaces.AparelhoTelefonico;
import entities.interfaces.NavegadorInternet;
import entities.interfaces.ReprodutorMusical;

import java.time.OffsetDateTime;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;
    private double preco;
    private OffsetDateTime dataFabricacao;

    public Iphone(String modelo, double preco, OffsetDateTime dataFabricacao) {
        this.modelo = modelo;
        this.preco = preco;
        this.dataFabricacao = dataFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public OffsetDateTime getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(OffsetDateTime dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void ligarIphone() {
        System.out.println("Ligando iphone...");
    }

    public void desligarIphone() {
        System.out.println("Desligando iphone...");
    }

    public void aumentarVol() {
        System.out.println("Aumentando volume do iphone...");
    }

    public void diminuindoVol() {
        System.out.println("Diminuindo volume do iphone...");
    }

    public void home() {
        System.out.println("Home foi pressionado...");
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para %s\n", numero);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando chamada...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void selecionarContato(String numero) {
        System.out.printf("Selecionando contato de numero %s\n", numero);
    }

    @Override
    public void checarCorreioVoz() {
        System.out.println("Checando correio voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova pagina...");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando pagina...");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando aba...");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void parar() {
        System.out.println("Música terminou a reprodução");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Selecionando a música %s\n", musica);
    }
}
