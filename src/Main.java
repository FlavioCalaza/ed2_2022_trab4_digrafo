import grafo.Vertex;
import grafo.DigraphList;
import grafo.DepthFirstTraversal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // O exercício deverá receber como entrada dados da entrada padrão (System.in)
        Scanner scanner = new Scanner(System.in); // Entrada no padrão solicitado
        int Nv = scanner.nextInt(); // Nv- Número de vértices que serão lidos a seguir (int)
        scanner.nextLine(); // ler próxima linha
        ArrayList<Vertex> quests = new ArrayList<>(); // Criação de uma lista para juntar todas as 'structs' de quest
        for (int i = 0; i < Nv; i++) { // Interação para ler informações de cada vertice
            // "i" irá assumir do ID da quest (int)
            String Name = scanner.nextLine(); // Nome da quest (String)
            String Description = scanner.nextLine(); // Descrição da quest (String)
            Vertex vertex = new Vertex(i, Name, Description); // Inserindo dados no modelo de vertice (semelhante a struct)
            quests.add(vertex); // Adicionando modelo vértice na lista de quests
        }
        DigraphList digraphList = new DigraphList(quests); // Criação de DigraphList (disp pelo professor c/ pequenas mudanças)
        int Na = scanner.nextInt(); // Na - Número de arestas que serão lidas a seguir (int)
        for (int i = 0; i < Na; i++) { // Interação para ler origens e destinos de cada vértice
            int verticeOrigem = scanner.nextInt(); // ID do vértice de origem da aresta(int)
            int verticeDestino = scanner.nextInt(); // ID do vértice de destino da aresta(int)
            digraphList.addEdge(quests.get(verticeOrigem), quests.get(verticeDestino)); // Inserindo infos de vertices
        }
        int originVertex = scanner.nextInt(); // ID do vértice inicial da travessia (int)
        DepthFirstTraversal depthFirstTraversal = new DepthFirstTraversal(digraphList); //  Busca em largura disp pelo professor
        depthFirstTraversal.traverseGraph(quests.get(originVertex)); // Implementação da estratégia
    }
}
