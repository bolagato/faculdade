package projetofaculdade;

public class Mestrado extends Graduacao {
    public int ano_termino;
    public int artigos;

    public int getAno_termino() {
        return ano_termino;
    }

    public void setAno_termino(int ano_termino) {
        this.ano_termino = ano_termino;
    }

    public int getArtigos() {
        return artigos;
    }

    public void setArtigos(int artigos) {
        this.artigos = artigos;
    }
    
  
  public void liq(double salario_bruto, int disciplinas, double salario, String nome, int artigos){
      salario = (salario_bruto - (salario_bruto * 0.2) + disciplinas *50) + artigos * 150;
      System.out.println("O salário de " + nome + " é R$ " + salario);
  }
}
