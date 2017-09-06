package aula08exemplo01;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private List<Aluno> alunos;

    public Turma() {
       alunos = new ArrayList<>();
    }

    public Turma(String codigo) {
        this();// chama o construtor vazio
        this.codigo = codigo;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    @Override
    public String toString(){
        return this.codigo + ": " + this.alunos.size() + " alunos";
    }
}
