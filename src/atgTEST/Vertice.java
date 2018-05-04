package atgTEST;
public class Vertice {

    private Integer id;
    private Boolean visitado;
    
    public Vertice(int id) {
		this.id = id;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getVisitado() {
        return visitado;
    }

    public void setVisitado(Boolean visitado) {
        this.visitado = visitado;
    }
}