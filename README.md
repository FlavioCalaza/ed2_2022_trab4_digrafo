
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
 <li><b>Nv</b>- Número de vértices que serão lidos a seguir (int)</li>
 <li><b>\n</b></li>
</ul>
Por <b>Nv</b> vezes:<br>
<ul>
 <li>Nome da quest (String)</li>
 <li><b>\n</b></li>
 <li>Descrição da quest (String)</li>
 <li><b>\n</b></li>
</ul> 
Após <b>Nv</b> quests:<br>
<ul>
 <li>Na - Número de arestas que serão lidas a seguir (int)</li>
 <li><b>\n</b></li>
</ul>
Por Na vezes:<br>
<ul>
  <li>ID do vértice de origem da aresta(int)</li>
  <li>ID do vértice de destino da aresta(int)</li>
 <li><b>\n</b></li>
</ul>    
Após <b>Na</b> arestas:<br>
<ul>
  <li>ID do vértice inicial da travessia (int)</li>
</ul>
  
## Exemplo de Entrada:
```
13
Slime Killer
You must kill 10 slimes
The Woodcutter
Find and talk to Greyson, the woodcutter
A New Axe
Search for the legendary axe for Greyson
The Blacksmith
Find and talk to Clint, the blacksmith
Hammer of Doom
Search for the legendary hammer for Clint
Hell's Door
You must find the entrance to the Demon Lord's Castle
Cleaning the House
Kill all the guardians of the Demon Lord
Showdown
Face the last fierce battle and kill the Demon Lord
Elder Care
Help the village Elder
Second Intentions
Make the Elder tell you about the Demon Lord
Hello, World!
Get to the starter town and talk to the villagers
Slime's Revenge
The slime Queen wants revenge for her minions
Duel Time!
Win the card minigame tournament
12
0 11
10 0
0 1
1 2
0 3
3 4
10 12
10 8
8 9
9 5
5 6
6 7
10
```
Dica:<br>
Use a classe Scanner para leitura de dados. A função nextLine() pode ser usada para ler os dados de uma linha toda. Caso precise converter de String para int, é possível fazer uma conversão com as funções da classe Integer. No caso de dois inteiros em uma mesma linha, é possível usar a função nextInt()
## Saídas do Exercício:
Seu programa deverá fazer a busca em profundidade no dígrafo criado a partir dos vértices e arestas dados na entrada, começando pelo vértice passado ao fim da entrada. Ao terminar, ele deve imprimir na saída padrão (System.out) o caminho feito pela busca. A impressão deve conter os dados de cada vértice visitado, na ordem, conforme a formatação a seguir:
## Impressão de uma Quest:
```java
Quest{\n\tID= 'questID'\n\tname= 'questName'\n\tdescription= 'questDescription'\n}\n
```
Assim, todos os vértices visitados devem ser impressos seguindo a formatação acima, na ordem da visita deles pelo algoritmo. Um exemplo de vértice impresso:
```java
Quest{
    ID= '12'
    name= 'Duel Time!'
    description= 'Win the card minigame tournament'
}
```

## Exemplo de Saída:
```java
Quest{
    ID= '0'
    name= 'Slime Killer'
    description= 'You must kill 10 slimes'
}
Quest{
    ID= '1'
    name= 'The Woodcutter'
    description= 'Find and talk to Greyson, the woodcutter'
}
Quest{
    ID= '2'
    name= 'A New Axe'
    description= 'Search for the legendary axe for Greyson'
}
Quest{
    ID= '3'
    name= 'The Blacksmith'
    description= 'Find and talk to Clint, the blacksmith'
}
Quest{
    ID= '4'
    name= 'Hammer of Doom'
    description= 'Search for the legendary hammer for Clint'
}
Quest{
    ID= '5'
    name= 'Hell's Door'
    description= 'You must find the entrance to the Demon Lord's Castle'
}
Quest{
    ID= '6'
    name= 'Cleaning the House'
    description= 'Kill all the guardians of the Demon Lord'
}
Quest{
    ID= '7'
    name= 'Showdown'
    description= 'Face the last fierce battle and kill the Demon Lord'
}
Quest{
    ID= '8'
    name= 'Elder Care'
    description= 'Help the village Elder'
}
Quest{
    ID= '9'
    name= 'Second Intentions'
    description= 'Make the Elder tell you about the Demon Lord'
}
Quest{
    ID= '10'
    name= 'Hello, World!'
    description= 'Get to the starter town and talk to the villagers'
}
Quest{
    ID= '11'
    name= 'Slime's Revenge'
    description= 'The slime Queen wants revenge for her minions'
}
Quest{
    ID= '12'
    name= 'Duel Time!'
    description= 'Win the card minigame tournament'
}
```

## Obrigações:
Você <b>deve</b>:
<ul>
 <li>Deixar o código claro, assim como estamos fazendo em sala</li>
 <li>Usar boas práticas de orientação a objetos.</li>
</ul>

## Dicas:
Aproveitem da estrutura que desenvolvemos em sala
 Usem a estrutura já existente do vértice para armazenar os dados das quests
 Usem o método ToString() para imprimir os dados das quests na classe adequada
 Leia os dados com o Scanner e não se esqueça do nextLine() e nextInt()
 Usem da nossa Strategy, com a Interface de Travessia, para facilitar criar a travessia em profundidade e sua utilização na main que fizemos em sala
 Polimorfismo salva vidas

## Relatório:
O run.codes parece não aceitar mais zip/makefile de Java. Portanto, não faremos a correção automática deste exercício. Em troca, vocês deverão escrever um pequeno relatório e enviar em formato pdf, em um arquivo .zip junto com o código. Aqui mesmo, nesta submissão do run.codes.<br>
Um modelo em LaTeX para usarem de base para o relatório está disponível nos arquivos deste exercício. O relatório não precisa ser extremamente formal, seguindo regras da ABNT ou algo do tipo. Mas deve ser informativo, bem escrito, e sucinto: 3 a 5 páginas (tirando a capa e referências). Com uma divisão de introdução, desenvolvimento e resultados
Na introdução vocês devem escrever brevemente sobre a proposta do exercício (1 ou 2 parágrafos).<br>
Em seguida, na seção de desenvolvimento, devem escrever brevemente sobre como solucionaram o problema: um resumo do algoritmo, alguma modificação da implementação que acham relevante citar, imagens/pseudocódigo do código com alguma alteração/otimização que acham importante, etc (1 a 3 páginas).<br>
Por fim, em resultados devem mostrar imagens, tabelas, etc. que forem necessárias para mostrar a saída do seu programa, e discutir brevemente (1 parágrafo pequeno por imagem/tabela) o que significa aquele resultado apresentado. Deve-se apresentar, ao menos, todos os resultados para cada caso de teste presente aqui no run.codes para o exercício.<br>
