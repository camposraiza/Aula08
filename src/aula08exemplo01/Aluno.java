package aula08exemplo01;

public class Aluno {
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno(String matricula) {
        this(matricula,null);//  chama o construtor com 2 parametros e insere matricula e nulo  no outro
    }
    
    
    public Aluno() {
        this(null,null);// chama o construtor com 2 parametros e insere nulo
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return "Nome: "+ this.nome + " Matricula: " + this.matricula ;
    }
}
