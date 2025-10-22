# TecnicasdeProgramacao
Repoitório para armazenamento e envio das minhas atividades da disciplina de Tecnicas de Programação do Curso de Desenvolvimento de Software Multiplataforma na FATEC Praia Grande

## ATIVIDADE PRÁTICA 1 - PROGRAMAÇÃO ESTRUTURADA

  1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
  2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
  3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
  4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
  5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
  6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
  7. Faixa Etária: Receba a idade de uma pessoa e imprima se ela é: menor de idade, adulta ou idosa (use, por exemplo, 18 para adulta e 60 para idosa).
  8. Soma dos Números Ímpares: Peça ao usuário que insira um número inteiro n. Calcule e imprima a soma dos primeiros n números ímpares. Por exemplo, se o usuário inserir 4, o programa deve calcular a soma de 1 + 3 + 5 + 7 = 16.
  9. Lista de Nomes: Peça ao usuário para inserir 5 nomes (um de cada vez). Após inserir todos os nomes, peça outro nome e use um loop for para percorrer a lista e verificar se o 6º(último) nome digitado está presente no array dos 5 nomes informados inicialmente.
  10. Senha Secreta: Defina uma senha secreta (por exemplo: "Java123"). Use um loop while para pedir ao usuário que insira a senha. Se a senha estiver incorreta, continue pedindo a senha e informe ao usuário que a tentativa foi inválida. Se ele acertar, saia do loop e imprima uma mensagem de sucesso.

## ATIVIDADE PRÁTICA 2 - REPETIÇÃO E MATRIZ

  Soma de Matrizes:
  Desenvolva um programa que realiza a soma de duas matrizes 3X3, exibindo o resultado no console. 

  Multiplicação de Matriz por Escalar:
  Crie um programa que verifique se um login e senha confere com os dados de uma matriz 6x2.
  
  Transposição de Matriz:
  Desenvolva um código que realiza a transposição de uma matriz (as colunas viram linhas e as linhas viram colunas). Peça aos usuários para inserirem os elementos da matriz, exibindo a matriz transposta no console.

## ATIVIDADE PRÁTICA 4 - ABSTRAÇÃO

  1. Faça a Abstração da Entidade "Carro" e Crie uma Classe.
     a. Defina 3 atributos para sua classe "Carro": cor, modelo e capacidade do tanque. e 4 métodos ligar, Acelerar, Frear e Buzinar.
     b. Só Liga se não estiver ligado
     c. Só Desliga se Estiver Ligado
     d. Só Acelera se Estiver Ligado
  2. Crie as classes da folha entregue pelo professor na aula de "Abstração".
     a. Crie 2 Objetos de Cada na classe principal
     b. Imprima o valor de 1 atributo e o comportamento de 1 método de cada entidade quando for aplicável.

## ATIVIDADE PRÁTICA 6 - AVALIAÇÃO PARCIAL

### Exercício 1 – Loja com Estoque e Estatísticas
Crie uma classe Loja com:

Um array de String chamado nomesProdutos;
Um array de int chamado quantidadeEstoque;
Um array de double chamado precosProdutos.
Implemente métodos para:

Exibir todos os produtos com preços e quantidades em estoque.
Calcular o produto mais caro e o mais barato da loja.
Calcular o valor total em estoque (preço × quantidade de cada item).
Comprar um produto, diminuindo sua quantidade em estoque.
Repor um produto, aumentando a quantidade em estoque.

### Exercício 2 – Videolocadora com Controle de Popularidade
Crie uma classe Videolocadora com:

Um array de String chamado filmes;
Um array de int chamado vezesAlugado;
Um array de double chamado precosLocacao.
Implemente métodos para:

Listar os filmes com seus preços e quantas vezes já foram alugados.
Calcular o faturamento total esperado se todos os filmes fossem alugados uma vez.
Descobrir qual filme foi mais alugado.
Alugar um filme, registrando +1 no contador do vezesAlugado.
Devolver um filme (apenas informar que foi devolvido, sem remover do array).

### Exercício 3 – Biblioteca com Controle de Multas
Crie uma classe Biblioteca com:

Um array de String chamado livros;
Um array de int chamado diasAtraso;
Um array de double chamado multaPorDia.
Implemente métodos para:

Mostrar todos os livros cadastrados com seus respectivos dias de atraso e multa por dia.
Calcular a multa total acumulada para todos os livros atrasados.
Calcular a média de dias de atraso dos livros devolvidos com atraso.
Emprestar um livro, removendo-o temporariamente do array de disponíveis.
Devolver um livro informando os dias de atraso, atualizando o cálculo de multa

## ATIVIDADE PRÁTICA 7 - HERANÇA

#### Apenas para praticar, crie uma interface chamada "OperacaoMatematica". Crie também 4 métodos das operações básicas: soma, subtração, multiplicação e divisão implemente na classe Calculadora.
  Implementar algum dos métodos  e veja o que acontece.
  Interface de Pagamentos
  Crie uma interface chamada Pagamento com os seguintes métodos:
  calcularPagamento(): Sem parâmetros, deve ser implementado para calcular o valor do pagamento.
  emitirRecibo(): Retorna um recibo detalhado da transação.
  Agora, implemente essa interface em duas classes: PagamentoCartao e PagamentoDinheiro.
  A classe PagamentoCartao deve incluir uma taxa de 5% sobre o valor do pagamento.
  A classe PagamentoDinheiro deve aplicar um desconto de 10% sobre o valor do pagamento.
  No final, crie uma classe de teste que simule o pagamento de R$100,00 com as duas formas de pagamento, calculando o valor final e emitindo um recibo.

#### Interface Autenticavel
  Crie uma interface chamada Autenticavel com os seguintes métodos:
  login(String usuario, String senha): Verifica se o login e a senha estão corretos.
  logout(): Faz o logout do usuário.
  Implemente essa interface na classe SistemaDeSeguranca. Nessa classe:
  Defina os valores de um login e senha corretos, como "admin" e "1234".
  No método login(), implemente a lógica para verificar se o usuário e senha inseridos correspondem aos valores corretos.
  Se o login for bem-sucedido, armazene um valor booleano que indica se o usuário está autenticado ou não.
  Tarefa: Crie uma classe de teste que peça ao usuário para inserir o nome de usuário e senha. Se o login estiver correto, o sistema deverá exibir uma mensagem de boas-vindas. Caso contrário, deverá pedir para tentar novamente até acertar. O sistema também deve permitir fazer o logout.
