# TecnicasdeProgramacao
Repoitório para armazenamento e envio das minhas atividades da disciplina de Tecnicas de Programação do Curso de Desenvolvimento de Software Multiplataforma na FATEC Praia Grande

# TP I

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

## ATIVIDADE PRÁTICA 8 - POLIMORFISMO

### 1. Sobrescrita de métodos em uma hierarquia de veículos
#### Enunciado:​
Implemente uma classe base chamada Veiculo que possua um método mover(). Crie
duas subclasses: Carro e Bicicleta, que sobrescrevam o método mover() com
comportamentos específicos.
 - A classe Carro deve imprimir "O carro está dirigindo" e a classe Bicicleta deve
imprimir "A bicicleta está pedalando".
#### Pergunta:​
Explique como a sobrescrita de métodos permite comportamentos diferentes para objetos
da mesma hierarquia.
### 2. Sobrecarga de métodos
#### Enunciado:​
Crie uma classe Calculadora que contenha três versões do método somar(). A primeira
versão deve receber dois parâmetros inteiros, a segunda deve receber três parâmetros
inteiros, e a terceira deve receber dois parâmetros do tipo double.
 - Implemente as três versões do método somar() e teste chamando cada uma com
diferentes combinações de argumentos.
 -  Discuta como a sobrecarga de métodos permite a criação de várias versões do
mesmo método com assinaturas diferentes.
#### Pergunta:​
Descreva o mecanismo de sobrecarga de métodos e como ele difere da sobrescrita em
termos de polimorfismo.
#### 3. Sobrecarga de construtores
#### Enunciado:​
Crie uma classe chamada Produto com três construtores sobrecarregados:
 -  O primeiro deve receber um nome do produto (String).
 -  O segundo deve receber um nome e um preço (double).
 -  O terceiro deve receber um nome, um preço e uma quantidade em estoque (int).
 -  Instancie objetos da classe Produto utilizando cada um dos construtores e imprima
as informações dos produtos.
#### Pergunta:​
Discuta como a sobrecarga de construtores facilita a criação de objetos com diferentes
conjuntos de informações, permitindo flexibilidade na instânciação de objetos.
### 4. Sobrescrita de métodos em uma classe de pagamento
#### Enunciado:​
Crie uma classe base chamada Pagamento com um método processarPagamento(), que
apenas imprime "Processando pagamento genérico". Em seguida, crie duas subclasses:
PagamentoCartao e PagamentoBoleto.
 -  A classe PagamentoCartao deve sobrescrever o método processarPagamento()
para imprimir "Processando pagamento via cartão de crédito".
 -  A classe PagamentoBoleto deve sobrescrever o método processarPagamento()
para imprimir "Processando pagamento via boleto bancário".
 -  Instancie objetos de ambas as classes e demonstre o polimorfismo chamando o
método processarPagamento() em cada um deles.
#### Pergunta:​
Como o polimorfismo por sobrescrita facilita a implementação de diferentes formas de
pagamento dentro de um sistema sem alterar o código da classe base?
### 5. Sobrecarga de métodos em uma classe de conversão
#### Enunciado:​
Implemente uma classe chamada Conversor que contenha três versões sobrecarregadas
do método converter():
 -  A primeira versão deve converter uma temperatura de Celsius para Fahrenheit.
 -  A segunda versão deve converter um valor de quilômetros para milhas.
 -  A terceira versão deve converter uma string para letras maiúsculas.
 -  Teste todas as versões do método converter() chamando cada uma com os
parâmetros adequados.
#### Pergunta:​
Explique como a sobrecarga de métodos permite implementar várias versões do método
converter(), mesmo com diferentes tipos de dados e funcionalidades.

## ATIVIDADE PRÁTICA 9 - SWING JAVA

### Exercício 1: Sistema de Formulário de Cadastro 
Você foi contratado para criar um sistema de formulário de cadastro utilizando os componentes Swing. 
Crie uma classe chamada Cliente que deve receber o valor dos campos da classe CadastroForm que deve possuir: 
#### Atributos: 
JLabel para os títulos "Nome", "Idade" e "Sexo" 
JTextField para inserir o nome 
JSpinner para inserir a idade 
Duas opções de JRadioButton para selecionar o sexo (masculino ou feminino) 
JButton para enviar os dados 
#### Funcionalidades: 
Ao clicar no botão de enviar, os dados inseridos no formulário devem ser capturados e exibidos em um JLabel adicional na tela com o resumo das informações. 
O sistema deve garantir que todos os campos sejam preenchidos antes de permitir a submissão. Estruture seu código em classes e métodos apropriados utilizando conceitos de orientação a objetos.

### Exercício 2: Ferramenta de Configuração de Preferências 
Implemente uma ferramenta de configuração de preferências do usuário utilizando os componentes Swing.
Crie uma classe chamada Usuário que salva as configurações e uma classe Preferencias Usuario que deve conter: 
#### Atributos: 
JLabel para os títulos "Tema", "Notificações" e "Volume" 
Um JComboBox com as opções "Claro" e "Escuro" para o tema 
Um JCheckBox para habilitar/desabilitar notificações 
Um JSlider para ajustar o volume (valores de 0 a 100) 
JButton para salvar as preferências 
JTextArea para exibir as preferências salvas 
#### Funcionalidades: 
O usuário deve selecionar o tema, habilitar ou desabilitar notificações, ajustar o volume e, ao clicar no botão "Salvar", as preferências selecionadas devem ser exibidas ao objeto usuário. 
O sistema deve persistir as escolhas até que o programa seja fechado. 
Utilize princípios de encapsulamento e organização modular do código, criando métodos separados para cada funcionalidade relevante. 
Ao selecionar tema claro ou escuro a cor do JFrame deve ser modificada.

# TP II

### ATIVIDADE PRÁTICA 1 - JAVA JDBC
#### Gestão de Tarefas Com Persistência JDBC (Console)  

 Descrição: Crie um sistema de gestão de tarefas onde os usuários podem criar, editar, e excluir tarefas, além de marcar tarefas como concluídas. As tarefas devem ser categorizadas.  
 
 Desafios: Implementar filtros para visualizar tarefas por categoria, status.

### ATIVIDADE PRÁTICA 2 - CONSUMO API
Descrição: Com base no sistema que consome a API que retorna um endereço.Criar consulta automatizada com switch case, while e um ArrayList de Enderecos.  

1. Buscar endereço (Verifica se Já tem na lista antes de buscar no via cep)  
2. Excluir endereços da lista.  
3. Histórico de todo que foram buscados.
