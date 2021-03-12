import modelo.Aluno;
import modelo.Aula;
import modelo.Professor;

public class Main {

    public Main(){
        Aluno aluno1 = new Aluno("Gabriel Villa", 2192833);
        Aluno aluno2 = new Aluno("xd", 2);
        Professor professor1 = new Professor("Jose Magno", 222222);
        Aula aula1 = new Aula("Programacao II PL9", 1);
        Aula aula2 = new Aula("Programacao II PL10", 2);
    }

    public static void main(String[] args) {
        new Main();
    }
}
