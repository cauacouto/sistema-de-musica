package br.com.couto.minahsmusicas.modelo;

public class musica extends audio {
    private String album;
    private String artista;
    private String genero;


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificação() {
        if (this.getTotalDereprodução()>200){
            return 10;
        }else{
            return 5;
        }

    }
}
