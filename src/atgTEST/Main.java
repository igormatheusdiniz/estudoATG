package atgTEST;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Vertice> vertices = new ArrayList<Vertice>();
		ArrayList<Aresta> arestas = new ArrayList<Aresta>();
		
		Vertice v1 = new Vertice(1);
		Vertice v2 = new Vertice(2);
		Vertice v3 = new Vertice(3);
		Vertice v4 = new Vertice(4);
		Vertice v5 = new Vertice(5);
		Vertice v6 = new Vertice(6);
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		
		
		Aresta aresta1 = new Aresta(v1,v2,1);
		Aresta aresta2 = new Aresta(v2,v3,3);
		Aresta aresta3 = new Aresta(v2,v4,6);
		Aresta aresta4 = new Aresta(v3,v5,1);
		Aresta aresta5 = new Aresta(v4,v5,2);
		Aresta aresta6 = new Aresta(v4,v2,2);
		Aresta aresta7 = new Aresta(v4,v6,2);
		Aresta aresta8 = new Aresta(v5,v6,7);
		
		arestas.add(aresta1);
		arestas.add(aresta2);
		arestas.add(aresta3);
		arestas.add(aresta4);
		arestas.add(aresta5);
		arestas.add(aresta6);

		Grafo grafo = new Grafo(arestas, vertices);
		

		
	}

}
