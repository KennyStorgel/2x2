import java.util.LinkedList;

public class ClassGame implements InterfaceGame {

	public boolean isTransitive(Edge x, Edge y, Edge z) {
		int type_of_x = x.getType();
		int type_of_y = y.getType();
		int type_of_z = z.getType();
		
		if(type_of_x == 0) {
			if(type_of_y == type_of_z) {
				return true;
			} else {
				return false;
			}
		} else if (type_of_y == 0) {
			if(type_of_x == type_of_z) {
				return true;
			} else {
				return false;
			}
		} else if (type_of_z == 0) {
			if(type_of_x != type_of_y) {
				return true;
			} else {
				return false;
			}
		} else if (type_of_x == 1) {
			if(type_of_y == type_of_z) {
				return true;
			} else if (type_of_y == -1 && type_of_z == 1) {
				return true;
			} else {
				return false;
			}
		} else {
			if(type_of_y == type_of_z) {
				return true;
			} else if (type_of_y == 1 && type_of_z == -1) {
				return true;
			} else {
				return false;
			}
		}
		
	}
	
	public void updateList(LinkedList<LinkedList<Integer>> list, LinkedList<Integer> list_of_squares) {
		int sizeList = list.size();
		int sizeListSquares = list_of_squares.size();
		
		LinkedList<Integer> tempList;
		boolean contains;
		boolean contains_in_list = false;
		
		int counter = 0;
		
		for(int i=0; i<sizeList; i++) {
			contains = true;
			tempList = list.get(counter);
			for(int j=0; j<tempList.size(); j++) {
				if(list_of_squares.contains(tempList.get(j)) == false) {
					contains = false;
					break;
				}
			}
			if(contains == true) {
				contains_in_list = true;
				break;
			} else {
				contains = true;
				for(int j=0; j<sizeListSquares; j++) {
					if(tempList.contains(list_of_squares.get(j)) == false) {
						contains = false;
						counter++;
						break;
					}
				}
				if(contains == true) {
					list.remove(counter);
				}
			}
			
		}
		if(contains_in_list == false) {
			list.add(list_of_squares);
		}
	}
	
	public int matchSquare(int x, int y, int z, int w) {
		return 0;
	}
	
	public void printList(LinkedList<LinkedList<Integer>> list) {
		LinkedList<Integer> tempList;
		for(int i=0; i<list.size(); i++) {
			tempList = list.get(i);
			for(int j=0; j<tempList.size(); j++) {
				System.out.print(tempList.get(j)+" ");
			}
			System.out.println("");
		}
	}
	
}
