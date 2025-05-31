package Codigos.src;

import java.util.Scanner;

public class MainSolid {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] codigos = new int[14];

        System.out.print("Digite o RA do Aluno: ");
        String aluno = entrada.nextLine();

        System.out.print("Digite o número de Livros a ser Emprestado: ");
        int num = entrada.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("Digite o código do livro " + (i + 1) + ": ");
            codigos[i] = entrada.nextInt();
        }

        ControleSolid controle = new ControleSolid();
        EmprestimoSolid emprestimo = controle.emprestar(aluno, codigos, num);

        if (emprestimo != null) {
            System.out.println("Empréstimo realizado com sucesso!");
            emprestimo.imprimirResumoEmprestimo();
        }
        entrada.close();
    }
}