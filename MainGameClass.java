import java.util.LinkedList;
import java.util.Scanner;


public class MainGameClass {

	public static void main(String[] args) {
		

		System.out.println("Insert the size of the game: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.close();
		
		ClassGame game = new ClassGame();
		LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
		
		//functions that you can call are
		//game.updateList(list, list_of_squares) first variable is defined above, the second variable
		//										represents the list of squares in current configuration
		//game.isTransitive(a, b, c) where a,b,c are 3 variables of type object Edge
		//game.matchSquare(a, b, c, d) where a,b,c,d are 4 integer variables meaning type of edge {0,1,-1}
		//								in a square, example a forward, b down, c backward, d up edge
		//game.printList(list) where list is the variable defined above that will print all found minimal sets
		
		//LinkedList is easy to use, I will give you the link to the site where it is explained, but you will
		//only need it to create a list of squares in the current configuration that you will then give in the
		//above mentioned updateList method
		
		//you will need to create 2 matrices of type Edge[][] horizontal = new Edge[x][y];
		//										 and Edge[][] vertical = new Edge[x][y];
		//where x,y are the sizes of the matrices, like one is n and the other is n chose 2, you get that
		//in the variable size, which represents the input size for which we want to compute the minimal sets
		//of configuration..you will have to then make 2 for loops to create a new Edge each time and place it
		//in the matrix for both matrices
		
		//class Edge has 2 constructors, one with 2 parameters that represent which edge you mean and 
		//the other where you have 3 parameters, 2 for position as before and 1 for the type of edge
		//you can use any of the 2 that you like or the one that is easiest for some edge you want to create
		//there are also 3 get methods that will return any of those 3 values and 1 set method that can set
		//the type of edge only, since the position will be given in both constructors
		
	}
	
}
