# 🧩 Desafio Java: Sistema de Gestão de Biblioteca Acadêmica

## 📖 Cenário

Uma instituição de ensino superior deseja modernizar o sistema de controle da sua **biblioteca acadêmica**. O sistema atual não permite visualizar corretamente os livros emprestados, controlar atrasos, nem organizar os dados de forma estruturada entre alunos, professores e funcionários da biblioteca.

## 🧠 Problema de Negócio

A falta de um sistema confiável tem gerado problemas como:

- Perda de controle sobre livros emprestados e devoluções.
- Alunos com vários livros em atraso sem que o sistema identifique.
- Falta de diferenciação entre **perfis de usuários**, como alunos, professores e bibliotecários.
- Ausência de um **registro de histórico** de empréstimos por usuário.

## 📦 Entidades de Negócio

### 1. Pessoa (Abstrata)
- Representa qualquer indivíduo cadastrado no sistema.
- Contém dados comuns: `nome`, `cpf`, `email`.

### 2. Usuário (Especializações)
- Pode ser um **Aluno** ou um **Professor**.
- Alunos podem emprestar até **3 livros** simultaneamente.
- Professores podem emprestar até **5 livros** simultaneamente e por mais tempo.

### 3. Bibliotecário
- Usuário com permissão para registrar, cadastrar livros e gerenciar empréstimos.

### 4. Livro
- Possui `título`, `autor`, `ISBN`, `número de cópias disponíveis`.
- Pertence a uma **categoria**.

### 5. Categoria
- Agrupa livros de temas semelhantes.
- Ex: Computação, Ciências Humanas, Matemática.

### 6. Empréstimo
- Representa o ato de emprestar um livro.
- Contém `data do empréstimo`, `data prevista de devolução`, `data real de devolução`.

### 7. Histórico
- Armazena os empréstimos anteriores de cada usuário.

## ✅ Regras de Negócio

- Alunos só podem ter no máximo **3 livros emprestados** ao mesmo tempo.
- Professores podem ter até **5 livros**, com prazo estendido de devolução.
- Atrasos geram **notificações**.
- Não é permitido emprestar o **mesmo livro** para a **mesma pessoa** simultaneamente.
- Não é possível emprestar livros que **não têm exemplares disponíveis**.
- Todos os empréstimos são registrados no **histórico** do usuário.
- Somente bibliotecários podem **cadastrar livros** ou **criar categorias**.

## 📋 Requisitos Funcionais

- Cadastro de usuários: aluno, professor, bibliotecário.
- Cadastro e edição de livros.
- Associação de livros a categorias.
- Empréstimo de livros com validação de regras por perfil.
- Registro automático de empréstimos no histórico.
- Consulta de histórico de cada usuário.
- Validação de disponibilidade de exemplares.
- Geração de alerta para devoluções atrasadas.
