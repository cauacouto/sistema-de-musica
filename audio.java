package br.com.couto.minahsmusicas.modelo;

public class audio {

    private String titulo;
    private int totalReproducao;
    private int totalCurtidas;
    private int classificação;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalDereprodução() {
        return totalReproducao;
    }

    public int getClassificação() {
        return classificação;
    }


    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalReproducao++;
    }

}