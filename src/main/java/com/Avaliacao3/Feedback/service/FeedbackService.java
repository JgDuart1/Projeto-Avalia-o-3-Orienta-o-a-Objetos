package com.Avaliacao3.Feedback.service;

import com.Avaliacao3.Feedback.Model.Feedback;
import com.Avaliacao3.Feedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Classe de serviço que faz a ponte entre o Controller e o Repository.
 * Aqui pode ser implementada qualquer lógica adicional (validações, filtros etc).
 */
@Service
public class FeedbackService {

    // Injeta o repositório para acesso aos dados
    @Autowired
    private FeedbackRepository repository;

    // Método para salvar um novo feedback
    public Feedback salvarFeedback(Feedback feedback) {
        return repository.salvar(feedback);
    }

    // Método para retornar todos os feedbacks salvos
    public List<Feedback> listarFeedbacks() {
        return repository.listarTodos();
    }
}
