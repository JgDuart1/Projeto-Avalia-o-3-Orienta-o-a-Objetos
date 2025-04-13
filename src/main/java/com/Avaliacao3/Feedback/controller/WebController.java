package com.Avaliacao3.Feedback.Controller;

import com.Avaliacao3.Feedback.Model.Feedback;
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
        feedbackService.salvar(feedback); // Salva via Service
        return "redirect:/feedback/lista"; // Redireciona para a lista após salvar
    }

    // Mostra todos os feedbacks em uma tabela HTML
    @GetMapping("/feedback/lista")
    public String listarFeedbacks(Model model) {
        model.addAttribute("feedbacks", feedbackService.listarTodos());
        return "lista";
    }
}
