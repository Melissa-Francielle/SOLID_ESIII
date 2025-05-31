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

## Códigos solução
A partir das análises feita dos principios de SOLID que foram feridos pelos códigos encontrados no RAR fornecido pelo professor, foi então realizado abordagens para garantir que os principios não fossem feridos. É possível encontrar os códigos arrumados no seguinte diretório: 
