package Codigos.src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmprestimoSolid {
    private Date dataEmprestimo = new Date();
    private Date dataPrevista = new Date();
    private final List<ItemSolid> itemList = new ArrayList<>();
    private CalculaDevolucao calculaDevolucao;
    private Printer printer;

    public EmprestimoSolid() {
        this.calculaDevolucao = new CalculaDevolucao();
        this.printer = new Printer();
    }

    public void setCalculadoraDevolucao(CalculaDevolucao calculadora) {
        this.calculaDevolucao = calculadora;
    }

    public void setResumoEmprestimoPrinter(Printer printer) {
        this.printer = printer;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public boolean emprestar(List<LivroSolid> livros) {
        if (livros == null || livros.isEmpty()) {
            return false;
        }
        for (LivroSolid livro : livros) {
            ItemSolid item = new ItemSolid(livro);
            itemList.add(item);
        }
        dataPrevista = calculaDevolucao.calcular(itemList, dataEmprestimo);
        for (ItemSolid it : itemList) {
            it.setDataDevolucao(dataPrevista);
        }
        return true;
    }

    public void imprimirResumoEmprestimo() {
        printer.imprimir(itemList, dataEmprestimo, dataPrevista);
    }
}