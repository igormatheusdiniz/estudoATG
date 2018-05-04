package atgTEST;

public class Aresta {

    private Vertice verticeInicial;
    private Vertice verticeFinal;
    private float peso;
    private String estado;
    
    public Aresta(Vertice vertice1, Vertice vertice2, float peso) {
		this.verticeInicial = vertice1;
		this.verticeFinal = vertice2;
		this.peso = peso;
		this.estado = "preto";
	}
    
    public Vertice getVerticeInicial() {
        return verticeInicial;
    }

    public void setVerticeInicial(Vertice verticeInicial) {
        this.verticeInicial = verticeInicial;
    }

    public Vertice getVerticeFinal() {
        return verticeFinal;
    }

    public void setVerticeFinal(Vertice verticeFinal) {
        this.verticeFinal = verticeFinal;
    }

    public float getPeso() {
        return peso;
    }
    
    public String getEstadp(){
    	 return this.estado;
    }
    
    public void setEstadp(String estado ){
   	 	this.estado = estado; 	
   }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}