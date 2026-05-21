# Sistema de Gerenciamento de Funcionários

Este é um projeto de exemplo em Java que demonstra conceitos de Programação Orientada a Objetos (POO) aprendidos nos estudos, incluindo herança, construtores, métodos, modificadores de acesso, arrays, anotações e depreciação.

## Descrição do Projeto

O sistema permite gerenciar funcionários de uma empresa, com diferentes tipos de funcionários (como Assistente e Funcionário comum), calculando salários anuais, aplicando aumentos e lidando com métodos obsoletos usando anotações.

### Funcionalidades
- Criar funcionários com nome e salário.
- Aplicar aumentos salariais.
- Calcular ganho anual, com bônus para assistentes.
- Demonstrar uso de herança e sobrecarga de métodos.
- Exibir informações usando arrays para listas de funcionários.
- Usar anotações como `@Deprecated` e `@SuppressWarnings` para práticas modernas.

## Estrutura das Classes

- **Funcionario**: Classe base com atributos privados (nome, salario), getters/setters, métodos para aumento e ganho anual.
- **Assistente**: Herda de Funcionario, sobrescreve `ganhoAnual()` para adicionar bônus de R$ 1000.
- **Empresa**: Classe para gerenciar uma lista de funcionários usando arrays.
- **Main**: Classe principal para testar o sistema, criando objetos e exibindo resultados.

## Requisitos
- JDK 11 ou superior.
- IDE como IntelliJ IDEA.

## Como Executar
1. Clone ou baixe o projeto.
2. Abra em sua IDE.
3. Compile e execute a classe `Main.java`.

### Exemplo de Uso
```java
Funcionario joao = new Assistente("João", 3000);
joao.addAumento(500);
System.out.println("Nome: " + joao.getNome());
System.out.println("Salário Anual: " + joao.ganhoAnual()); // Deve mostrar 8500 (3000*12 + 500 + 1000 bônus)
```

## Conceitos Demonstrados
- **Herança**: Assistente herda de Funcionario.
- **Encapsulamento**: Atributos privados com getters/setters.
- **Polimorfismo**: Sobrescrita de `ganhoAnual()`.
- **Construtores**: Inicialização de objetos.
- **Arrays**: Para armazenar listas de funcionários.
- **Anotações**: `@Deprecated` para métodos obsoletos, `@SuppressWarnings` para suprimir avisos.
- **Modificadores de Acesso**: Uso de private, public, etc.

## Próximos Passos
- Adicionar mais tipos de funcionários (ex.: Gerente com bônus variável).
- Implementar persistência com arquivos ou banco de dados.
- Adicionar interface gráfica com Swing.

Este projeto serve como base para expandir seus conhecimentos em Java POO. Divirta-se desenvolvendo!
