import java.util.LinkedList;


public interface InterfaceGame {

	public boolean isTransitive(Edge x, Edge y, Edge z);
	
	public void updateList(LinkedList<LinkedList<Integer>> list, LinkedList<Integer> list_of_squares);
	
	public int matchSquare(int x, int y, int z, int w);
	
	public void printList(LinkedList<LinkedList<Integer>> list);
	
}
