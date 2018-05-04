package atgTEST;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private List<Aresta> arestas;
    private List<Vertice> vertices;
    private List<Aresta> mst;

    //contrutores
    
    public Grafo(ArrayList<Aresta> arestas, ArrayList<Vertice> vertices) {
		this.arestas = arestas;
		this.mst = new ArrayList<Aresta>();
	}

    public int getVertexNumber () {
        return 0;
    }

    public int getEdgeNumber () {
        return 0;
    }

    public float getMeanEdge () {
        return (2 * arestas.size()) / vertices.size();
    }

    public String graphRepresentation (Representacao type) {
        if(type == Representacao.AL) {
            return graphAdjacencyList();
        } else {
            return graphAdjacencyMatrix();
        }
    }

    public String BFS (Vertice v) {
        return null;
    }

    public String DFS (Vertice v) {
        return null;
    }

    public String SCC () {
        return null;
    }

    public String shortestPath(Vertice v1, Vertice v2) {
        return null;
    }

    public String mst () {
        Aresta arestaMenor = arestas.get(0);
    	for (Aresta aresta : arestas) {
			if(aresta.getPeso() < arestaMenor.getPeso() && aresta.getEstadp().equals("preto")) {
				arestaMenor = aresta;
				arestaMenor.setEstadp("verde");
				mst.add(arestaMenor);
			}
		}
    	
    	return null;
    }

    private String graphAdjacencyMatrix () {
        return null;
    }

    private String graphAdjacencyList () {
        return null;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(List<Aresta> arestas) {
        this.arestas = arestas;
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }
}
