package academy.devdojo.maratonajava.javacore.HexercicioAssociacao.app;

import academy.devdojo.maratonajava.javacore.HexercicioAssociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.HexercicioAssociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.HexercicioAssociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.HexercicioAssociacao.dominio.Seminario;

public class Evento {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Como achar One Piece",alunosParaSeminario,local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
