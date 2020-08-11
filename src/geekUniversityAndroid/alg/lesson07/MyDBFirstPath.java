package geekUniversityAndroid.alg.lesson07;

public class MyDBFirstPath extends BreadthFirstPath {

    public MyDBFirstPath(Graph g, int source) {
        super(g, source);
    }

    public MyDBFirstPath(Graph g, int source, boolean bread) {

        super(g, source);
        if (bread == false) {
            clear();
            dfs(g, source);
        }

    }

    private void dfs(Graph g, int v) {

        getMarked()[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!getMarked()[w]) {
                getEdgeTo()[w] = v;
                dfs(g, w);
            }
        }
    }

    private void clear() {
        for (int i = 0; i < getMarked().length; i++) {
            getMarked()[i] = false;
        }
    }

}
