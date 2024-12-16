package br.com.couto.minahsmusicas.modelo;

public class minhaspreferidas {


    public void inclui(audio audio){
        if (audio.getClassificação()>=9){
            System.out.println(audio.getTitulo() + "top brasil");
        }else {
            System.out.println(audio.getTitulo() + "em alta");
        }

    }
}
