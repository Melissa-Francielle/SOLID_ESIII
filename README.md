# Universidade Estadual do Norte do Paraná 
### Matéria Engenharia de Software III - 
### Professor: André Luis Andrade Menolli. 4º Ano do curso de Ciência da Computação 

#### Discente: Melissa Francielle dos Santos 

# TRABALHO SOLID 
## o que é o SOLID?
- O SOLID é um acrônimo criado por Michael Feathers, após observar os principios da orientação a objetos e design de código. 
1. S - Single Responsibility Principle
2. O - Open Closed Principle
3. L - Liskov Substitution Principle
4. I - Interface Segregation Principle
5. D - Depedency Inversion Principle


## Especificação do trabalho: 

Considere o código disponível em Emprestimo.rar ([Emprestimo versão sem o SOLID](https://github.com/Melissa-Francielle/SOLID_ESIII/tree/main/Emprestimo/src)), que representa um código inicial sobre o empréstimo de livros em uma biblioteca, que tem as seguintes classes:

1. Classe Main - resposável pela entrada de dados e início da execução do programa.
2. Classe Controle - Responsável por gerenciar os alunos.
3. Classe Débito - Responsável por gerenciar os débitos dos alunos
4. Classe Título - Responsável por gerenciar os títulos de livros da biblioteca
5. Classe Empréstimo - Responsável por gerenciar o empréstimo
6. Classe Item - Responsável por gerenciar os itens de empréstimo 

A partir disso, faça:
* Crie um projeto java e importe as classes e rode o programa, teste para ver se as regras estão funcionando.

* Analise os códigos das classes e identifique quais princípios SOLID estão sendo violados. Apresente um relatório com as classess, trechos de códigos e justificativa de porque o princípio está sendo violado.

* Refatore cada violação encontrada. Faça um relatório apresentando porque a solução resolve a violação do princípio em questão.

## Classes e os principios feridos
*  Classe Aluno: Single Responsibility Principle e Open/Closed
*  Classe Controle: Single Responsibility Principle, Open/Closed e Dependency Inversion
* Classe Débito: Open/Closed. O código de débito fere levemente outros princípios, como o SRP e o DIP, porém não prejudica de certa forma o funcionamento ou a escrita do código de alguma forma.
* Classe Empréstimo: Single Responsibility e Open/Closed. A classe em potencial pode estar ferindo Dependency Inversion, porém parcialmente isso porque instância diretamente Item, cria um certo acoplamento.
* Classe Item: Acreditasse que a classe Item não fere nenhum princípio do SOLID.
* Classe Livro: Open/Closed
* Classe Main: A classe main cumpre bem o papel de ponto de entrada do programa de certa forma.
* Classe Título: A classe título está 100% cumprindo com seus papéis, sem ferir nenhum conceito do SOLID.

## Explicação dos códigos principais
A partir das análises feita dos principios de SOLID que foram feridos pelos códigos encontrados no RAR fornecido pelo professor, foi então realizado abordagens para garantir que os principios não fossem feridos. É possível encontrar os códigos arrumados no seguinte diretório: 
* Classe Aluno:
  ([Aluno Código](https://github.com/Melissa-Francielle/SOLID_ESIII/blob/main/Codigos/src/AlunoSolid.java)). O código da classe Aluno, ele gerencia somente o que é relacionado ao Aluno, neste caso a matricula.
* Classe Controle:
  ([Controle Código](https://github.com/Melissa-Francielle/SOLID_ESIII/blob/main/Codigos/src/ControleSolid.java)). O código da Controle é responsável por gerenciar o processo de empréstimo de livros para alunos. Controlar o processo de empréstimo de livros para um aluno, garantindo que o aluno exista, não esteja em débito e que os livros estejam disponíveis para empréstimo.
* Classe Débito:
  ([Débito Controle](https://github.com/Melissa-Francielle/SOLID_ESIII/blob/main/Codigos/src/DebitoSolid.java)). O código de Débito é responsável por verificar se um aluno está em débito.
  ([Empréstimo Código](https://github.com/Melissa-Francielle/SOLID_ESIII/blob/main/Codigos/src/EmprestimoSolid.java)). O código de emprestimo está sendo responsável por gerenciar um empréstimo (dos livros), incluindo data, cálculo da devolução e impressão de resumo.
  ([Item Código](https://github.com/Melissa-Francielle/SOLID_ESIII/blob/main/Codigos/src/ItemSolid.java)). Neste código é representado um item de empréstimo de um livro com sua data de devolução.
  ([Livro Código](https://github.com/Melissa-Francielle/SOLID_ESIII/blob/main/Codigos/src/LivroSolid.java)). O código do livro irá representar um livro e sua lógica de verificação e prazo de devolução.
  ([MAIN](https://github.com/Melissa-Francielle/SOLID_ESIII/blob/main/Codigos/src/MainSolid.java)). A Main sendo a função principal para inicialização do projeto e chamada de métodos, funcionalidades e classes.
  ([Titulo Código](https://github.com/Melissa-Francielle/SOLID_ESIII/blob/main/Codigos/src/TituloSolid.java)). Classe realizando funcionalidade básica, apenas pegando o prazo.
  ### Código adicionais
  O códigos adicionais são códigos que foram utilizados para amenizar ou retirar dependências, falta de coesão dos códigos iniciais. Com isso foi necessário dividir métodos, funcionalidades, entre outras informações.
  ([INTERFACES](https://github.com/Melissa-Francielle/SOLID_ESIII/tree/main/Codigos/src/interfaces))
  ([CLASSES SUPORTE](https://github.com/Melissa-Francielle/SOLID_ESIII/tree/main/Codigos/src/classesSuportes))

 
  #### Como rodar:
   ⚠️ Para que rode os códigos corretamente (principalmente no Visual Studio) é necessário passar TODOS os códigos para a pasta SRC. Após passar todos os códigos para a única pasta SRC, no terminal do VS coloque o seguinte comando `javac *.java`, como resultante irá surgir arquivos do tipo `class`, após isso é apenas necessário rodar utilizando o comando `java MainSolid.java`.
