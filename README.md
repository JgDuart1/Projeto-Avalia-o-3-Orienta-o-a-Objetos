# Avaliação 3 - Orientação a Objetos  
**Por: João Gabriel Duarte Guarçoni Almeida**

**Matrícula: 202376008**

## 📋 Descrição do Projeto

Este é um sistema simples de **Feedback de Aula**, desenvolvido em **Java com Spring Boot e Thymeleaf** como parte da Avaliação 3 da disciplina de **Orientação a Objetos**.  
O objetivo é permitir que alunos enviem feedbacks sobre aulas, que são exibidos em uma lista após o envio.

## 🧱 Estrutura do Projeto

O projeto segue a arquitetura em camadas:

- `Controller (WebController)`: Responsável por gerenciar as requisições HTTP, exibir o formulário e a lista de feedbacks.
- `Service (FeedbackService)`: Camada intermediária entre controller e repositório, onde poderia haver validações ou regras de negócio.
- `Repository (FeedbackRepository)`: Simula um banco de dados em memória, armazenando os feedbacks numa lista.
- `Model (Feedback)`: Classe que representa o objeto Feedback, com campos como nome do aluno, disciplina, comentário e nota.

## 💻 Funcionalidades

- Exibir um formulário para envio de feedbacks (`/feedback/form`)
- Salvar o feedback submetido
- Listar todos os feedbacks cadastrados (`/feedback/lista`)

## 🖼️ Interface Web

A interface é feita com **Thymeleaf** e possui dois templates:

- `formulario.html`: Formulário para preenchimento do feedback.
- `lista.html`: Lista todos os feedbacks enviados.

## 🚀 Como executar

1. Clonar o projeto:
2. Abrir no Visual Studio Code ou IntelliJ
3. Executar o projeto (FeedbackApplication.java)
4. Acessar:

Formulário: http://localhost:8080/feedback/form

Lista de feedbacks: http://localhost:8080/feedback/lista
