import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo(" Curso Basico em QA");
        curso1.setDescricao(" Curso voltado para criar profissionais capazes de analisar , criar e manter testes");
        curso1.setCargaHoraria(2800);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo(" Curso Java");
        curso2.setDescricao(" Curso voltado para profissionais em desenvolvimento de software");
        curso2.setCargaHoraria(3800);
        System.out.println(curso2);

        Mentoria ment = new Mentoria();
        ment.setTitulo(" Mentoria Java");
        ment.setDescricao(" Auxiliar alunos com dificuldades na disciplina");
        ment.setData(LocalDate.now());
        System.out.println(ment);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Bootcamp QA");
        bootcamp.setDescricao(" Desenvolvendo habilidades em QA");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(ment);

        Dev devs = new Dev();

        System.out.println(" Dev 1: ");

        devs.setNome("Nayara");
        devs.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devs.getConteudosInscritos());
        devs.progredir();
        devs.progredir();
        System.out.println("===== Proximo Curso =====");
        System.out.println("Conteúdos Inscritos " + devs.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devs.getGetConteudosConcluidos());
        System.out.println(" XP: " + devs.calcularTotalXp());


        System.out.println(" Dev 2: ");

        Dev devs2 = new Dev();
        devs2.setNome("Joao");
        devs2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devs2.getConteudosInscritos());
        devs.progredir();
        devs.progredir();
        System.out.println("===== Proximo Curso =====");
        System.out.println("Conteúdos Inscritos " + devs.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devs.getGetConteudosConcluidos());
        System.out.println(" XP: " + devs2.calcularTotalXp());


        



    }
}
