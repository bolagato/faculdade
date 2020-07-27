package projetofaculdade;

public class Graduacao {
    public int matricula;
    public String nome;
    public double salario_bruto;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario_bruto() {
        return salario_bruto;
    }

    public void setSalario_bruto(double salario_bruto) {
        this.salario_bruto = salario_bruto;
    }

    public int getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(int disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int disciplinas;
    public double salario;
    
    public void bruto(double salario_bruto, int disciplinas, double salario, String nome){
       salario = salario_bruto - (salario_bruto * 0.2) + disciplinas *50;
       System.out.println("O salário de " + nome + " é R$ " + salario);
    }
}
