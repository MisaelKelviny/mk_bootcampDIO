import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao curso java");
        curso.setCargaHoraria(10);

        System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java 2 ");
        curso2.setDescricao("Descricao curso java 2");
        curso2.setCargaHoraria(11);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso Java");
        mentoria.setDescricao("Descricao curso java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
    }
}