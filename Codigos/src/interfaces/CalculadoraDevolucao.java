package Codigos.src;

import java.util.Date;
import java.util.List;


public interface CalculadoraDevolucao {
    Date calcular(List<ItemSolid> itens, Date dataEmprestimo);
}