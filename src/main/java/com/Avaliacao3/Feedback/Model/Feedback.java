package com.Avaliacao3.Feedback.Model;

/**
 * Classe que representa um Feedback de aula enviado por um aluno.
 * Contém o nome do aluno, a disciplina, o comentário e a nota atribuída.
 */
public class Feedback {

    private Long id; // ID único para cada feedback
    private String nomeAluno;
    private String disciplina;
    private String comentario;
    private int nota;

    // Construtor padrão (obrigatório para frameworks)
    public Feedback() {}

    // Construtor com todos os atributos
    public Feedback(String nomeAluno, String disciplina, String comentario, int nota) {
        this.nomeAluno = nomeAluno;
        this.disciplina = disciplina;
        this.comentario = comentario;
        this.nota = nota;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
