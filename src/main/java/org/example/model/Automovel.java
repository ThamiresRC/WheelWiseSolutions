package org.example;

public abstract class Automovel {

    private String numeroPlaca, marcaCarro, modeloCarro, combustivelUtilizado;
    private Integer renavam;
    private int ano;

    public Automovel(String numeroPlaca, String marcaCarro, String modeloCarro, String combustivelUtilizado, Integer renavam, int ano) {
        this.numeroPlaca = numeroPlaca;
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.combustivelUtilizado = combustivelUtilizado;
        this.renavam = renavam;
        this.ano = ano;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getCombustivelUtilizado() {
        return combustivelUtilizado;
    }

    public void setCombustivelUtilizado(String combustivelUtilizado) {
        this.combustivelUtilizado = combustivelUtilizado;
    }

    public Integer getRenavam() {
        return renavam;
    }

    public void setRenavam(Integer renavam) {
        this.renavam = renavam;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public  String toString() {
        return "Placa: " + getNumeroPlaca() + "Marca: " + getMarcaCarro() + "Modelo: " + getModeloCarro() + "Ano: " + getAno();

    }
}
