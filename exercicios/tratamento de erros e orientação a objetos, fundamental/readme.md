# 📘 Exercícios – Tratamento de Erros e Orientação a Objetos

## 🔹 Tratamento de Erros (`try`, `catch`, `finally`)

### Exercício 1 – Divisão com tratamento de exceção
Solicite dois números inteiros e realize a divisão.  
Trate o caso em que o segundo número seja zero com um `try/catch`.

### Exercício 2 – Conversão segura
Peça ao usuário que digite um valor e tente convertê-lo para inteiro.  
Trate o erro caso a entrada não seja um número.

### Exercício 3 – Uso de `finally`
Crie um programa que leia um número e divida 100 por ele.  
Use `try/catch/finally` e imprima uma mensagem no `finally` que sempre será exibida.

---

## 🔹 Comando `this`

### Exercício 1 – Ambiguidade entre variável e parâmetro
Crie uma classe `Pessoa` com um atributo `nome`.  
No construtor, receba um parâmetro `nome` e utilize `this` para diferenciar o atributo do parâmetro.

### Exercício 2 – Chamar métodos com `this`
Adicione um método `exibirNome()` na classe `Pessoa`  
e chame-o a partir de outro método utilizando `this.exibirNome()`.

---

## 🔹 Introdução à Orientação a Objetos

### Conceitos de OO

#### Exercício 1 – Conceito prático
Explique com código simples a diferença entre uma **classe** e um **objeto** em Java.

#### Exercício 2 – Classe `Livro`
Crie uma classe `Livro` com atributos e crie 3 objetos diferentes dela no `main`.

---

### Classe e Objeto

#### Exercício 1 – Classe `Carro`
Crie uma classe `Carro` com os atributos `marca` e `ano`.  
Instancie dois objetos da classe e imprima suas informações.

#### Exercício 2 – Classe `Aluno`
Crie uma classe `Aluno`, com nome e nota.  
Crie um método que calcule se ele está aprovado (nota >= 6).

---

### Atributo

#### Exercício 1 – Classe `Produto`
Crie uma classe `Produto` com atributos `nome`, `preco` e `quantidade`.  
Inicialize-os com valores e imprima.

#### Exercício 2 – Classe `ContaBancaria`
Crie uma classe `ContaBancaria` com saldo como atributo.  
Crie métodos para depositar e sacar.

---

### Método

#### Exercício 1 – Classe `Calculadora`
Crie uma classe `Calculadora` com métodos `soma()`, `subtrai()` e `multiplica()`.

#### Exercício 2 – Classe `Funcionario`
Crie uma classe `Funcionario` com método `calculaSalario()`  
que recebe horas e valor/hora como parâmetro.

---

### Encapsulamento

#### Exercício 1 – Classe `Pessoa`
Crie uma classe `Pessoa` com atributo `idade` privado.  
Crie métodos `setIdade` e `getIdade`.

#### Exercício 2 – Classe `Conta`
Crie uma classe `Conta` com atributos `numero` e `saldo`.  
Torne-os privados e acesse-os por métodos públicos.

---

### Métodos GET e SET

#### Exercício 1 – Classe `Produto`
Na classe `Produto`, use `get` e `set` para modificar e exibir o valor de `preco`.

#### Exercício 2 – Classe `Aluno`
Crie uma classe `Aluno` com nota privada.  
Crie métodos `setNota()` com validação (0 a 10) e `getNota()`.

