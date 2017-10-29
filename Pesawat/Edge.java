public class Edge {
	Vertex dari;
	Vertex ke;

	public Edge(Vertex d, Vertex k){
		dari=d;
		ke=k;
	}

	public Vertex getKe(){
		return ke;
	}

	public Vertex getDari(){
		return dari;
	}
}