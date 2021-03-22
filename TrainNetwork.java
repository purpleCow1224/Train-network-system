public class TrainNetwork {
	public static void main(String[] args) {
		Graph trainNetwork = new Graph(true, true);
    Vertex LA = trainNetwork.addVertex("Los Angeles");
    Vertex SA = trainNetwork.addVertex("San Francisco");
    Vertex NY = trainNetwork.addVertex("New York");
    Vertex ATL = trainNetwork.addVertex("Atlanta");
    Vertex DV = trainNetwork.addVertex("Denver");
    Vertex CAL = trainNetwork.addVertex("Calgary");

    trainNetwork.addEdge(SA, LA, 400);
    trainNetwork.addEdge(LA, SA, 400);
    trainNetwork.addEdge(NY, DV, 1800);
    trainNetwork.addEdge(DV, NY, 1800);
    trainNetwork.addEdge(CAL, DV, 1000);
    trainNetwork.addEdge(DV, CAL, 1000);
    trainNetwork.addEdge(LA, ATL, 2100);
    trainNetwork.addEdge(ATL, LA, 2100);

    trainNetwork.removeEdge(NY, DV);
    trainNetwork.removeEdge(DV, CAL);
    trainNetwork.removeEdge(CAL, DV);
    
    trainNetwork.removeVertex(CAL);
    trainNetwork.print();
    
	}
}