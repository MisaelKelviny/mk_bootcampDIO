import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao curso java");
        curso.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java 2 ");
        curso2.setDescricao("Descricao curso java 2");
        curso2.setCargaHoraria(11);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso Java");
        mentoria.setDescricao("Descricao curso java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao do bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Misael");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos:" + dev.getConteudoInscritos());
        dev.progredir();
        System.out.println("Conteudo concluidos:" + dev.getConteudosConcluidos());
        System.out.println("XP:" +  dev.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("John Doe");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos:" + dev2.getConteudoInscritos());
        dev2.progredir();
        System.out.println("Conteudo concluidos:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" +  dev2.calcularTotalXp());
    }
}