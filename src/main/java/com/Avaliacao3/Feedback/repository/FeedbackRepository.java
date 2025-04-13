package com.Avaliacao3.Feedback.repository;

import org.springframework.stereotype.Repository;

import com.Avaliacao3.Feedback.model.Feedback;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Classe responsável por simular um repositório de dados em memória.
 * Aqui armazenamos e recuperamos feedbacks sem usar um banco real.
 */
@Repository
public class FeedbackRepository {

    // Lista que armazenará todos os feedbacks
    private final List<Feedback> feedbacks = new ArrayList<>();

    // Simula um ID incremental automático
    private final AtomicLong contadorId = new AtomicLong();

    // Adiciona um novo feedback à lista
    public Feedback salvar(Feedback feedback) {
        feedback.setId(contadorId.incrementAndGet());
        feedbacks.add(feedback);
        return feedback;
    }

    // Retorna todos os feedbacks cadastrados
    public List<Feedback> listarTodos() {
        return feedbacks;
    }
}
