package projetofaculdade;
public class ProjetoFaculdade {
    public static void main(String[] args) {
       Graduacao grad = new Graduacao();
       
       grad.setMatricula(1);
       grad.setNome("Serginho");
       grad.setDisciplinas(5);
       grad.setSalario_bruto(4000);
       grad.bruto(grad.getSalario_bruto(), grad.getDisciplinas(), grad.getSalario(), grad.getNome());
       
       
       Mestrado mestre = new Mestrado();
       mestre.setMatricula(2);
       mestre.setNome("Antoninho");
       mestre.setDisciplinas(6);
       mestre.setSalario_bruto(4000);
       mestre.setArtigos(5);
       mestre.liq(mestre.getSalario_bruto(), mestre.getDisciplinas(), mestre.getSalario(), null, mestre.getArtigos());
       
    }
    
}
