package br.com.couto.minahsmusicas.principal;

import br.com.couto.minahsmusicas.modelo.minhaspreferidas;
import br.com.couto.minahsmusicas.modelo.musica;
import br.com.couto.minahsmusicas.modelo.podcast;

public class principal {
    public static void main(String[] args) {


musica minhamusica = new musica();


minhamusica.setTitulo(" filipe ret ");
minhamusica.setAlbum("nume");
minhamusica.setGenero("rap/trap");

        for (int i = 0; i < 1000; i++) {
            minhamusica.curte();

        }

        podcast meupodcast = new podcast();

        meupodcast.setTitulo(" podpah ");
        meupodcast.setHost(" igao e mitico ");

        for (int i = 0; i < 300; i++) {
         meupodcast.curte();
        }
        for (int i = 0; i < 5000; i++) {
            meupodcast.reproduz();
        }

        minhaspreferidas preferidas = new minhaspreferidas();


        preferidas.inclui(meupodcast);
        preferidas.inclui(minhamusica);
    }
}
