public interface Edges {
    public  int edges1 =0; 
    public  int edges2 =0;
    public static final int edges3 =0;
    public boolean isTransitive() {
       boolean ans = false;
        if (edges1 == e1 && edges2 ==e1) {
            ans = true;
        }
    return ans;
    }


}
