**Fundação Edson Queiroz** <br>
**Universidade de Fortaleza** <br>
**Centro de Ciências Tecnológicas** <br>
**Disciplina: Tecnicas de Programação** <br>
<br>
**Equipe:** <br>
Leonardo Matheus Barros Costa <br>
Rodrigo Vasques Liporace <br> 
Thais Araujo Silveira <br>
<br>

Aplicação desenvolvida para a disciplina de Tecnicas de Programação.
###### Caso queira executá-la, é necessário alterar o usuário e senha do Banco de Dados dentro da classe ```Conexão.java```. Além disso, use o modelo (.mwb) oferecido dentro dos arquivos para criar um novo Banco e insira um usuário com ID = 1 e um Status. Depois é rodar e ser feliz :)


***
### Aplicação
A aplicação foi inspirada pelo modelo de gerenciador de tarefa que usa gamification (muito visto em lojas de aplicativos) 
para incentivar o usuário a cumprir com suas tarefas. Especificamente, esse modelo usa o estilo de jogo RPG (Role Playing Game),
em que o usuário encarna um personagem com atributos como nível, saúde, experiência e moedas de ouro. 

Ao cumprir com uma de suas tarefas o usuário é recompensado com mais experiência e moedas. Ao alcançar _100_ de experiência,
seu nível aumenta e ele é recompensado, também, com pontos de atributos distribuíveis (força, constituição, agilidade e
inteligência). As moedas servem para comprar itens na loja (espadas, armaduras, poções e etc) que dão um valor bônus em seus
atributos distribuíveis.

### Funcionalidades

#### 1. Tarefas
Existem três tipos de tarefas que o usuário pode criar.
  + To-Dos (Afazeres):
    - Um To-Do consiste de uma atividade que é feita somente uma vez e que possui uma data limite para ser feita. Além disso,
    é possível inserir vários lembretes dessa tarefa.
      
  + Dailies (Tarefas diárias):
    - Um Daily, apesar do nome, são tarefas que se repetem não necessáriamente diariamente. Elas possuem uma frêquencia na 
    qual devem ser cumpridas e uma data de início.
  
  + Habits (Hábitos):
    - Um Habit pode ser um hábito positivo que o usuário quer adquirir ou um hábito negativo para se livrar. A cada vez que
    o usuário percebe que está cumprindo com esse hábito, podem ser adicionados pontos positivos e o contrário para pontos
    negativos. 
    
#### 2. Barra de Status:
Consiste de uma barra no canto superior direito da tela onde o usuário pode avaliar seu progresso.
  + HP (Saúde):
    - Quando o usuário prática algum hábito negativo, ele perde 10 de saúde.
  
  + XP (Experiência):
    - A cada tarefa cumprida, o usuário ganha experiência que ao se acumular em 100 pontos é convertida em um novo nível.
    
  + Gold (Moedas):
    - As moedas servem para comprar itens. Adquiri-los estimulam o usuário a cumprir com suas tarefas.

#### 3. Atributos:
Atributos simbolizam o quanto o personagem do usuário está "poderoso". Eles são força (STR), inteligência (INT),
constituição (CON), agilidade (AGI). A cada nível que o usuário passa, ele é recompensado com pontos para serem
distribuídos entre esses atributos da maneira que ele quiser. 

#### 4. Itens:
Os itens que o usuário compra da loja são postos na aba de Itens. Cada um deles possuem bônus separados para cada um
dos atributos (STR, INT, CON E AGI). Caso o usuário não deseje mais o item, pode jogá-lo fora. Mas o dinheiro gasto não será
recuperado e o bônus de atributos ser perdido.

#### 5. Loja: 
Itens podem ser adquiridos na loja em troca de moedas.


### Banco de Dados
Uma das técnicas estudadas durante a disciplina foi a conexão de uma aplicação Java com um Banco de Dados MySQL. Por isso,
o modelo do banco encontra-se no projeto.
