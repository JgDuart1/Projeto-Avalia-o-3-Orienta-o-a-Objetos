package com.Avaliacao3.Feedback.controller;

import com.Avaliacao3.Feedback.model.Feedback;
import com.Avaliacao3.Feedback.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class WebController {

    @Autowired

    private FeedbackService feedbackService;

    // Exibe o formulário de envio

    @GetMapping("/feedback/form")
    public String exibirFormulario(Model model) {
        model.addAttribute("feedback", new Feedback()); // Objeto vazio para o form
        return "formulario";
    }

    // Processa o envio do formulário

    @PostMapping("/feedback")
    public String salvarFeedback(@ModelAttribute Feedback feedback) {
        feedbackService.salvarFeedback(feedback); // <- corrigido
        return "redirect:/feedback/lista";
    }

    @GetMapping("/feedback/lista")
    public String listarFeedbacks(Model model) {
        model.addAttribute("feedbacks", feedbackService.listarFeedbacks()); // <- corrigido
        return "lista";
}
}