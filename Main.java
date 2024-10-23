import classes.aluno.Aluno;
import classes.curso.Curso;
import classes.departamento.Departamento;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Silva", "20231001");

        Curso curso1 = new Curso("Engenharia de Software", "ES101");
        curso1.setAluno(aluno1);

        Departamento departamento1 = new Departamento("Ciências Exatas", curso1);

        System.out.println(departamento1.toString());
    }
}
