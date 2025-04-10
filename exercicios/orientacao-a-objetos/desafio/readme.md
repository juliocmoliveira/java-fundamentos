# 💻 Desafio Java: Sistema de Gestão de Funcionários

## 🎯 Objetivo:
Criar um sistema que represente diferentes tipos de funcionários, utilizando os pilares fundamentais da Programação Orientada a Objetos em Java:

- Construtor  
- Herança  
- Abstração  
- Polimorfismo  
- Interface  

---

## 📝 Enunciado:

Você deve desenvolver um programa em Java que simula uma empresa com diferentes tipos de funcionários. Todos os funcionários devem herdar de uma **classe abstrata** chamada `Employee`, que define o comportamento comum.

Na empresa, existem três tipos principais de funcionários: **Funcionário Regular**, **Gerente** e **Desenvolvedor**. Todos possuem **nome**, **salário base** e um **método para calcular o salário final**, que é implementado de maneira diferente em cada tipo (polimorfismo).

Além disso, crie uma **interface** chamada `BonusEligible`, que define o método `double calculateBonus()`. Apenas os Gerentes e os Desenvolvedores devem implementar essa interface.

---

## ✅ Requisitos e Estrutura das Classes:

### 🔹 Classe Abstrata: `Employee`

- **Atributos**:  
  - `String name`  
  - `double baseSalary`

- **Construtor**  
  Inicializa o nome e o salário base.

- **Método concreto**:  
  - `void displayInfo()`  
    Exibe no console o nome e o salário final do funcionário.

- **Método abstrato**:  
  - `double calculateFinalSalary();`

---

### 🔹 Interface: `BonusEligible`

- **Método**:  
  - `double calculateBonus();`

---

### 🔹 Classe: `RegularEmployee`

- **Herda**: `Employee`
- **Implementa**: nenhuma interface
- **Implementação**:  
  - `calculateFinalSalary()` retorna apenas `baseSalary`

---

### 🔹 Classe: `Manager`

- **Herda**: `Employee`
- **Implementa**: `BonusEligible`
- **Atributo adicional**:  
  - `int teamCount` (quantidade de pessoas na equipe)

- **Regras de bônus**:  
  - R$500,00 por membro da equipe

- **Implementações**:  
  - `calculateBonus()` retorna `500 * teamCount`  
  - `calculateFinalSalary()` retorna `baseSalary + calculateBonus()`

---

### 🔹 Classe: `Developer`

- **Herda**: `Employee`
- **Implementa**: `BonusEligible`
- **Atributo adicional**:  
  - `int projectCount` (quantidade de projetos entregues)

- **Regras de bônus**:  
  - R$300,00 por projeto entregue

- **Implementações**:  
  - `calculateBonus()` retorna `300 * projectCount`  
  - `calculateFinalSalary()` retorna `baseSalary + calculateBonus()`

---

## 🧪 Exemplo de uso no método `main`

Crie uma classe `Company` com o método `main`, e nela:

1. Instancie um `RegularEmployee`, um `Manager` e um `Developer`.
2. Configure os valores dos atributos de cada um.
3. Armazene todos em um array ou lista de `Employee`.
4. Utilize um loop para exibir as informações com `displayInfo()`.

---

## ✅ O que será avaliado

- Aplicação correta de herança, abstração, polimorfismo e interfaces.
- Uso apropriado de construtores e encapsulamento.
- Clareza, organização e legibilidade do código.
- Boa prática na nomeação de classes e métodos (em inglês).
