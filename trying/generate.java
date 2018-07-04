import java.util.ArrayList;
import java.util.Arrays;

public class JavaM {
    
             public int m = 3;
             public int n = 3;
            
            ArrayList<int[][]> list = new ArrayList<>(); 
            int[][] M = new int[m][n];
            int[][] N = new int[m][n];
            public ArrayList returnMatrix()
            {  for (int i = 0; i < M.length*M[0].length; i++)
                {
                    for (int j = 0; j < M.length; j++)
                    {
                        for (int k = 0; k < M[0].length; k++)
                        {
                            M[j][k] = k;
                                   
                            list.add(M);
                        }
                }
                }
            list.addAll(list);
                
                return list;
            
            }
            public static void main(String[] args) {
            
            JavaM jm = new JavaM();
           
           
            ArrayList<int[][]> list = new ArrayList<>();
            list = jm.returnMatrix();
            int ind = 1;
            System.out.println(Arrays.deepToString(list.toArray())+"");
//            for (int x = 0; x < 9; x++)
//            {
//                for (int y = 0; y < jm.M.length; y++)
//                {
//                    for (int z = 0; z < jm.M.length; z++)
//                    {
//                       System.out.print(Arrays.deepToString(list.toArray())+" ");
//                        System.out.println("indeki "+ind);
//                        ind++;
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
    }
}
