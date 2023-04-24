/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package desafio.poo.dio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        
        //Estanciando um objeto
        Curso curso1 = new Curso();
        
        //Atribuindo valores com o método set
        
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);
        
        //Estanciando um objeto
        Curso curso2 = new Curso();
        
        //Atribuindo valores com o método set
        
        curso1.setTitulo("Curso js");
        curso1.setDescricao("Descrição curso js");
        curso1.setCargaHoraria(4);
        
        //Criando a Mentoria
        
        Mentoria mentoria = new Mentoria();
        
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());
        
             
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devAline = new Dev();
        devAline.setNome("Aline");
        devAline.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devAline.getConteudosInscritos());
        devAline.progredir();
        devAline.progredir();
        System.out.println("_");
        System.out.println("Conteudos Inscritos" + devAline.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devAline.getConteudosConcluidos());
        System.out.println("XP:" + devAline.calcularTotalXp());
        
        System.out.println("__________________");
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
        
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        
        System.out.println("_");
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
}
}
