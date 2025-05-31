package Codigos.src;


import java.util.Date;
import java.util.List;

public class Printer {
    public void imprimir(List<ItemSolid> itens, Date dataEmprestimo, Date dataPrevista) {
        System.out.println("\nNúmero de Itens Emprestados: " + itens.size());
        System.out.println("Data de Empréstimo: " + dataEmprestimo);
        System.out.println("Data de Devolução Prevista: " + dataPrevista);
    }
}