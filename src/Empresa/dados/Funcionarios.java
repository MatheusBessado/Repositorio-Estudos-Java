package Empresa.dados;

public class Funcionarios { // Declaração da classe Empresa.dados.Funcionarios
    String nomeFuncionario; // Variável para armazenar o nome do funcionário
    String CargoFuncionario; // Variável para armazenar o cargo do funcionário
    int idadeFuncionario; // Variável para armazenar a idade do funcionário
    double salarioFuncionario; // Variável para armazenar o salário do funcionário
    public Funcionarios(String nomeFuncionario, String CargoFuncionario, int idadeFuncionario, double salarioFuncionario) {
        this.nomeFuncionario = nomeFuncionario; // Inicializa o nome do funcionário
        this.CargoFuncionario = CargoFuncionario; // Inicializa o cargo do funcionário
        this.idadeFuncionario = idadeFuncionario; // Inicializa a idade do funcionário
    }

    public static void main(String[] args) { //Método principal, ponto de entrada do programa
        Funcionarios funcionarios = new Funcionarios("Ana","Dev",25,25.000 ); // Criação de um objeto da classe Empresa.dados.Funcionarios

        funcionarios.nomeFuncionario = "João"; // Atribuição do nome ao funcionário
        funcionarios.CargoFuncionario = "Desenvolvedor"; // Atribuição do cargo ao funcionário
        funcionarios.idadeFuncionario = 30; // Atribuição da idade ao funcionário

         // serve para pular uma linha "\n";
        System.out.println("Dados do Funcionario:" + "\n"); // Exibe o título e pula uma linha
        System.out.println("Nome do  Funcionario: " + funcionarios.nomeFuncionario); // Exibe o nome do funcionário
        System.out.println("Cargo do Funcionario: " + funcionarios.CargoFuncionario); // Exibe o cargo do funcionário
        System.out.println("Idade do Funcionario: " + funcionarios.idadeFuncionario + " anos "); // Exibe a idade do funcionário
    }

}