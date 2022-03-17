package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> getConteudosConcluidos= new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudu = this.conteudosInscritos.stream().findFirst();
        if (conteudu.isPresent()){
            this.getConteudosConcluidos.add(conteudu.get());
            this.conteudosInscritos.remove(conteudu.get());
        }else {
            System.err.println(" Matricula nao encontrada para este conteúdo!");
        }
    }
    public double calcularTotalXp(){
        return this.getConteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getGetConteudosConcluidos() {
        return getConteudosConcluidos;
    }

    public void setGetConteudosConcluidos(Set<Conteudo> getConteudosConcluidos) {
        this.getConteudosConcluidos = getConteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(getConteudosConcluidos, dev.getConteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, getConteudosConcluidos);
    }
}
