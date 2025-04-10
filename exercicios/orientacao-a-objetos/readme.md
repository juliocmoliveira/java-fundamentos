# Aula: Avançando na Programação Orientada a Objetos (Java)

## 📌 Tópicos: Construtor, Herança, Polimorfismo, Abstração e Interface

---

## 🔹 1. Construtor

### 🧪 Exercício 1

**Enunciado:**  
Crie uma classe `Livro` com os atributos `titulo`, `autor` e `anoPublicacao`.  
Implemente dois construtores:  
- Um construtor padrão que define valores genéricos.  
- Um construtor que receba todos os parâmetros.  
Crie um método que imprima os dados do livro e teste a classe no método `main`.

---

### 🧪 Exercício 2

**Enunciado:**  
Implemente a classe `Funcionario` com os atributos `nome`, `cargo` e `salario`.  
Use sobrecarga de construtores para permitir:
- Criar um funcionário apenas com `nome`.
- Criar um funcionário com `nome` e `cargo`.
- Criar um funcionário com todos os atributos.  
Implemente um método `exibirDados()` que mostre os valores atuais dos atributos.

---

## 🔹 2. Herança

### 🧪 Exercício 1

**Enunciado:**  
Crie uma superclasse `Veiculo` com os atributos `marca` e `modelo`.  
Depois, crie as subclasses `Carro` e `Moto`, que herdam de `Veiculo` e adicionam seus próprios atributos (`portas` no carro e `cilindradas` na moto).  
Implemente o método `exibirDetalhes()` em cada classe e teste usando herança.

---

### 🧪 Exercício 2

**Enunciado:**  
Implemente a classe `Pessoa` com atributos `nome` e `idade`.  
Crie as subclasses `Aluno` (com `matricula`) e `Professor` (com `especialidade`).  
Use o construtor da superclasse em cada subclasse e crie métodos específicos para exibir os dados de cada tipo de pessoa.

---

## 🔹 3. Polimorfismo

### 🧪 Exercício 1

**Enunciado:**  
Crie uma superclasse `Animal` com o método `fazerSom()`.  
Depois, implemente as subclasses `Cachorro` e `Gato`, cada uma sobrescrevendo `fazerSom()` com sua versão.  
No `main`, instancie uma lista de animais e percorra essa lista chamando o método polimórfico `fazerSom()`.

---

### 🧪 Exercício 2

**Enunciado:**  
Implemente a classe `Calculadora` com dois métodos `calcular()`:  
- Um que recebe dois `int` e retorna a soma.  
- Outro que recebe três `double` e retorna a média.  
Demonstre como o Java identifica automaticamente qual método usar em tempo de execução.

---

## 🔹 4. Abstração

### 🧪 Exercício 1

**Enunciado:**  
Crie uma classe abstrata `ContaBancaria` com os atributos `numero` e `saldo`, além dos métodos:  
- `depositar(double valor)` (implementado)  
- `sacar(double valor)` (abstrato)  
Crie duas subclasses `ContaCorrente` e `ContaPoupanca` que implementem `sacar()` com regras diferentes.  
Teste o comportamento no `main`.

---

### 🧪 Exercício 2

**Enunciado:**  
Implemente uma classe abstrata `Funcionario` com os métodos abstratos `calcularSalario()` e `exibirDados()`.  
Crie duas subclasses:  
- `FuncionarioHorista` (com base em horas trabalhadas)  
- `FuncionarioMensalista` (com salário fixo)  
Implemente os métodos e teste com polimorfismo.

---

## 🔹 5. Interface

### 🧪 Exercício 1

**Enunciado:**  
Crie uma interface `Autenticavel` com o método `boolean autenticar(String senha)`.  
Implemente essa interface nas classes `UsuarioAdmin` e `UsuarioComum`, cada uma com sua lógica de autenticação.  
Teste no `main` se diferentes usuários conseguem se autenticar corretamente.

---

### 🧪 Exercício 2

**Enunciado:**  
Implemente a interface `Imprimivel` com o método `imprimir()`.  
Crie as classes `RelatorioFinanceiro` e `EtiquetaProduto` que implementam `imprimir()` com conteúdos diferentes.  
No `main`, crie uma lista de objetos `Imprimivel` e chame `imprimir()` para cada um, demonstrando o uso de interface com polimorfismo.

---
