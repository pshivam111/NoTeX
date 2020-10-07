public class UnionFind {
    private int  objects[];
    
    public void union(int p, int q){

    }
    public boolean connected(int p,int q){
        return true;
    }
    public int find(int p){
        return 0;
    }
    public int count(){
        return 0;
    }
    public UnionFind(int N){
        objects = new int[N];
        for (int i = 0; i < objects.length; i++) {
            objects[i]=i;
        }
    }

}
