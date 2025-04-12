package com.Avaliacao3.Feedback.controller;

import com.Avaliacao3.Feedback.Model.Feedback;
import com.Avaliacao3.Feedback.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller responsável por expor os endpoints da aplicação.
 * Aqui definimos as rotas para enviar e buscar feedbacks via HTTP.
 */
@RestController
@RequestMapping("/api/feedbacks") // Prefixo para as rotas dessa controller
public class FeedbackController {

    // Injeta o service para manipular os dados
    @Autowired
    private FeedbackService service;

    /**
     * Endpoint para receber um novo feedback (HTTP POST).
     * Exemplo de uso via Postman ou curl.
     */
    @PostMapping
    public Feedback criarFeedback(@RequestBody Feedback feedback) {
        return service.salvarFeedback(feedback);
    }

    /**
     * Endpoint para listar todos os feedbacks (HTTP GET).
     * Exibe todos os registros já salvos.
     */
    @GetMapping
    public List<Feedback> listarFeedbacks() {
        return service.listarFeedbacks();
    }
}
