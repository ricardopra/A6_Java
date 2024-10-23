package classes.curso;

import classes.aluno.Aluno;

public class Curso {
    private String nome;
    private String codigo;
    private Aluno aluno;

    public Curso() {
    }

    public Curso(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Curso:\n" +
                "  Nome: " + nome + "\n" +
                "  Código: " + codigo + "\n" +
                (aluno != null ? aluno.toString() : "  Aluno: Nenhum aluno matriculado");
    }
}
