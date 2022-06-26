
<h1 align="center">
📄💾🖥<br>SCC0503 - Algoritmos e Estruturas de Dados II
</h1>
<h2>Exercício 4 - Completando as Quests de um RPG em Profundidade</h2>

Esse exercício consiste na leitura de dados de quests (missões) de um jogo, a construção de um dígrafo com estes dados e a simulação da execução delas através da travessia em profundidade do dígrafo.<br>
Qual é a ideia? Ler o arquivo que contém os vértices e arestas do dígrafo, construir o dígrafo com base nisso (usando a representação que preferir), executar a busca em profundidade a partir de um vértice passado na entrada e imprimir o resultado na tela

## Dados de uma quest

Cada quest, que são os vértices do dígrafo, tem 3 campos:<br>
<ul>
 <li>Nome-String</li>
 <li>Descrição\t-String</li>
 <li>ID\tint</li>
</ul>
O nome e a descrição estão contidos no arquivo de entrada. Porém, o ID é um inteiro que você deve manter como uma variável de controle no seu código: A primeira quest lida e colocada no dígrafo deve receber o ID 0, a segunda o ID 1, e assim sucessivamente.<br>
<b>Importante:</b><br>
Todas as arestas terão peso 1 no dígrafo, portanto, é um dígrafo sem peso! Insira as arestas com peso 1, ou modifique a nossa função de inserção de arestas para não precisar de peso.
<b>Dica:</b><br>
É possível usar uma variável com escopo de classe (static) para realizar essa contagem dentro da classe dos vértices, ou do grafo, ou de outra que você achar mais interessante para a lógica do programa.<br>

## Entradas do exercício
O exercício deverá receber como entrada dados da entrada padrão (System.in), na seguinte formatação:<br>
<ul>
 <li>Nv- Número de vértices que serão lidos a seguir (int)</li>
 <li>\n</li>
</ul>
Por Nv vezes:<br>
<ul>
 <li>Nome da quest (String)</li>
 <li>\n<\li>
 <li>Descrição da quest (String)</li>
 <li>\n</li>
</ul> 
Após Nv quests:<br>
<ul>
 <li>Na - Número de arestas que serão lidas a seguir (int)</li>
 <li>\n</li>
</ul>
Por Na vezes:<br>
<ul>
  <li>ID do vértice de origem da aresta(int)</li>
  <li>ID do vértice de destino da aresta(int)</li>
  <li>\n</li>
</ul>    
Após Na arestas:<br>
<ul>
  <li>ID do vértice inicial da travessia (int)</li>
</ul>
  
## Exemplo de Entrada:
  
## Exemplo de Entrada:
## Exemplo de Entrada:
## Exemplo de Entrada:
## Exemplo de Entrada:
## Exemplo de Entrada:
## Dicas:
Aproveitem da estrutura que desenvolvemos em sala
 Usem a estrutura já existente do vértice para armazenar os dados das quests
 Usem o método ToString() para imprimir os dados das quests na classe adequada
 Leia os dados com o Scanner e não se esqueça do nextLine() e nextInt()
 Usem da nossa Strategy, com a Interface de Travessia, para facilitar criar a travessia em profundidade e sua utilização na main que fizemos em sala
 Polimorfismo salva vidas
