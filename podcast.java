package br.com.couto.minahsmusicas.modelo;

public class podcast extends audio {
  private String host;
  private String descricao;


  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public int getClassificação() {
    if (this.getTotalCurtidas() > 5000) {
      return 10;
    } else {
      return 6;
    }
  }
}