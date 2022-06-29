package grafo;

import java.util.Stack;

public class DepthFirstTraversal extends TraversalStrategy {
    public DepthFirstTraversal(AbstractGraph graph) {
        super(graph);
    }

    @Override
    public void traverseGraph(Vertex source) {
        int sourceIndex = getGraph().getVertices().indexOf(source);
        addToPath(source);
        markVertexAsVisited(sourceIndex);
        setDistanceToVertex(sourceIndex, 0);
        setPredecessorVertexIndex(sourceIndex, -1);
        var adjacentVertex = getGraph().getFirstConnectedVertex(source);
        while (adjacentVertex != null) {
            int adjacentVertexIndex = getGraph().getVertices().indexOf(adjacentVertex);
            if (!hasVertexBeenVisited(adjacentVertexIndex))
                traverseGraph(adjacentVertex);
            adjacentVertex = getGraph().getNextConnectedVertex(source, adjacentVertex);
        }
    }

    public void callDepthFirst(Vertex source) {
        traverseGraph(source);
        var visitedPath = new StringBuilder();
        for (Vertex vertex : traversalPath)
            visitedPath.append(vertex).append("\n");
        var traversalPathString = visitedPath.toString();
        System.out.println(traversalPathString);
    }

    private void updateTraversalInfoForVertex(int newVertexIndex, int previousVertexIndex) {
        var newVertex = getGraph().getVertices().get(newVertexIndex);
        var oldVertex = getGraph().getVertices().get(previousVertexIndex);
        float newDistance = getGraph().getDistance(oldVertex, newVertex);
        float distance = getDistanceToVertex(previousVertexIndex) + newDistance;
        addToPath(newVertex);
        markVertexAsVisited(newVertexIndex);
        setDistanceToVertex(newVertexIndex, distance);
        setPredecessorVertexIndex(newVertexIndex, previousVertexIndex);
        setSuccessorVertexIndex(previousVertexIndex, newVertexIndex);
    }
}
