package Codigos.src;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalculaDevolucao implements CalculadoraDevolucao {
    private static final int LIMITE_LIVROS = 2;
    private static final int DIAS_POR_LIVRO = 2;

    @Override
    public Date calcular(List<ItemSolid> itemList, Date dataEmprestimo) {
        Date dataPrevista = dataEmprestimo;
        for (ItemSolid it : itemList) {
            Date dataCalculadaParaItem = it.calculaDataDevolucao(dataEmprestimo);
            if (dataPrevista.compareTo(dataCalculadaParaItem) < 0) {
                dataPrevista = dataCalculadaParaItem;
            }
        }
        if (itemList.size() > LIMITE_LIVROS) {
            int excedente = itemList.size() - LIMITE_LIVROS;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataPrevista);
            calendar.add(Calendar.DATE, excedente * DIAS_POR_LIVRO);
            dataPrevista = calendar.getTime();
        }
        return dataPrevista;
    }
}